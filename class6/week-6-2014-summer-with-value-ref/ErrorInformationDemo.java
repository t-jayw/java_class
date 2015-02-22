// Return a programmer-defined object.
class ErrorSeverity
{
  String errorMessage; // error message
  int errorSeverity; // code indicating errorSeverity of error

  ErrorSeverity(String m, int s) // int value can be a reference to an element in an array
  {
    errorMessage = m;
    errorSeverity  = s;
  }
}

class ErrorInfo
{
  String[] errorMessagesArray =
  {
    "Output Error",
    "Input Error",
    "Disk Full",
    "Index Out-Of-Bounds"
  };
  int[] severityAsInt = { 3, 3, 2, 4 };

  ErrorSeverity getErrorInfo(int i)
  {
    if(i >= 0 & i < errorMessagesArray.length)
    {
      return new ErrorSeverity(errorMessagesArray[i], severityAsInt[i]); // call a constructor for the ErrorSeverity class
    }
    else
    {
      return new ErrorSeverity("Invalid Error Code", 0);
    }
  }
}

class ErrorInformationDemo
{
  public static void main(String[] args)
  {
    ErrorInfo errorInfo = new ErrorInfo();
    ErrorSeverity es;

	// call a method that calls the constructor of a different class
    es = errorInfo.getErrorInfo(2); // assign to e the return value of the method on the errorInfo object
    System.out.println(es.errorMessage + " errorSeverity: " + es.errorSeverity);

    es = errorInfo.getErrorInfo(19);
    System.out.println(es.errorMessage + " errorSeverity: " + es.errorSeverity);
  }
}