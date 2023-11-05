package com.woo.homework;
/*
 * 		1. 코드 재사용성, 유지보수
 * 		2.  
 *  	 		A1			[int a					  ]
 * 			↑ 		
 * 			B1			[int b					  ]
 * 			↑ 
 * 			C1			[int c	/ show() ]
 * 
 */


class A1 extends Object {
	int a;

	public A1() {
		super();
	}
}

class B1 extends A1 {
	int b;

	public B1() {
		super();
	}
}

class C1 extends B1 {
	int c;

	public C1() {
		super();
	}

	public void show() {
		System.out.println("상속받은 A클래스의 a : " + a);
		System.out.println("상속받은 B클래스의 b : " + b);
		System.out.println("상속받은 C클래스의 c : " + c);
	}
}

public class Extends006 {
	public static void main(String[] args) {
		C1 myc = new C1();
		myc.b = 10;
		myc.b = 20;
		myc.c = 30;
		myc.show();
	}
}
