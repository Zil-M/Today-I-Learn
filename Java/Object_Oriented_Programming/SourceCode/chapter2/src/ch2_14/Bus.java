package ch2_14;

public class Bus {
	private int busNumber;
	private int passengerCount;
	private int money;
	private final int COST = 1000;
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	public int getBus() {
		return this.busNumber;
	}
	
	public int getCost() {
		return this.COST;
	}
	
	public int take() {
		this.money += this.COST;
		passengerCount++;
		
		return this.COST;
	}
	
	public void showBusInfo() {
		System.out.printf("%d 번 버스의 총 이용객은 %d 명이고, 수익은 %d 이다.", this.busNumber, this.passengerCount, this.money);
	}

}
