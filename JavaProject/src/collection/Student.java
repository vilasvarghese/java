package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Student implements Comparable<Student> {
	private int rollNo = 0;
	private int marks = 0;
	private String name;

	public Student(int rollNo, int marks, String name) {
		super();
		this.rollNo = rollNo;
		this.marks = marks;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", marks=" + marks + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Student s) {
		return this.marks > s.marks ? -1 : 1;
	}
	
	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student(1, 73, "Vilas"));
		studentList.add(new Student(2, 81, "Siji"));
		studentList.add(new Student(3, 98, "Mariam"));
		studentList.add(new Student(4, 94, "Hannah"));
		studentList.add(new Student(5, 99, "Sarah"));
		studentList.add(new Student(6, 93, "Elishbah"));
		studentList.add(new Student(7, 92, "Augen"));
		
		Collections.sort(studentList);
		for (Student s : studentList) {
			System.out.println(s);
		}
	}
}