package ch2_11_encapsulation;

public class ReportGenerator {
	StringBuffer buffer = new StringBuffer();
	
	private String title;
	private String line;
	
	ReportGenerator(){
		this.line = "--------------------\n";
		this.title = "이름\t주소\t전화번호\n";
	}
	
	private void makeHeader() {
		buffer.append(line);
		buffer.append(title);
		buffer.append(line);
	}
	
	private void makeBody() {
		buffer.append("James\t");
		buffer.append("Seoul\t\t");
		buffer.append("010-1234-5678\n");
		
		buffer.append("Tomas\t");
		buffer.append("NewYork\t");
		buffer.append("010-9876-5432\n");
	}
	
	private void makeFooter() {
		buffer.append(line);
	}
	
	public String getReport() {
		makeHeader();
		makeBody();
		makeFooter();
		
		return buffer.toString();
	}
}
