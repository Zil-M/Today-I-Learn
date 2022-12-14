package ch2_16_static;

public class PostGenerator {
	private static int postIndex = 0;
	private int postID;
	private String postName;
	
	public PostGenerator(String postName) {
		postIndex++;
		this.postID = postIndex;
		this.postName = postName;
	}
	
	public static void setPostIndex(int index) {
		PostGenerator.postIndex = index;
	}

	public void showPostInfo() {
		System.out.printf("'%s' 의 게시글 번호는 %d 이다.\n",this.postName, this.postID);
	}
	
	public static void main(String[] args) {
		System.out.println(PostGenerator.postIndex);
		
		PostGenerator post1 = new PostGenerator("가입인사");
		PostGenerator.setPostIndex(10);
		PostGenerator post2 = new PostGenerator("static 질문글");
		PostGenerator post3 = new PostGenerator("테스트코드");
		
		post1.showPostInfo();
		post2.showPostInfo();
		post3.showPostInfo();
	}
}
