package exam;

public class Director extends Employee {

	public Director(String name, int salaty) {
		super(name, salaty);
	}

	@Override
	public void print() {
		System.out.println(name + "\t" + salary+"(9000)");
	}
}
