// Error codes implemented as constants.  
class ErrorMsg 
{  
  final int OUTER_ERROR = 0; 
  final int INNER_ERROR = 1; 
  final int DISK_ERROR  = 2; 
  final int INDEX_ERROR = 3; 
 
  String[] msgs = 
  {  
    "Output Error",  
    "Input Error",  
    "Disk Full",  
    "Index Out-Of-Bounds"  
  };  
  
  // Return the error message.  
  String getErrorMsg(int i) {  
    if(i >=0 & i < msgs.length)  
      return msgs[i];  
    else  
      return "Invalid Error Code";  
  }  
}  
  
class FinalForErrorMessage 
{  
  public static void main(String[] args) 
  {  
    ErrorMsg err = new ErrorMsg();  
  
    System.out.println(err.getErrorMsg(err.OUTER_ERROR));  
    System.out.println(err.getErrorMsg(err.DISK_ERROR)); 
    //err.getErrorMsg(err.OUTER_ERROR = 17);
    //31: cannot assign a value to final variable OUTER_ERROR
  }  
}