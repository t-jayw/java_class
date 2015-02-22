public class VarArgsAllowsMethodToAcceptFlexibleNumberOfArguments
{
  // v is a varargs parameter.
  static void methodWithVarArgs(String anyString, int ... v)
  {
    System.out.print(anyString + v.length + " Contents: ");
    for(int x : v)
      System.out.print(x + " ");
    System.out.println();
  }
  public static void main(String[] args)
  {
    methodWithVarArgs("One vararg: ", 10);
    methodWithVarArgs("Three varargs: ", 1, 2, 3);
    methodWithVarArgs("Five varargs: ", 1, 2, 3, 4, 5);
    methodWithVarArgs("No varargs: ");
    // methodWithVarArgs(1, "No varargs: "); // illegal
  }
}