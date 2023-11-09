package statictest;

public class Student {
	// static : 정적인, 프로그램이 실행될 때 함께 선언
	// 인스턴스를 생성하지 않아도 사용할 수 있는 변수나 메서드
	// static 변수, 정적 변수
	public static int serialNum = 1000;
	public int studentID;
	public String studentName;
	public int grade;
	public String address;
	public int studentCardNum;
	
	public Student() {
		serialNum++;
		studentID = serialNum;
		studentCardNum = studentID+100;
	}
	
	// static 메서드, 정적 메서드
	public static int getSerialNum() {
		return serialNum;
	}
	
	// 일반 메서드에서는 static 변수를 사용할 수 있음
	public void showInfo() {
		System.out.println(serialNum + "," + studentName);
	}
	// static 메서드에서는 일반 멤버 변수를 사용할 수 없음
	public static void showInfo2() {
		//System.out.println(serialNum + "," + studentName);
		System.out.println(serialNum);
	}
	
}
