package whiletest;

public class WhileTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		while(조건식) {
//			실행문;
//			증감식;
//		}
		int i = 0;
		int sum = 0;
		sum = 0;
		while(i<=10) { //조건식 : true일 때 반복, false일 때 반복을 멈춤.
			sum+=i; //실행문
			System.out.println(sum);
			i++; //증감식
		}
		System.out.println(sum);

	}

}
