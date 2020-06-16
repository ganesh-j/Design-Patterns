package creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class EmpDBDetails  implements Cloneable{

	ArrayList<Employee> list = new ArrayList<>();
	
	public EmpDBDetails(ArrayList<Employee> list) {
		super();
		this.list = list;
	}

	public EmpDBDetails() {
		// TODO Auto-generated constructor stub
	}

	public List<Employee> loadFromDB() {
		Employee e1= new Employee(1, "GK");
		Employee e2= new Employee(2, "RK");
		Employee e3= new Employee(2, "MK");
		list.add(e1);
		list.add(e3);
		list.add(e2);
		return list;
	}
	
	public Object clone() {
		ArrayList<Employee> clonedList = new ArrayList<>();
		for(Employee e: list) {
			clonedList.add(e);
		}
		
		return clonedList;
		
	}
	
	
	
}
