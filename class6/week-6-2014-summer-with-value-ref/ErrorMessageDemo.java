class ErrorMessage
{
// invisible default constructor provided for our convenience. It takes no argument. It creates the object and does not initialization of values. However, the newly created object does INHERIT all the methods and instance variable of that class, if any.

  String[] errorMessageArray =
  {
    "Output Error",
    "Input Error",
    "Disk Full",
    "Index Out-Of-Bounds"
  };

  // Return the error message.
  String getErrorMessage(int i)
  {
    System.out.println("array length is : " + errorMessageArray.length);
    // System.out.println("4th element is : " + errorMessageArray["apple"]);

    if(i >=0 & i < errorMessageArray.length)
    {
	   return errorMessageArray[i];
	}
	else
	{
      return "Invalid Error Code";
    }
  }
}

class ErrorMessageDemo
{
  public static void main(String[] args)
  {
    ErrorMessage err = new ErrorMessage(); // call the constructor to instantiate an object of type ErrorMessage with the reference err
    System.out.println(err.getErrorMessage(2));
    System.out.println(err.getErrorMessage(19));
  }
}