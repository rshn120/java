package com.yedam.lambda;

import java.util.function.Predicate;
import java.util.function.ToIntFunction;

public class LambdaExample06 {
	private static Student[] students = { 
			new Student("홍길동", 90, 96), 
			new Student("강호동", 95, 93) };

	// avg() 메소드 작성
	public static double avg(ToIntFunction<Student> function) {
		int sum = 0;
		for (Student sd : students) {
			sum += function.applyAsInt(sd);
		}
		double avg = (double) sum / students.length;
		return avg;
	}

	public static void main(String[] args) {
		double englishAvg = avg(jj -> jj.getEnglishScore());
		System.out.println("영어 평균 점수: " + englishAvg);
		double mathAvg = avg(jj -> jj.getMathScore());
		System.out.println("수학 평균 점수: " + mathAvg);
	}

	public static class Student {
		private String name;
		private int englishScore;
		private int mathScore;

		public Student(String name, int englishScore, int mathScore) {
			super();
			this.name = name;
			this.englishScore = englishScore;
			this.mathScore = mathScore;
		}

		public String getName() {
			return name;
		}

		public int getEnglishScore() {
			return englishScore;
		}

		public int getMathScore() {
			return mathScore;
		}

	}
}
