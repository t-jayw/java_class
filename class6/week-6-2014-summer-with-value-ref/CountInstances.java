// static field and methods
public class CountInstances
{
    private static int numInstances = 0;

    protected static int getNumInstances()
    {
        return numInstances;
    }

    private static void addInstance()
    {
        numInstances++;
    }

    CountInstances()
    {
        CountInstances.addInstance();
    }

    public static void main(String[] arguments)
    {
        System.out.println("Starting with " +
            CountInstances.getNumInstances() + " instances");

        // Can I use a foreach here?
        for(int  i = 0; i < 10; ++i)
        {
            new CountInstances().addInstance(); // call method on unnamed object
        }
        System.out.println("Created " +
            CountInstances.getNumInstances() + " instances");  // access to static class member
    }
}
