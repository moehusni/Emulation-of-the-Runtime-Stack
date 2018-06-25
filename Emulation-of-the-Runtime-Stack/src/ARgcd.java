

class ARgcd extends AR
{

	int x; 	// parameter
	int y; 	// parameter
	int t; // temporary var to store the value of greatestCommonDivisor(x,y)
	int returnVal;

	public String toString()
	{
		return this.getClass().getSimpleName()+" x = "+x+" y = "+y+" t1 = "+t+ " returnVal = " + this.returnVal;
	}	
	
	void greatestCommonDivisor()
	{
		if (x == y){
			this.returnVal = x;
			RuntimeStack.display();
		}else if ( x < y ){
			ARgcd newARgreatestCommonDivisor = new ARgcd();
			newARgreatestCommonDivisor.x = x;  	// pass parameter value
			newARgreatestCommonDivisor.y = y - x;  // pass parameter value
			RuntimeStack.push(newARgreatestCommonDivisor);
			newARgreatestCommonDivisor.greatestCommonDivisor(); // call greatestCommonDivisor(x, y-x)
			t = newARgreatestCommonDivisor.returnVal; 			// pass return value of greatestCommonDivisor(x, y-x) to t
			RuntimeStack.pop();
			returnVal = t;										// store the value of greatestCommonDivisor(x, y-x) 
		}else{
			ARgcd newARgreatestCommonDivisor = new ARgcd();
			newARgreatestCommonDivisor.x = x - y;  // pass parameter value
			newARgreatestCommonDivisor.y = y;  	// pass parameter value
			RuntimeStack.push(newARgreatestCommonDivisor);
			newARgreatestCommonDivisor.greatestCommonDivisor(); // call greatestCommonDivisor(x-y, y)
			t = newARgreatestCommonDivisor.returnVal;    		// pass return value of greatestCommonDivisor(x-y, y) to t
			RuntimeStack.pop();
			returnVal = t;										// store the value of greatestCommonDivisor(x-y, y)
		}
	}
}