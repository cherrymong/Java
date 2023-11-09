package classtest;
class Order{
	// 주문번호, 주문자 아이디, 주문 날짜, 주문자 이름, 주문 상품 번호, 배송 주소
	// 201803120001, abc123, 2018년3월12일, 홍길동, PD0345-12, 서울시 영등포구 여의도동 20번지
	// 기능 : 모든 내용을 출력하는 기능 (showOrderInfo)
	
	String ordernumber;
	String id;
	String orderdate;
	String name;
	String goodsid;
	String address;
	public Order() {} // 기본 생성자 : 작성하지 않더라도 실행 가능.(프로그램이 생성될 때 컴퓨터가 생성해 주기 때문에)
	// 생성자 : 인스턴스를 생성할 때 사용 되는 메서드
	// 반드시 클래스 이름으로 만들어야 하며, 생성자를 작성하면 기본 생성자는 없어지게 됨.
	// 여러 개의 생성자 작성 방법 (생성자 오버로드)
	// 생성자의 매개변수의 갯수를 다르게 한다.
	// 생성자의 매개변수자료형을 다르게 한다. (같은 자료형에 매개변수의 이름만 다른 것을 만드는 것은 불가능)
	public Order(String ordernumber,String id,
			String orderdate,String name,
			String goodsid,String address) {
		this.ordernumber = ordernumber;
		this.id = id;
		this.orderdate = orderdate;
		this.name = name;
		this.goodsid = goodsid;
		this.address = address;
	}
	void showOrderInfo() {
		System.out.println("주문번호 : " +ordernumber);
		System.out.println("주문자 아이디 : " +id);
		System.out.println("주문 날짜 : " + orderdate);
		System.out.println("주문자 이름 : " + name);
		System.out.println("주문 상품 번호 : " + goodsid);
		System.out.println("배송 주소 : " +address);
	}
	// 여러 개의 메서드 작성 방법 (메서드 오버로드)
	// 메서드의 매개변수의 갯수를 다르게 한다.
	// 메서드의 매개변수자료형을 다르게 한다. (같은 자료형에 매개변수의 이름만 다른 것을 만드는 것은 불가능)
	int add(int x, int y) {
		return x+y;
	}
	long add(long x) {
		return x+x;
	}
	int add(int x) {
		return x+x;
	}
	long add(long x, int y) {
		return x+y;
	}
	int add(int x, int y, int z) {
		return x+y+z;
	}
	
}
public class OrderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Order order1 = new Order();
		order1.ordernumber = "201803120001";
		order1.id = "abc123";
		order1.orderdate = "2018년3월12일";
		order1.name = "홍길동";
		order1.goodsid = "PD-0345-12";
		order1.address = "서울시 영등포구 여의도동 20번지";
		// ctrl + 메서드 이름 클릭 : 메서드가 선언 되어 있는 코드로 이동.
		order1.showOrderInfo();
		
		Order order2 = new Order("201803120002", "def123", "2023년11월03일", "이순신", "PD7890-54", "부산시 부산진구");
		order2.showOrderInfo();
	}

}
