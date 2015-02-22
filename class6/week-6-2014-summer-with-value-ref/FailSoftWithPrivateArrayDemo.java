/* This class implements a "fail-soft" array which prevents
   runtime errors.
 */
class FailSoftArray
{
  private int[] myArray;
  private int errorValue; // value to return if get() fails

  public int length;

  /* Construct array given its size and the value to
     return if get() fails. */
  public FailSoftArray(int size, int errV)
  {
    myArray = new int[size];
    this.errorValue = errV; // field gets value of formal parameter
    length = size;
  }

  // Return value at given index.
  public int get(int index)
  {
    if(isWithinBounds(index))
    {
		return myArray[index]; // value to get
	} // no need for else because of return statement
	System.out.println("problem in put ");
	return errorValue;
  }

  // Put a value at an index. Return false on failure.
  	// using boolean to track failures instead of using Java's Exception mechanism
  public boolean put(int index, int valueToPut)
  {
    if(isWithinBounds(index)) // get boolean from method call
    {
      myArray[index] = valueToPut;
      return true;
    }
    return false;
  }

  // Return true if index is within bounds.
  private boolean isWithinBounds(int index)
  {
   if(index >= 0 & index < length)
   {
	   return true;
   }
   return false; // this line does not execute if true
  }
}

// Demonstrate the fail-soft array.
class FailSoftWithPrivateArrayDemo
{
  public static void main(String[] args)
  {
	// using -1 to track failures instead of using Java's Exception mechanism
    FailSoftArray fs = new FailSoftArray(5, -1); // -1 is error value
    int x;

    // show quiet failures
    System.out.println("Fail quietly.");
    for(int i=0; i < (fs.length * 2); i++)
    {
      fs.put(i, i*10);
    }

    for(int i=0; i < (fs.length * 2); i++)
    {
      x = fs.get(i); // can return errorValue of -1 passed to FailSoftArray constructor!
      if(x != -1)
      {
		  System.out.print(x + " ");
	  }
    }
    System.out.println("");

    // handle failures
    System.out.println("\nFail with error reports.");
    for(int i=0; i < (fs.length * 2); i++)
    {
	  // backwards way of detecting a failure, turning false to true!
      if(!fs.put(i, i*10))
      {
        System.out.println("Index " + i + " out-of-bounds");
	  }
	}
    for(int i=0; i < (fs.length * 2); i++)
    {
      x = fs.get(i);
      if(x != -1)
      {
		  System.out.print(x + " ");
	  }
      else
      {
        System.out.println("Index " + i + " out-of-bounds");
	  }
    }
  }
}