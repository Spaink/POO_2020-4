package aula12.ex_sala_aula12.sigaa.salaaula.composite.employee;

public interface Employee {
	String name = null;
	double salary = 0d;
	void add(Employee employee);
	void remove(Employee employee);
	Employee getChild(int i);
	String getName();
	double getSalary();
	void print();
}
