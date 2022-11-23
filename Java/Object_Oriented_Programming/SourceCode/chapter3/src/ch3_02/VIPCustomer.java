package ch3_02;

public class VIPCustomer extends Customer{

	public VIPCustomer(String name, int id) {
		super(name,id);
		this.grade = "VIP";
		this.bonusPoint = 5000;
		this.bonusRatio = 0.1;
	}
}
