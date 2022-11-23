package ch3_02;

public class Customer {
	protected int id;
	protected String name;
	protected String grade;
	protected int bonusPoint;
	protected double bonusRatio;
	
	public Customer (String name, int id) {
		this.name = name;
		this.id = id;
		this.grade = "SILVER";
		this.bonusPoint = 1000;
		this.bonusRatio = 0.01;
	}
	
	public int calcPrice(int price) {
		this.bonusPoint += price * bonusRatio;
		return this.bonusPoint;
	}
	
	public void showCustomerInfo() {
		System.out.printf("%s 님의 등급은 %s 이고, 포인트는 %d 입니다.\n",this.name, this.grade, this.bonusPoint);
	}
}
