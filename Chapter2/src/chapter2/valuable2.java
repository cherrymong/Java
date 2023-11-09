package chapter2;

public class valuable2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 정수 자료형
		byte b = 1; // 1바이트 : -128 ~ +127
		short s = 2; // 2바이트 : -32768 ~ +32767
		int i = 3; // 4바이트 : -2147483648 ~ +2147483647
		long l = 4; // 8바이트 : 
		//ctrl + space : 자동완성
//		System.out.println(b);
//	System.out.println(s);
//		System.out.println(i);
//		System.out.println(l);
		
		char c = 'a'; // 한 글자만 표시하는 자료형 char(Character)
		System.out.println(c);
		char k = '가'+1; // 한글 변환
		System.out.println(k);
		
		//여러 글자를 표시하는 자료형 String (기본 자료형 X)
		String str = "string 자료형은 문자열을 저장합니다.";
		System.out.println(str);
		
		// 실수 자료형
		float f = 0f; // 4바이트
		double d = 1; // 8바이트
		System.out.println(f);
		System.out.println(d);
		for(int i2=0; i2<10000; i2++) {
             d = d + 0.1;
		}
             System.out.println(d);
          // 논리 자료형 불린 : true(참), false(거짓) 저장 가능
             boolean bo = true;
             System.out.println(bo);
             
             var v1= 10;
             var v2 = 10.2;
             var v3 = 'a';
             var v4 = true;
             var v5 = 1.12f;
             var v6 = 100012345654L;
             var v7 = "string 자료형";
             v3 = 65;
             System.out.println(v1);
             System.out.println(v2);
             System.out.println(v3);
             System.out.println(v4);
             System.out.println(v5);
             System.out.println(v6);
             System.out.println(v7);
	}

}
