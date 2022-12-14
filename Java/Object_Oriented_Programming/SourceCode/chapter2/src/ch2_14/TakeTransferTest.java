package ch2_14;

public class TakeTransferTest {

	public static void main(String[] args) {
		Student studentJames = new Student("James", 5000);
		Student studentTomas = new Student("Tomas", 10000);
		
		Bus bus28 = new Bus(28);
		Bus bus101 = new Bus(101);
		
		Subway subway1 = new Subway(1);
		
		
		studentJames.takeBus(bus101);
		studentJames.showInfo();
		
		studentJames.takeSubway(subway1);
		studentJames.showInfo();
		
		studentTomas.takeBus(bus28);
		studentTomas.takeBus(bus101);
		studentTomas.takeSubway(subway1);
		studentTomas.showInfo();
	}
}