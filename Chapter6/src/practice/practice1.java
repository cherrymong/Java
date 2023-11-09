package practice;

public class practice1 {

// 1. 아침 출근길에 김씨(객체)는 4000원을 내고 별다방(객체)에서 아메리카노를 사 마셨습니다. 이씨(객체)는 콩다방(객체)에서 4500원을 내고 라테를 사 마셨습니다. 
//	학생, 버스, 지하철 실습과 같이 객체간 협력을 이용하여 위의 내용의 코드를 작성하세요.

	public static void main(String[] args) {
	star_store sCafe = new star_store("서면점");
	kong_store kCafe = new kong_store("서면점");
	Customer kim = new Customer("김씨",10000);
	Customer lee = new Customer("이씨",10000);
	 
	kim.takeStarStore(sCafe, 4000);
	kim.showInfo();
	sCafe.showInfo();
	
	lee.takeKongStore(kCafe, 4500);
	lee.showInfo();
	kCafe.showInfo();
	
	

	
	
	}

}
