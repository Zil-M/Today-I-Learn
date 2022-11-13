package ch2_12_this;

public class GameUser {
	private String userNickname;
	private int userLevel;
	private int userExp;
	
	public GameUser(String userNickname, int userLevel) {
		this.userNickname = userNickname;
		this.userLevel = userLevel;
		this.userExp = 0;
	}
	
	public void showUserInfo() {
		System.out.printf("%s, %d, %d", userNickname, userLevel, userExp);
	}
	
	public static void main(String[] args) {
		GameUser user1 = new GameUser("유저1", 1);
		user1.showUserInfo();
	}
}
