

import java.util.Arrays;

public class ARpartition extends AR{
	
	int x; 		// local var
	int i; 		// local var
	int j; 		// local var
	int p; 		// parameter
	int r; 		// parameter
	int[] A;	// parameter
	int temp;	// local var
	int returnVal;
	public String toString()
	{
		return this.getClass().getSimpleName()+" A = "+Arrays.toString(A)+" p = "+p+" r = "+r+" x= "+x+" i= "+i+" j= "+j + " temp = " + temp + " returnVal = " + this.returnVal;
	}	
	
	void partition()
	{
		x=A[r];
		i=p-1;
		
		for ( j = p; j <= r-1; j++ )
			if ( A[j] <= x )
			{
				i++;
				temp = A[i];
				A[i] = A[j];
				A[j] = temp;
			}
		temp = A[i+1];
		A[i+1] = A[r];
		A[r] = temp;
		this.returnVal = i+1;
		RuntimeStack.display();
	}
		
}
