import java.util.Random;

// Author: Hussnain Shafique Cheema | BSCS2B | 00925

public class UnitTest {


	public static void main(String[] args) {
		 Random rand = new Random();

		int max = 20;
		int min = 10;
		int n = rand.nextInt((10 - 5) + 1) + min;
		int numofLines = 2;
		int [][]a = new int[numofLines][n];
		int [][]t = new int[numofLines][n];
		for(int i=0;i<numofLines;i++) {
			for(int j=0;j<n;j++) {
				a[i][j] = rand.nextInt((max - min) + 1) + 1;
				if(j==0)
					t[i][j] = 0;
				else {
				
				t[i][j] = rand.nextInt((max - min) + 1) + 1;
				}
				
			}
			
			System.out.println();
		} 
		
		
		
		
		
		int e1 = rand.nextInt((max - min) + 1) + 1;
		int e2 = rand.nextInt((max - min) + 1) + 1;
		int x1 = rand.nextInt((max - min) + 1) + 1;
		int x2 = rand.nextInt((max - min) + 1) + 1;
		
			System.out.println("Number of stations: " + n);
			System.out.println("\nLine 1: ");
			for(int j=0;j<n;j++) {
				System.out.println("Station: " + (j+1) + " Time : " + a[0][j]);
			} 
			System.out.println("\nLine 2: ");
			for(int j=0;j<n;j++) {
				System.out.println("Station: " + (j+1) + " Time : " + a[1][j]);
			} 
			
		System.out.println("\n\n");
		AssemblyLine myob = new AssemblyLine();
		
		int finalRes = myob.fastestway(n, e1,e2,x1,x2,a,t);
		}

}
