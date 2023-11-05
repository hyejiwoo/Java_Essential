package com.woo.homework_etc;

import java.util.Arrays;

public class ScoreProcess {
	public void process_avg(Score[] std) { 

		for (int i = 0; i < std.length; i++) {
			std[i].setAvg((std[i].getKor() + std[i].getEng() + std[i].getMath()) / 3.0);
		}

	}

	public void process_pass(Score[] std) { // 3명주소의 합격처리
		// ver1
		/*
		 * String result = std[0].getAvg() < 60?"불합격" : std[0].getKor() <40 ||
		 * std[0].getEng() <40 || std[0].getMath() <40?"재시험":"합격";
		 * std[0].setPass(result);
		 */

		// ver2
		for (int i = 0; i < std.length; i++) {
			String result = std[i].getAvg() < 60 ? "불합격"
					: std[i].getKor() < 40 || std[i].getEng() < 40 || std[i].getMath() < 40 ? "재시험" : "합격";
			std[i].setPass(result);
		}

	}
}