package ch2_19_singleton_practice;

public class CarFactory {
	private static CarFactory instance = new CarFactory();
	private static int carNumberIndex = 10000;
	
	private CarFactory() {}
	
	public static CarFactory getInstance() {
		if(instance == null) {
			instance = new CarFactory();
		}
		
		return instance;
	}
	
	
	public Car createCar() {
		carNumberIndex++;
		Car newCar = new Car(carNumberIndex);
		
		return newCar;
	}
}
