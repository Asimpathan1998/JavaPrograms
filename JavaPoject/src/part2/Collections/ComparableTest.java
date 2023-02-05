package part2.Collections;

import java.util.*;

class StudentInfo implements Comparable<StudentInfo> {
	int rollno;
	String name;
	int age;

	StudentInfo(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}

	public int compareTo(StudentInfo st) {
		if (name == st.name)
			return 0;
		else if (rollno > st.rollno)
			return 1;
		else
			return -1;
	}
	
}

public class ComparableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<StudentInfo> list = new ArrayList<StudentInfo>();
		list.add(new StudentInfo(103,"Vijay",23));
		list.add(new StudentInfo(101,"Ajay",27));  
		list.add(new StudentInfo(102,"Jai",21));
		
		Collections.sort(list);
		for(StudentInfo s: list) {
			System.out.println(s.rollno + " " + s.name + " " + s.age);
		}
	}

}
