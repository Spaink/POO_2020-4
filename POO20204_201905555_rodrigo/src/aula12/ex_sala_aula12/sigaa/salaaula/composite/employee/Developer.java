package aula12.ex_sala_aula12.sigaa.salaaula.composite.employee;

public class Developer extends GenericEmployee implements Employee {

	
	public Developer(String name, double salary) {
		super(name, salary);
	}

	@Override
	public void add(Employee employee) {
		System.out.println("this is leaf node so this method is not applicable to this class.");
	}

	@Override
	public void remove(Employee employee) {
		System.out.println("this is leaf node so this method is not applicable to this class.");
	}

	@Override
	public Employee getChild(int i) {
		System.out.println("this is leaf node so this method is not applicable to this class.");
		return null;
	}

	@Override
	public void print() {
		System.out.println("-------------");
	    System.out.println("Name ="+getName());
	    System.out.println("Salary ="+getSalary());
	    System.out.println("-------------");
	}

}
