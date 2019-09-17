package hello;

public class ArrayExample2 {
	public static void main(String[] args) {
		int[][] inta = {{2,3,4},{5,6,7}};
		// 2 3 4   0.1 0.2 0.3 inta[0]
		// 5 6 7   1.1 1.2 1.3 inta[1]
		for(int i=0;i<inta.length;i++) {
			for(int j=0;j<inta[i].length;j++) {
			System.out.print("["+ i +","+ j +"=>"+inta[i][j] + "]");	
			}
			System.out.println();
		}				
						
	}

}
