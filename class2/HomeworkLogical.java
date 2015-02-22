/*
* Student s17tw, Tyler WOOD
* Homework 2
* Usage: java HomeworkLogical, enter number followed by enter twice when prompted
* Sample Output: 
* "Both numbers are not odd"
* "The two numbers are equal"
*/

/* The HomeworkLogical class is an application that requests
 * the user to input two odd numbers. It checks the two 
 * values to see if both are odd, and also to see how the two
 * values relate to one another and prints this information to
 * the screen
*/

import java.util.Scanner;

public class HomeworkLogical
{
    public static void main(String[] args)
    {
        
        System.out.println("Please enter 2 odd numbers");
        
        Scanner sc = new Scanner(System.in);
        
        int userInput1 = sc.nextInt();
        int userInput2 = sc.nextInt();
        
        if(userInput1 % 2 == 0 || userInput2 % 2 == 0){
            System.out.println("Both numbers are not odd");
        }
        else{
            System.out.println("Both numbers are odd");
        }


        if(userInput1 == userInput2){
            System.out.println("The two numbers are equal");
        } else if(userInput1 > userInput2){
            System.out.println("The first number is larger");
        } else{
            System.out.println("The first number is smaller");
        }
    }
}
        
