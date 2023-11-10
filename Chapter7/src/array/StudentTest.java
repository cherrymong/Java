package array;
class student2{
	private int studentID;
	private String studentName;
	
	public student2(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;		
	}
	
	public void showInfo() {
		System.out.println(studentID+","+studentName);
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
}

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// student 클래스를 만들고 멤버 변수로 studentID, studentName을 선언합니다.
		// StudentArr 배열에 1001,Tomas 1002,James 1003,Edward를 저장하고 출력하는 프로그램을 만들어 보세요.
		// --- 출력 결과 ---
		// 1001,Tomas
		// 1002,James
		// 1003,Edward
		
		
		student2[] students = new student2[3];
		
		students[0] = new student2(1001,"Tomas");
		students[1] = new student2(1002,"James");
		students[2] = new student2(1003,"Edward");
		
		for(int i=0; i<students.length; i++) {
			students[i].showInfo();
		}
		
		
		
		
		

	}

}
