package array;

public class EnhancedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strArr = {"Java","Android","C","Python","HTML"};
//		for(배열의 자료형 변수 이름 : 배열이름) {
//			실행문;
//		}
		for(String str : strArr) {
			System.out.println(str);
		}
		
		Book[] books = new Book[3];
		books[0] = new Book("책이름 1","저자 1");
		books[1] = new Book("책이름 2","저자 2");
		books[2] = new Book("책이름 3","저자 3");
		for(Book book : books) {
			book.showInfo();
		}
	}

}