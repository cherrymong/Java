package access;

public class AccessModifierTest {
	
	public static void main(String[]args) {
		Student__ kim = new Student__();
		kim.studentID = 1001;
		kim.setStudentName("김유신");
		System.out.println(kim.getStudentName());
		kim.score = 100;
		System.out.println(kim.score);
	}

}
