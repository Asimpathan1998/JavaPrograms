package practice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class EmployeeDetail{
	public void detail() {
		List<String> EmployeeName = new ArrayList<String>();
		EmployeeName.add("Andrew");
		EmployeeName.add("Max");
		EmployeeName.add("Taylor");
		EmployeeName.add("Selena");
		EmployeeName.add("Justin");
		
		System.out.println("Employee: " + EmployeeName);
	}
	public void managerDetail() {
		List<String> manager = new ArrayList<String>();
		manager.add("Steve");
		
		System.out.println("Manager:" + manager);
	}
	public void companyCeo(){
		List<String> ceo = new LinkedList<String>();
		
		ceo.add("Elon Musk");
		
		System.out.println("CEO: " + ceo);
		
		ceo.clear();
		ceo.add("Sundar Pichai");
		System.out.println("New CEO is: " + ceo);
	}
}


public class ArrayListPractice {

	public static void main(String[] args) {
		EmployeeDetail emp = new EmployeeDetail();
		 emp.detail();
		 emp.managerDetail();
		 emp.companyCeo();
	}

}
