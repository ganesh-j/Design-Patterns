package creational.prototype;

import java.util.List;

public class TestPrototype {

	public static void main(String[] args) {
			
		EmpDBDetails ed = new EmpDBDetails();
		List<Employee> ed1 = ed.loadFromDB();
		System.out.println(ed1);
		List<Employee> ec1 = (List<Employee>)ed.clone();
		System.out.println(ec1);
		ec1.remove(1);
		System.out.println(ec1);
		List<Employee> ec2 = (List<Employee>)ed.clone();
		System.out.println(ec2);
		
	}

}
