package aula12.ex_sala_aula12.sigaa.salaaula.composite.employee;

public abstract class GenericEmployee implements Employee {

	protected String name;
	protected double salary;
	
	public GenericEmployee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}
	
	@Override
	public abstract void add(Employee employee);
	
	@Override
	public abstract void remove(Employee employee);
	
	@Override
	public abstract Employee getChild(int i);

	@Override
	public String getName() {
		return name;
	}

	@Override
	public double getSalary() {
		return salary;
	}

	@Override
	public abstract void print();
}
