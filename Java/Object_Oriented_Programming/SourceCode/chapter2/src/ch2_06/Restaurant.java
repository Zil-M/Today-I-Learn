package ch2_06;

public class Restaurant {
	int orderId;
	int orderDate;
	int orderTime;
	int orderPrice;
	int menuNumber;
	int phoneNumber;
	String orderAddress;
	
	public Restaurant(int orderId, int orderDate, int orderTime, int orderPrice, int menuNumber, int phoneNumber, String orderAddress) {
		this.orderId = orderId;
		this.orderDate = orderDate;
		this.orderTime = orderTime;
		this.orderPrice = orderPrice;
		this.menuNumber = menuNumber;
		this.phoneNumber = phoneNumber;
		this.orderAddress = orderAddress;
	}
	
	
	public void showOrderRestaurant() {
		System.out.println();
		System.out.printf("주문 접수 번호 : %d\n", this.orderId);
		System.out.printf("주문 휴대폰 번호 : %d\n", this.phoneNumber);
		System.out.printf("주문 집 주소 : %s\n", this.orderAddress);
		System.out.printf("주문 날짜 : %d\n", this.orderDate);
		System.out.printf("주문 시간 : %d\n", this.orderTime);
		System.out.printf("주문 가격 : %d\n", this.orderPrice);
		System.out.printf("메뉴 번호 : %d", this.menuNumber);
	}

}
