package exam;

public class Main {

	public static void main(String[] args) {
		Employee Jack = new Employee("Jack",25000);
		Employee Mary = new Employee("Mary",28000);
		Employee Eddie = new Employee("Eddie",45000);
		Manager Teddy = new Manager("Teddy", 55000);
		Employee Danny = new Employee("Danny",31000);
		Employee Andy = new Employee("Andy",52000);
		Director Frank = new Director("Frank", 75000);
		
		Jack.print();
		Mary.print();
		Eddie.print();
		Teddy.print();
		Danny.print();
		Andy.print();
		Frank.print();
		
		
	}

}
