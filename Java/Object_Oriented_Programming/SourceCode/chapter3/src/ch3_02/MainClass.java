package ch3_02;

public class MainClass {

	public static void main(String[] args) {
		
		Customer user1 = new Customer("고객1", 1001);
		user1.showCustomerInfo();
		System.out.printf("보유 적립금 : %d 원 \n", user1.calcPrice(1000));
		
		
		VIPCustomer vip1 = new VIPCustomer("부자1", 2001);
		vip1.showCustomerInfo();
		System.out.printf("보유 적립금 : %d 원 \n", vip1.calcPrice(1000));
	}

}