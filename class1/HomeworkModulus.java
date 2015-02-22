/* Student s##tw, Tyler WOOD (unsure of student number)
 * Homework 1
 * Usage: java HomeworkModulus num1 num2
 * Sample Output: 
 * The remainder of 4 mod 3 is 1
*/
/* The HomeworkModulus class is an application that displays the 
 * remainder of division of the first argument by the second argument
 *
 * The application requires the user to supply two arguments, both ints
 * and responds with error messages when this requirement is not met
*/


public class HomeworkModulus
{
    public static void main(String[] args)
    {
        int firstInt, secondInt, argumentModulus;
        if(args.length == 2)
        {
            try
            {
                firstInt = Integer.parseInt(args[0]);
                secondInt = Integer.parseInt(args[1]);
                argumentModulus = firstInt % secondInt;
                System.out.println("The remainder of " + firstInt +
                        " mod " + secondInt + " is " + argumentModulus);
            }
            catch (NumberFormatException e)
            {
                System.err.println("Please provide integers for arguments");
            }
        }
        else System.out.println("This program requires exactly 2 arguments");
    }
}
