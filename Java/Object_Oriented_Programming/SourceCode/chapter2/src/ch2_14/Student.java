package ch2_14;

public class Student {
	private String name;
	private int money;
	
	public Student(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	
	public void takeBus(Bus bus) {
		System.out.printf("%s는 %d번 버스에 탑승했다. (- %d원)\n",this.name, bus.getBus(), bus.getCost());
		this.money -= bus.take();
	}
	
	public void takeSubway(Subway subway) {
		System.out.printf("%s는 %d번 지하철에 탑승했다. (- %d원)\n",this.name, subway.getSubway(), subway.getCost());
		this.money -= subway.take();
	}
	
	public void showInfo() {
		System.out.printf("%s 님의 잔돈 : %d원\n", this.name, this.money);
	}

}
