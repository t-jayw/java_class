class StoreStringAsTypeObject
{
    public static void main(String[] args)
    {
        Object[] myObjectArray = new Object[3];
        String myString = new String();
        myObjectArray[0] = myString;
        System.out.println(myObjectArray[0].getClass());
    }
}
