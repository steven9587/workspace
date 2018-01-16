package exam;

public class Employee {
	int salary;
	String name;
	
	public Employee(String name, int salaty) {
		this.salary = salaty;
		this.name = name;
	}
		
	public void print() {
		System.out.println(name+"\t"+salary);
	}
	
}
