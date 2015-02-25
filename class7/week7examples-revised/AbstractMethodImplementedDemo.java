abstract class HelloWorldAbstract
{
       //void myMethod();
       abstract void myMethod1(); // define
       //{System.out.println("ok");}
       abstract void myMethod2();
}

abstract class ImplementAbstract extends HelloWorldAbstract
{
   void myMethod1() {} // implemented by curly braces. It is legal to have an empty implementation.
}

class ImplementAbstract2 extends ImplementAbstract
{
   void myMethod2() {} // implemented by curly braces. It is legal to have an empty implementation.
}

class AbstractMethodImplementedDemo
{
   public static void main(String[] args)
   {
          // HelloWorldAbstract hwa = new HelloWorldAbstract(); // cannot instantiate an abstract class
          // hwa.myMethod();
          ImplementAbstract2 ia = new ImplementAbstract2(); // cannot instantiate an abstract class
          ia.myMethod1();
          System.out.println("ok 1");

          ia.myMethod2();
          System.out.println("ok 2");
   }
}