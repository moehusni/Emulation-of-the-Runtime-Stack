public abstract class MainGCD
{
	public static void main(String argv[])
	{
		// argv[0]: output file displaying the runtime stack data
				Output.setOutput( argv[0] );
				ARgcd newARgreatestCommonDivisor = new ARgcd();
				newARgreatestCommonDivisor.x = 84; // pass parameter value
				newARgreatestCommonDivisor.y = 36; // pass parameter value
				RuntimeStack.push(newARgreatestCommonDivisor);
				newARgreatestCommonDivisor.greatestCommonDivisor(); // call greatestCommonDivisor(x, y)								// call fact(5)
				System.out.println(newARgreatestCommonDivisor.returnVal);
				RuntimeStack.pop();
				Output.closeOutput();		
	}
	
} 
