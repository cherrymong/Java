package fortest;

public class Gugudan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// for문을 이용하여 구구단 출력하기
		// 2단에서 9단까지
//		System.out.println("2 * 1 = 2");
	//	System.out.println("2 * 2 = 4");
//		System.out.println("2 * 3 = 6");
//		System.out.println("2 * 4 = 8");
		
		for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
			System.out.println(i+"*"+j+"="+i*j);	
			}
		}
	}

}
