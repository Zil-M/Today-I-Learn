package ch2_06;

public class TestMainClass {

	public static void main(String[] args) {
		/*
		final int HEIGHT = 180;
		final int WEIGHT = 78;
		final int AGE = 37;
		String NAME = "Tomas";
		
		People user1 = new People(HEIGHT, WEIGHT, AGE, NAME);
		user1.showPeopleInfo();
		*/
		
		
		
		final int ORDER_ID = 202211101;
		final int PHONE_NUMBER = 01023450001;
		final int ORDER_DATE = 20221110;
		final int ORDER_TIME = 130285;
		final int ORDER_PRICE = 35000;
		final int MENU_NUMBER = 03;
		final String ORDER_ADDRESS = "서울시 행복구";
		
		
		Restaurant market1 = new Restaurant(ORDER_ID,ORDER_DATE,ORDER_TIME,ORDER_PRICE,MENU_NUMBER,PHONE_NUMBER,ORDER_ADDRESS);
		market1.showOrderRestaurant();
	}

}
