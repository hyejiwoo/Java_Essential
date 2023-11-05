package com.woo.homework;

import java.util.Arrays;

import com.woo.homework_etc.Score;
import com.woo.homework_etc.ScorePrint;
import com.woo.homework_etc.ScoreProcess;

public class ClassArray005 {
	public static void main(String[] args) {
		Score[] std = new Score[3];
		std[0] = new Score("아이언맨", 100, 100, 100); // {101번지, null, null}
		std[1] = new Score("헐크", 90, 60, 80); // {101번지, 102번지, null}
		std[2] = new Score("블랙팬서", 20, 60, 90); // {101번지, 102번지, 103번지}
		System.out.println(Arrays.toString(std));

		ScoreProcess process = new ScoreProcess();
		process.process_avg(std);
		// std = {101번지, 102번지, 103번지}
		// void process_avg
		process.process_pass(std);
		// std = {101번지, 102번지, 103번지}
		// void process_pass

		ScorePrint print = new ScorePrint();
		print.show(std);
	}
}
