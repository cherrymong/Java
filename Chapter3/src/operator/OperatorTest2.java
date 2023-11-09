package operator;

public class OperatorTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// >, <, >=, <=, ==, != : 관계연산자, 비교연산자
		int num1 = 1;
		int num2 = 2;
		System.out.println(num1>num2); // 항1>항2 항1이 항2보다 크다
		System.out.println(num1<num2); // 항1<항2 항1이 항2보다 작다
		System.out.println(num1>=num2);// 항1>=항2 항1이 항2보다 크거나 같다
		System.out.println(num1<=num2);// 항1<=항2 항1이 항2보다 작거나 같다
		System.out.println(num1==num2);// 항1==항2 항1이 항2와 같다
		System.out.println(num1!=num2);// 항1!=항2 항1과 항2는 다르다
		System.out.println("-------------------------------");
		// &&, ||, ! : 논리 연산자
		System.out.println(true && true); // 두 개의 항이 모두 true일 때 true를 출력
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		
		System.out.println(true || true); // 두 개의 항 중 하나라도 true일 때 true를 출력
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		System.out.println(!(10>20));
		System.out.println(!false);

	}

}
