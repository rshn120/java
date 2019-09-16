package hello;

public class Exercise403 {
	public static void main(String[] args) {
		int a = 0;
				
		for(int i=0; i<=100; i+=3) {
			//if(i%3==0) 
				a+=i; //i값을 3으로 나눠서 나머지가 0값일 경우 i값을 a에 더해서 넣는다 단 i값이 100과 같거나 작을때 까지
			//System.out.println("3배수의 합 : " +a);
								  }
		System.out.println("3배수의 합 : " +a);
											}
}
