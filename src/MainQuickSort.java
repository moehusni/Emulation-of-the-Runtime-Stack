public abstract class MainQuickSort
{
	public static void main(String argv[])
	{
		// argv[0]: output file displaying the runtime stack 

		Output.setOutput( argv[0] );
		ARquickSort newARQuickSort = new ARquickSort();
		newARQuickSort.A[0] = 8;
		newARQuickSort.A[1] = 3;
		newARQuickSort.A[2] = 5;
		newARQuickSort.A[3] = 1;
		newARQuickSort.A[4] = 9;
		newARQuickSort.A[5] = 7;
		newARQuickSort.A[6] = 4;
		newARQuickSort.A[7] = 6;
		newARQuickSort.A[8] = 2;
		newARQuickSort.A[9] = 10;
		newARQuickSort.p = 0;
		newARQuickSort.r = 9;
		RuntimeStack.push(newARQuickSort);
		newARQuickSort.quickSort(); 								// call fact(5)
		RuntimeStack.pop();


		Output.closeOutput();
	}
} 
