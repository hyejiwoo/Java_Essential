package com.woo.homework;

class Papa extends Object {
	int money = 1000;

	public Papa() {
		super();
	}

	public void sing() {
		System.out.println("GOD - 거짓말");
	}
}

class Son2 extends Papa {
	int money = 1500;

	public Son2() {
		super();
	}

	@Override
	public void sing() {
		super.sing();
		System.out.println("빅뱅 - 거짓말");
	}
}

public class Polymorphism007 {

	public static void main(String[] args) {
		Papa mypapa = new Son2();
		System.out.println(mypapa.money);
		mypapa.sing();

		Son2 jasick = new Son2();
		System.out.println(jasick.money + "원"); // 1500원

	}
}