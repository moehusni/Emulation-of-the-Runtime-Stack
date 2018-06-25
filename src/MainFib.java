public abstract class MainFib
{
	public static void main(String argv[])
	{
		// argv[0]: output file displaying the runtime stack data

		Output.setOutput( argv[0] );
		ARfib newARfib = new ARfib();
		newARfib.n = 10;
		RuntimeStack.push(newARfib);
		newARfib.fib(); 								// call fib(10)
		System.out.println(newARfib.returnVal);
		RuntimeStack.pop();
		Output.closeOutput();
	}	
} 
