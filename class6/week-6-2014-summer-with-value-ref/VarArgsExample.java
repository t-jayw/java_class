public class VarArgsExample
{
    int sumArrays(int[]... intArrays)
    {
		System.out.println("intArrays.length is: " + intArrays.length);
        int sum, i, j;

        sum=0;
        for(i=0; i < intArrays.length; i++)
        {
            for(j=0; j < intArrays[i].length; j++)
            {
                sum += intArrays[i][j];
            }
        }
        return(sum);
    }

    public static void main(String[] args)
    {
        VarArgsExample va = new VarArgsExample();
        int sum=0;
        sum = va.sumArrays(new int[]{},
						   new int[]{0,1,2},
                           new int[]{0,1,2},
                           new int[]{100,200},
                           new int[]{1000});
        System.out.println("The sum of the numbers is: " + sum);
    }
}