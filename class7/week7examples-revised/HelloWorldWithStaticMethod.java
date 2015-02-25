class HelloWorldWithStaticMethod
{
   static void myMethod()
   {
	   System.out.println("inside static myMethod");
   }

   public static void main(String[] args)
   {
          HelloWorldAbstract hwa = new HelloWorldAbstract();
          HelloWorldWithStaticMethod.myMethod();
          myMethod();
   }


}