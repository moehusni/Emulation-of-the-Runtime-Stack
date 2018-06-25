public abstract class MainMixFactFib
{
	public static void main(String argv[])
	{
		// argv[0]: output file displaying the runtime stack data
		Output.setOutput( argv[0] );
		ARmixFactFib newMixFactFib = new ARmixFactFib();
		newMixFactFib.n=10; // pass parameter value
		RuntimeStack.push(newMixFactFib);
		newMixFactFib.mixFactFib(); // call mixFactFib(10)
		System.out.println(newMixFactFib.returnVal);
		RuntimeStack.pop();
		Output.closeOutput();
	}
} 
