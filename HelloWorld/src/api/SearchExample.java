package api;

import java.util.Arrays;

public class SearchExample {
	public static void main(String[] args) {
		//기본 타입값 검색
		int[] scores= {99,97,98};
		Arrays.sort(scores);
		int index = Arrays.binarySearch(scores, 99);
		System.out.println("기본 int타입 찾은 인덱스: "+index);
		
		
		//문자열 검색
		String[] names = {"홍길동","박동수","김민수"};
		Arrays.sort(names);
		index = Arrays.binarySearch(names, "홍길동");
		System.out.println("문자열파트 찾은 인덱스: "+index);
		
		
		//객체 검색
		Member m1 = new Member("홍길동");
		Member m2 = new Member("박동수");
		Member m3 = new Member("김민수");
		Member[] members = {m1,m2,m3};
		Arrays.sort(members);
		index = Arrays.binarySearch(members, m1);//배열 총 길이 index[0]~index[2];
		System.out.println("객체파트 찾은 인덱스"+index);
	}
}
