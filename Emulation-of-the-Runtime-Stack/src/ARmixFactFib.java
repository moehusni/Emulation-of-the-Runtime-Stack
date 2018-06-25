
class ARmixFactFib extends AR {
	
	int n;  // parameter
	int t;	// temporary var to store the value of fact(n-1)
	int t2; // temporary var to store the value of fact(n-1)
	int returnVal;

	void mixFactFib() {
		ARfactOrFib newfactOrFib = new ARfactOrFib();
		newfactOrFib.n = n; // pass parameter value
		RuntimeStack.push(newfactOrFib);
		newfactOrFib.factOrFib(); // call factOrFib(n)
		t = newfactOrFib.returnVal; // pass return value of factOrFib(n) to t
		RuntimeStack.pop();
		newfactOrFib = new ARfactOrFib();
		newfactOrFib.n = n-1; // pass parameter value
		RuntimeStack.push(newfactOrFib);
		newfactOrFib.factOrFib(); // call factOrFib(n-1)
		t2 = newfactOrFib.returnVal; //  pass return value of factOrFib(n-1) to t2
		RuntimeStack.pop();
		returnVal = t + t2;  // store the value of mixFactFib(n) = factOrFib(n)+factOrFib(n-1); 

	}

	@Override
	public String toString() {
		return "ARmixFactFib " + "n = " + n +" t1 = " + t + " t2 = " + t2 + " returnVal = " + returnVal; 
	}
}