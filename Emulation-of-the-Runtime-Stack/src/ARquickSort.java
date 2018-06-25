import java.util.Arrays;



class ARquickSort extends AR
{

	int[] A = new int[10];	// parameter
	int p; 		// parameter
	int r; 		// parameter
	int q; 		// local var
	int returnVal;
		void quickSort()
		{
			if (p < r){
				
				ARpartition newARpartition = new ARpartition();
				newARpartition.A= A; // pass parameter value
				newARpartition.p= p; // pass parameter value
				newARpartition.r= r; // pass parameter value
				RuntimeStack.push(newARpartition);
				newARpartition.partition(); // call partition(A,p,c)
				q = newARpartition.returnVal; // pass return value of partition() to q
				RuntimeStack.pop();

				ARquickSort newARQuickSort = new ARquickSort();
				newARQuickSort.A=A; // pass parameter value
				newARQuickSort.p=p; // pass parameter value
				newARQuickSort.r=q-1; // pass parameter value
				RuntimeStack.push(newARQuickSort);
				newARQuickSort.quickSort(); // call quickSort(A,p,c)
				RuntimeStack.pop();

				ARquickSort newARQuickSort2 = new ARquickSort();
				newARQuickSort2.A=A; // pass parameter value
				newARQuickSort2.p=q+1; // pass parameter value
				newARQuickSort2.r=r; // pass parameter value
				RuntimeStack.push(newARQuickSort2);
				newARQuickSort2.quickSort(); // call quickSort(A,p,c)
				RuntimeStack.pop();
			}

	}

	@Override
	public String toString() {
		
			return this.getClass().getSimpleName()+" p = "+p+" r = "+r+" A = "+Arrays.toString(A);
		}
}