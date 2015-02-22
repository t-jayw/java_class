/*
 * Student s17tw, Tyler WOOD
 * Homework 3
 * Usage: java Homework3 and then follow the prompts
 * Sample Output:
 * **PRIME CHECKER**
 * 1. Enter a number
 * 2. Quit the program
 * 1
 * Gimme an INT
 * 12
 * SORRRRRYYYYY NOT PRIME
 */

import java.util.Scanner;

class Homework3 {
   
    public static boolean primeChecker(int x){
        if( x%2 == 0 ) return false;
        for(int i = 3; i*i < x; i+=2){
            if( x%i == 0 ) 
                return false;
        }
        return true;
    }
    public static void main(String args[])
        throws java.io.IOException {
        
        char choice, ignore;
        int checkPrime;


        for(;;) {
            do {
                System.out.println("**PRIME CHECKER**");
                System.out.println(" 1. Enter a number");
                System.out.println(" Q. Quit the program");

                choice = (char) System.in.read();

                do {
                    ignore = (char) System.in.read();
                } while(ignore != '\n');
            } while(choice != 'Q' && choice != '1');

            if(choice == 'Q') break;

            else if(choice == '1') {
               
                System.out.println("Gimme an INT");

                Scanner getInt = new Scanner(System.in);
                checkPrime = getInt.nextInt();
                
                if(primeChecker(checkPrime)){
                    System.out.println("WOW " +
                            checkPrime + " IS PRIME WOW\n\n");
                }
                else{
                    System.out.println("SORRRRRYYYYY NOT PRIME \n\n");
                }  
            };
        }
    }
}
