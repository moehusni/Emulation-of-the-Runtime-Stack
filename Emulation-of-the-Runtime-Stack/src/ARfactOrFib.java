class ARfactOrFib extends AR {
	int n ;
	int t;
	int returnVal;
	

	void factOrFib() {
	

		if (n%2 == 0) {
			ARfact newARfact= new ARfact();
			
			newARfact.n = n; // pass parameter value
			RuntimeStack.push(newARfact);
			newARfact.fact(); // call fact(10)
			t = newARfact.returnVal; // pass return value of fact(10) to t
			RuntimeStack.pop();
			returnVal = t;  // store the value of factOrFib(int n) = fact(10)
			
		} else {
			ARfib newARfib = new ARfib();
			newARfib.n = n; // pass parameter value
			RuntimeStack.push(newARfib);
			newARfib.fib(); // call fib(9)
			t = newARfib.returnVal; // pass return value of fib(9) to t
			RuntimeStack.pop();
			returnVal = t; // store the value of factOrFib(int n) = fib(9)
		
		}
	}

	
	@Override
	public String toString() {
		return "ARfactOrFib" + " n = " + n +" t = " + t + " returnVal = " +returnVal;
	}
}