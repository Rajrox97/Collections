package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class AscendingStudentComparator implements Comparator<Student>{

	@Override
	public int compare(Student student1,Student student2) {
		// TODO Auto-generated method stub
		return Integer.compare(student1.getId(),student2.getId()); // This comparator vs Comparable example is showing both the compareTo and compare method implementations.
//		return student2.getName().compareTo(student1.getName());// youtube's Apni Kaksha video has better and clearer explanation.
	}
	
}

public class StudentsCollectionRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> students = List.of(new Student(1,"Ranga"),(new Student(3,"Kanga")), (new Student(2,"Tanga")));
		List<Student> studentsAl = new ArrayList<>(students);
		
		System.out.println(studentsAl);
		
		Collections.sort(studentsAl);
		System.out.println("Desc"+studentsAl);
	
//		Collections.sort(studenstAl, new AscendingStudentComparator());
//		System.out.println("Desc"+studenstAl);
		
		studentsAl.sort(new AscendingStudentComparator());
		System.out.println("Ascending student comparator"+studentsAl);
	}

}
