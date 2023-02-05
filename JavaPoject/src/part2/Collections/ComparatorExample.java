package part2.Collections;

import java.util.*;

class Student {
	int rollno;
	int age;
	String name;

	// Constructor
	public Student(int rollno, String name, int age) {

		// This keyword refers to current instance itself
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
}
class AgeComparator implements Comparator<Student> {

	public int compare(Student o1, Student o2) {
		
		  Student s1 = o1; 
		  Student s2 = o2;
		 
		
		  if (s1.age == s2.age)
			  return 0;
		  else if (s1.age > s2.age) 
			  return 1;
		  else
		  return -1;	
	}
}

class NameComparator implements Comparator<Object> {
	public int compare(Object o1, Object o2) {
		Student s1 = (Student) o1;
		Student s2 = (Student) o2;

		return s1.name.compareTo(s2.name);
	}
}

//Class 4
//Main class
class ComparatorExample {

	// Main driver method
	public static void main(String[] args) {

		// Creating an empty ArrayList of Student type
		ArrayList<Student> al = new ArrayList<Student>();

		// Adding entries in above List
		// using add() method

		al.add(new Student(101, "Vijay", 23));
		al.add(new Student(106, "Ajay", 27));
		al.add(new Student(105, "Jai", 21));

		System.out.println("Sorting by Name:");

		Collections.sort(al, new NameComparator());
		Iterator<Student> itr = al.iterator();
		while (itr.hasNext()) {
			Student st = (Student) itr.next();
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}
		System.out.println("______________________");
		System.out.println("Sorting by age:");
		
		Collections.sort(al, new AgeComparator());
		
		Iterator<Student> itr2 = al.iterator();
		while (itr2.hasNext()) {
			Student st = (Student) itr2.next();
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}
	}
}
