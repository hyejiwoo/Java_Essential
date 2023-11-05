package com.woo.homework;

class Sawon005{
	int pay = 10000;
	
	static int su = 10;
	//static int basicpay = pay;
	// static 초기화 블록에서 인스턴스 변수에 접근 안 됨.
	static int basicpay2;
	static {
		basicpay2 = 20000;
	}
	
	public static void showSu() {
		System.out.println(su);
	}
	
	public static void showPay() {
		//System.out.println(this.pay);
		// static 메서드에서 this 사용 안 됨.
		//인스턴스 메서드에서만 가능.
	}
	
	public void showA11001() {
		System.out.println(su);
		System.out.println(this.pay);
	}
	
	public static void showA11002() {
		//showA11001();
		// 인스턴스 메서드여서 호출 안됨.
		//System.out.println(this.pay);
	}
	
}

public class Static003 {
	public static void main(String[] args) {
		Sawon005 sola = new Sawon005();
		sola.showA11001();
	}
}
