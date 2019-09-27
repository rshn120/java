package hello;

import java.util.Scanner;

class Student { 
	String studentNo;
	String name;
	int kor;
	int eng;
	int math;

	Student() {
	}

	public Student(String studentNo, String name, int kor, int eng, int math) {
		super();
		this.studentNo = studentNo;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public String getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	@Override
	public String toString() {
		return "[학생번호=" + studentNo + ", 이름=" + name + ", 국어=" + kor + ", 영어=" + eng + ", 수학=" + math + "]";
	}

}

public class TestScore {
	static Scanner sc = new Scanner(System.in);
	static Student[] students = new Student[10]; //학생 정보 10개 배열로 만듦

	public static void main(String[] args) {
		execute();
	}

	public static void execute() {
		int sel = 0;
		while (true) {
			menu();
			sel = sc.nextInt();
			sc.nextLine();
			if (sel == 1) { //학생정보등록  : studentNo/name/kor/eng/math  
				register();
			} else if (sel == 2) { //전체리스트
				getList();
			} else if (sel == 3) { // studentNo 학생정보 조회
				getStudent();
			} else if (sel == 4) {  // 통계
				testScore();
			} else if (sel == 5) {
				sorting();
			} else if (sel == 6) {
				break;
			}
		}System.out.println("프로그램 종료.");
		
}
	static void menu() {
		System.out.println("================================");
		System.out.println("1.등록 2.전체리스트 3.학생조회 4.통계 5.총점정렬 6.종료");
		System.out.println("================================");
	}

	static void register() {
		System.out.print("학생번호: ");
		String studentNo = sc.nextLine();
		System.out.print("이름: ");
		String name = sc.nextLine();
		System.out.print("국어점수: ");
		int kor = sc.nextInt();
		sc.nextLine();
		System.out.print("영어점수: ");
		int eng = sc.nextInt();
		sc.nextLine();
		System.out.print("수학점수: ");
		int mat = sc.nextInt();
		sc.nextLine();
		Student student = new Student(studentNo, name, kor, eng, mat);
		for (int i = 0; i < students.length; i++) {
			if (students[i] == null) {
				students[i] = student;
				break;
			}
		}
	}

	static void getList() {
		for (Student std : students) {
			if (std != null) {
				System.out.println(std);
			}
		}
	}

	static void getStudent() {
		System.out.print("조회할 학생번호 입력:");
		String studentNo = sc.nextLine();
		double total = 0, avg = 0;
		for (Student std : students) {
			if (std != null && std.getStudentNo().equals(studentNo)) {
				total = std.getEng() + std.getKor() + std.getMath();
				avg = total / 3;
				System.out.println(std.getStudentNo() + "/" + std.getName() + "/" + std.getKor() + "/" + std.getEng()
						+ "/" + std.getMath() + "/" + total + "/" + avg);
			}
		}
	}

	static void testScore() { //총점
		double korTotal = 0, engTotal = 0, mathTotal = 0; //총점수를 구하기위해 변수 선언.
		int cnt = 0; //총학생 수를 카운트하기위해 설정
		for (Student std : students) {
			if (std != null) {
				korTotal += std.getKor();
				engTotal += std.getEng();
				mathTotal += std.getMath();
				cnt++; // 추가 될때 마다 +1 씩
			}
		}

		System.out.println("전체 통계정보");
		//합계 : 위에서 구한 국어,영어,수학의 총합   평균 : 총합/학생수     
		System.out.println("국어합계:" + korTotal + ", 영어합계:" + engTotal + ", 수학합계:" + mathTotal + ", 합계:"
				+ (korTotal + engTotal + mathTotal) + ", 평균:" + (korTotal + engTotal + mathTotal) / (cnt * 3));
	}

	static void sorting() { //정렬
		Student[] stdAry = new Student[10];//기존 학생정보를 복사하기위해 배열 선언
		int cnt = 0;
		for (int i = 0; i < stdAry.length; i++) { //학생 정보를 복사함
			if (students[i] != null) {
				System.out.println("std:" + students[i].getStudentNo());
				stdAry[i] = new Student();
				stdAry[i].setStudentNo(students[i].getStudentNo());
				stdAry[i].setName(students[i].getName());
				stdAry[i].setKor(students[i].getEng() + students[i].getKor() + students[i].getMath());

				cnt++;//실제 등록한 학생 수 만큼 의 카운트
			}
		}
		cnt--; //위에서 마지막에 검색한다고  존재하는 학생수보다 1나가 추가되  1을 빼줌
		for (int c = 0; c < cnt; c++) {
			for (int i = 0; i < cnt; i++) {
				Student student = null;
				if (stdAry[i].getKor() > stdAry[i + 1].getKor()) { //배열의 자리를 바꾸기위해 사용
					student = stdAry[i];
					stdAry[i] = stdAry[i + 1];
					stdAry[i + 1] = student;
				}
			}
		}
		for (Student s : stdAry) { //정렬된 배열 출력
			if (s != null)
				System.out.println(s.getStudentNo() + "/" + s.getName() + "/" + s.getKor());
		}
	}// end of sorting

}// end of class
