package com.woo.homework;

class Coffee012{
	String name;
	int num;
	int price;
	
	@Override
	public String toString() {
		return "Coffee012 [name=" + name + ", price=" + price + ", num=" + num + "]";
	}

	public Coffee012(String name, int num, int price) {
		super();
		this.name = name;
		this.price = price;
		this.num = num;
	}

	void show() {
		System.out.println(name + "\t" + price);
	}
}


public class OOP001 {
	public static void main(String[] args) {
		Coffee012 a1 = new Coffee012("까페라떼", 2, 4000);
		a1.show();
		Coffee012 a2 = new Coffee012("아이스 아메리카노", 1, 3000);
		a2.show();
	}
}



