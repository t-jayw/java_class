class StoreStringAsTypeObjectReversed
{
    public static void main(String[] args)
    {
        String[] myStringArray = new String[3];
        myStringArray[0] = new Object();
        System.out.println(myStringArray[0].getClass());
    }
}