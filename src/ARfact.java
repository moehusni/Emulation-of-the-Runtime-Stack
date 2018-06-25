class ARfact extends AR
{
	int n; // parameter
	int t; // temporary var to store the value of fact(n-1)
	int returnVal;

	public String toString()
	{
		return "ARfact" + " n = " + n + " t = " + t + " returnVal = " + returnVal;
	}

	void fact()
	{
		if ( n <= 1 )
		{
			returnVal = 1;
			RuntimeStack.display();
		}
		else
		{
			ARfact newARfact = new ARfact();
			newARfact.n = n - 1; // pass parameter value
			RuntimeStack.push(newARfact);
			newARfact.fact(); // call fact(n-1)
			t = newARfact.returnVal; // pass return value of fact(n-1) to t
			RuntimeStack.pop();
			returnVal = n * t; // store the value of fact(n) = n*fact(n-1)
		}
	}
}
