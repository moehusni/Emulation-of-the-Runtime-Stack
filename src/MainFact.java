public abstract class MainFact
{
	public static void main(String argv[])
	{
		// argv[0]: output file displaying the runtime stack 

		Output.setOutput( argv[0] );

		ARfact newARfact = new ARfact();
		newARfact.n = 5; // pass parameter value
		RuntimeStack.push(newARfact);
		
		newARfact.fact(); // call fact(10)
		System.out.println(newARfact.returnVal); // print the value of fact(5)
		RuntimeStack.pop();
		

		Output.closeOutput();
	}
} 
