package hello;

public class Exercise508 {
	public static void main(String[] args) {
		int[][] array= {
				{95,86},
				{83,92,96},
				{78,83,93,87,88}
		};
		int sum=0, c=0;
		double avg=0.0;
		
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				sum+=array[i][j];
				c++; //카운터를 줘서 총 배열의 길이를 넣어 둔다
			}
	}
		avg=(double)sum/c;
		System.out.println("sum : "+sum);
		System.out.println("avg : "+avg);

	}
}
