package ch2_21_objectArray;

public class BookMainClass {
	
	public static void testBookList(Book[] library) {
		
		String[] titles = {"제목1","제목2","제목3","제목4","제목5"};
		String[] authors = {"저자1","저자2","저자3","저자4","저자5"};
		
		for(int i =0; i < library.length; i++) {
			library[i] = new Book(titles[i],authors[i]);
		}
		
		for(Book book : library) {
			book.showBookInfo();
		}

	}

	public static void main(String[] args) {
		Book[] library = new Book[5];
		
		testBookList(library);

	}

}
