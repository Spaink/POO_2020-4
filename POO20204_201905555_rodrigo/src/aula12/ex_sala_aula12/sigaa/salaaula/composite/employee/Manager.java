package aula12.ex_sala_aula12.sigaa.salaaula.composite.employee;

import java.util.ArrayList;
import java.util.List;

public class Manager extends GenericEmployee implements Employee {

	List<Employee> employees = new ArrayList<Employee>();
	
	public Manager(String name, double salary) {
		super(name, salary);
	}
	
	@Override
	public void add(Employee employee) {
		employees.add(employee);
	}

	@Override
	public void remove(Employee employee) {
		employees.remove(employee);

	}

	@Override
	public Employee getChild(int i) {
		return employees.get(i);
	}

	@Override
	public void print() {
		System.out.println("-------------");
		  System.out.println("Name ="+getName());
		  System.out.println("Salary ="+getSalary());
		  System.out.println("-------------");
		  
		  System.out.println("Gerenciados por: " + getName());
		  for(Employee e : employees){
			  e.print();
		  }
	}

}
