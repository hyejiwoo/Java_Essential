package com.woo.homework_etc;

public class ScorePrint {

	public void show_title() {
		System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\r\n"
				+ "이름\t국어\t영어\t수학\t평균\t합격여부\r\n"
				+ ":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
	}

	public void show(Score std) {
		show_title();
		System.out.printf("%s\t%d\t%d\t%d\t%.2f\t%s\n", std.getName(), std.getKor(), std.getEng(), std.getMath(),
				std.getAvg(), std.getPass());
	}

	public void show(Score[] stdArr) {
		show_title();
		for (Score std : stdArr) {
			System.out.printf("%s\t%d\t%d\t%d\t%.2f\t%s\n", std.getName(), std.getKor(), std.getEng(), std.getMath(),
					std.getAvg(), std.getPass());
		}
	}
}