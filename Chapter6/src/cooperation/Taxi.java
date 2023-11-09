package cooperation;

public class Taxi {
	public int taxiNumber;
	public int passengerCount;
	public int money;
	
	public Taxi(int taxiNumber) {
		this.taxiNumber = taxiNumber;
	}
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.println("택시 " +taxiNumber+"의 승객은"+passengerCount+"명이고, 수입은 "+money+"입니다.");
	}
	
}
