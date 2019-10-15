package com.yedam.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class HightStudent {
	String name;
	String sex;
	int score;

	public String getName() {
		return name;
	}

	public String getSex() {
		return sex;
	}

	public int getScore() {
		return score;
	}

	public HightStudent(String name, String sex, int score) {
		super();
		this.name = name;
		this.sex = sex;
		this.score = score;
	}
}

public class PredicateExample {

	private static List<HightStudent> list = Arrays.asList(new HightStudent("우성이", "남자", 90),
			new HightStudent("길순이", "여자", 90), new HightStudent("오용이", "남자", 95), new HightStudent("박순이", "여자", 92));

	public static double avg(Predicate<HightStudent> pre) {
		boolean bool = false;
		int cnt = 0, sum = 0;
		for (HightStudent student : list) {
			bool = pre.test(student); // getSec() = "남자"
			if (bool) {
				cnt++;
				sum += student.getScore();
			}
		}
		return (double) sum / cnt;
	}

	public static void main(String[] args) {
		Predicate<HightStudent> pred = new Predicate<HightStudent>() {
			@Override
			public boolean test(HightStudent t) {
				return t.getSex().equals("남자");
			}
		};
		double avg = avg(pred);
		System.out.println("남자 평균 : " + avg);

		avg = avg((t) -> {
			return t.getSex().equals("여자");
		});
		System.out.println("여자평균 : " + avg);
	}
}
