package reference;

class Subject{
	int subjectNum;
    String subjectTitle;
    String teacherName;
    int score;
}

public class Student {
	int studentID;
	String studentName;
	Subject korea = new Subject();
	Subject math = new Subject();
	Subject en = new Subject();
	Subject java = new Subject();
	
	public static void main(String [] args) {
		Student kim = new Student();
		kim.korea.subjectTitle = "국어";
		kim.math.score = 100;
		System.out.println(kim.korea.subjectTitle);
	}
}
