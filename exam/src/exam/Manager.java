package exam;

public class Manager extends Employee {

	public Manager(String name, int salaty) {
		super(name, salaty);
	}

	@Override
	public void print() {
		System.out.println(name + "\t" + salary+"(3000)");
	}

}
