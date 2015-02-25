class StoreStringAsTypeObject2
{
    public static void main(String[] args)
    {
        Object[] myObjectArray = new Object[3];
        myObjectArray[0] = new String();
        System.out.println(myObjectArray[0].getClass());
    }
}