class ARfib extends AR
{
	int n; // parameter
	int t; // temporary var to store the value of fib(n-1)
	int t2;	// temporary var to store the value of fib(n-2)
	int returnVal;

	void fib()
	{
		if ( this.n <=1 )
		{
			this.returnVal = n;
			if(this.n == 0) 
				RuntimeStack.display();
		}
		else 
		{
			ARfib newARfib = new ARfib();
			newARfib.n = n - 1; // pass parameter value
			RuntimeStack.push(newARfib);
			newARfib.fib(); // call for fib(n-1)
			t = newARfib.returnVal; // pass return value of fib(n-1) to t
			RuntimeStack.pop();
			newARfib = new ARfib();
			newARfib.n = n - 2; // pass parameter value
			RuntimeStack.push(newARfib);
			newARfib.fib();  // call for fib(n-2)						
			t2 = newARfib.returnVal; // pass return value of fib(n-2) to t2
			RuntimeStack.pop();
			returnVal = t + t2;	// // store the value of fib(n) = fib(n-1) + fib(n-2)		
		}
	}
	@Override
	public String toString()
	{
		return "ARfib" + " n = " + n + " t = " + t + " t2 = " + t2 + " returnVal = " + returnVal;
	}
}