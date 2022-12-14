package ch2_12_this;

public class GameUser {
	private String userNickname;
	private int userLevel;
	private int userExp;
	
	public GameUser() {
		this("GeustUser", 1);
	}
	
	public GameUser(String userNickname, int userLevel) {
		this.userNickname = userNickname;
		this.userLevel = userLevel;
		this.userExp = 0;
	}
	
	public void showUserInfo() {
		System.out.printf("%s, %d, %d\n", userNickname, userLevel, userExp);
	}
	
	public GameUser getGameUserObject() {
		return this;
	}
	
	public static void main(String[] args) {
		GameUser user1 = new GameUser();
		user1.showUserInfo();
		System.out.println(user1.getGameUserObject());
	}
}
