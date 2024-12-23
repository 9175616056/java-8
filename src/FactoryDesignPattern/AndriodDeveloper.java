package FactoryDesignPattern;

public class AndriodDeveloper implements Employee{

	@Override
	public int salary() {
		System.out.println("Getting Android Developer salary");
		return 50000;
	}

}
