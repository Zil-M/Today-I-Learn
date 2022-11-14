package ch2_14;

public class Subway {
	private int lineNumber;
	private int passengerCount;
	private int money;
	private final int COST = 1200;
	
	public Subway(int lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	public int getSubway() {
		return this.lineNumber;
	}
	
	public int getCost() {
		return this.COST;
	}
	
	public int take() {
		this.money += this.COST;
		passengerCount++;
		
		return this.COST;
	}
	
	public void showSubwayInfo() {
		System.out.printf("%d호선 지하철의 총 이용객은 %d 명이고, 수익은 %d 이다.", this.lineNumber, this.passengerCount, this.money);
	}


}
