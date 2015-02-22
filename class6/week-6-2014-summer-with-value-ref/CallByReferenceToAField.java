// Objects are passed by reference.
class Test
{
  int a, b; // instance variables (fields) available on all
            //    objects of the Test class

  Test(int i, int j)
  {
    a = i;
    b = j;
  }
  /* Pass a runtime object into the formal parameter.
     Therefore, referenced fields ob.a and ob.b on the
     object are subject to manipulation. */
  void change(Test ob)
  {
    ob.a = ob.a + ob.b;
    ob.b = -ob.b;
  }
}

class CallByReferenceToAField
{
  public static void main(String[] args)
  {
    Test ob = new Test(15, 20);

    System.out.println("ob.a and ob.b before call: " +
                       ob.a + " " + ob.b);

    ob.change(ob);

    System.out.println("ob.a and ob.b after call: " +
                       ob.a + " " + ob.b);
  }
}