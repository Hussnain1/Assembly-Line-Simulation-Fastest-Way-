// Author: Hussnain Shafique Cheema | BSCS2B | 00925



public class AssemblyLine {

int finalResult=0;
int finalLine;


public int fastestway(int n, int e1,int e2,int x1,int x2, int[][]a, int[][]t) {


	int [] f1 = new int[n];					//line1
	int [] f2 = new int[n];					//line2
	
		 									
	int []l1 = new int[n];		
	int []l2 = new int[n];
	
	
			
	f1[0] = e1 + a[0][0];
	f2[0] = e2 + a[1][0];
	
	
	
	
	for(int j=1;j<n;j++) {
		if((f1[j-1] + a[0][j]) <= (f2[j-1] + t[1][j-1] + a[0][j])) {
			f1[j] = f1[j-1] + a[0][j];
			l1[j] = 1;	
			
		}
		else {
			f1[j] = f2[j-1] + t[1][j-1] + a[0][j];
			l1[j] = 2;
			
		}
		
		if((f2[j-1] + a[1][j]) <= (f1[j-1] + t[0][j-1] + a[1][j])) {
			f2[j] = f2[j-1] + a[1][j];
			l2[j] = 2;
	
		}
		else {
			f2[j] = f1[j-1] + t[0][j-1] + a[1][j];
			l2[j] = 1;	
			
		}

		
	
}
	
	
	
	

	if((f1[n-1] + x1) <= (f2[n-1] + x2)) {
		finalResult = f1[n-1] + x1;
		finalLine = 1;
	
	}
	
	else {
		finalResult = f2[n-1] + x2;
		finalLine = 2;
	}
	
	
	
	
	
	System.out.println("Optimal Path: ");
	
	if(finalLine==1) {
	for(int i=1;i<n;i++) {
		System.out.print(l1[i] + "->");
	
		
	}
	System.out.print(finalLine);
	System.out.println();
	}
	
	else {
		for(int i=1;i<n;i++) {
			System.out.print(l2[i] + "->");
		}
		System.out.print(finalLine);
		}
		
	
	
	System.out.println("\nOutput: "+ finalResult);
	System.out.println("Line: " + finalLine);
	System.out.println();
	return finalResult;
	}

}
