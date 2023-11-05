package com.woo.homework;

abstract class Process {
	abstract double exec(int kor, int eng, int math);

	abstract double exec(int total);

	abstract double exec(double avg);

	@Override
	public String toString() {
		return "Process []";
	}

}

class Score extends Process {
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double avg;

	public Score() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Score(String name, int kor, int eng, int math, int total, double avg) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = total;
		this.avg = avg;
	}

	@Override
	public String toString() {
		return "Score [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", total=" + total
				+ ", avg=" + avg + "]";
	}

	@Override
	double exec(int kor, int eng, int math) {
		return 0;
	}

	@Override
	double exec(int total) {
		return 0;
	}

	@Override
	double exec(double avg) {
		return 0;
	}
}

class ScoreDto extends Score {
	public ScoreDto(String string, int i, int j, int k) {
	}

	private String jang;
	private String star;
	private String pass;
}

abstract class Print {
	abstract void show(ScoreDto std);

	abstract void show(ScoreDto[] std);
}
	class StdPrint extends Print {

		@Override
		public String toString() {
			return "StdPrint []";
		}

		@Override
		void show(ScoreDto std) {
			// TODO Auto-generated method stub

		}

		@Override
		void show(ScoreDto[] std) {
			// TODO Auto-generated method stub
			
		}
	}
	

	public class Abstract008 {
		public static void main(String[] args) {
			ScoreDto std = new ScoreDto("헐크", 100, 100, 99);
			Process process = null;
			Print print = null;
			
			print = new StdPrint();
			print.show(std);
		}
	}
