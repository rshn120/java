package suna;
//배열의 length 필드
public class Example5_6 {
	public static void main(String[] args) {
		int[] scores= {83,90,87}; //int타입 scores변수배열 값 {83,90,87}
		int sum = 0; // 합계 저장할 정수타입 변수 sum 
		for(int i = 0; i<scores.length; i++) { // for구문을 통해 scores.length값만큼 루핑 i = 인덱스 번호
			sum += scores[i]; // sum = sum + scores[i] 총합구해서 변수 sum에 저장
		}
		System.out.println("sum :" + sum); //출력 sum : sum값
		
		double avg =(double)sum/scores.length; // 실수타입 avg 변수 생성 = 정수타입 변수  sum 을 연산을 위해 실수로 강제 타입변환
											  // sum / 배열 길이값(배열갯수)
		System.out.println("avg : " + avg); // 출력 avg
	}
 
}
