package ch2_06;

public class People {
	
	int height;
	int weight;
	int age;
	String name;
	
	public People(int height, int weight, int age, String name) {
		this.height = height;
		this.weight = weight;
		this.age = age;
		this.name = name;
	}
	
	public void showPeopleInfo() {
		System.out.printf("키 : %d, 몸무게 : %d, 이름 : %s, 나이 : %d", height, weight, name, age);
	}

}
