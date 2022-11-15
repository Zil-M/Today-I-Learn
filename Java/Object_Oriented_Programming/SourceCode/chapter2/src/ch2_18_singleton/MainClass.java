package ch2_18_singleton;

public class MainClass {

	public static void main(String[] args) {
		Company company1 = Company.getInstance();
		Company company2 = Company.getInstance();
		Company company3 = Company.getInstance();
		
		System.out.println(company1);
		System.out.println(company2);
		System.out.println(company3);
	}
}
