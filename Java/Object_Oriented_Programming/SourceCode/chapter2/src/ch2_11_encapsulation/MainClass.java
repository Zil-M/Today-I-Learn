package ch2_11_encapsulation;

public class MainClass {

	public static void main(String[] args) {
		ReportGenerator reportBuilder = new ReportGenerator();
		String result = reportBuilder.getReport();
		
		System.out.println(result);
	}

}
