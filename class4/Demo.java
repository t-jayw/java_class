/*
Student s17tw, Tyler WOOD
Homework 4
Usage: java Demo and follow prompts.
    it's a dumb dice game that will have you instantiate a dice object
    with the parameter of how many faces the die has. 
    it also instantiates a player object with 10 as a parameter for how many
    credits the player has.
    
    the prompts take you through the game play, but basically you wager 
    your credits for the number of times the dice is rolled, and each
    time the users selected number is rolled, they earn a credit

Sample Output:
~*WELCOME TO THE GUESSING GAME*~
**WHAT IS YOUR NAME?**
TYler
**HELLO TYler**
**HOW MANY FACES DOES YOUR DIE HAVE?**
8
**PLAYING WITH A  8 FACED DIE**
**GUESS A NUMBER THAT WILL BE ROLLED**
3
**HOW MANY ROLLS WOULD YOU LIKE TO BUY?**
**YOU CAN BUY 10 ROLLS**
**HOW MANY ROLLS DO YOU WANT TO BUY?**
1
**ROLLING 1 TIMES**
__YOU ROLLED 3

**YOU GUESSED IT. + 1 CREDIT**

*/

import java.util.Random;
import java.util.Scanner;

class Dice{
    
    // fields
    int max_dice_val;
    final int MIN_DICE_VAL = 1;
    int roll_value;

    // constructor 
    Dice( int max ){
        max_dice_val = max;
    }

    // methods
    public void rollDice(){
        
        Random randomRoll = new Random();
                
        roll_value = randomRoll.nextInt( max_dice_val );
        
        System.out.println( "__YOU ROLLED "+roll_value+"\n" );
    }
    
    public void announce(){
        System.out.println( "**PLAYING WITH A  "+max_dice_val+" FACED DIE**" );
    }
    
    public void runGame( Player currentplayer ){
        int score = 0;
        for( int i = 0; i < currentplayer.num_rolls; i++ ){
            int current_role = this.rollDice();
            if ( current_role == currentplayer.roll_guess ){
                currentplayer.credit += 1;
                System.out.println( "**YOU GUESSED IT. + 1 CREDIT**" );
            }
            else continue;
        }
        System.out.println( "**YOU NOW HAVE "+currentplayer.credit+" CREDITS**" );
    }
}

class Player{

    int credit;
    String player_name;
    int roll_guess;
    int num_rolls;
    int user_roll_input;
        
    Player( int init_credits ){
        credit = init_credits;
    }
   
    public void getName(){
        System.out.println( "**WHAT IS YOUR NAME?**" );
        Scanner namesc = new Scanner( System.in );
        player_name = namesc.next();
    }
                
    public void chooseNumber() {
        System.out.println( "**GUESS A NUMBER THAT WILL BE ROLLED**" );
        Scanner sc = new Scanner( System.in );
        roll_guess = sc.nextInt();
    }
    
    public void buyRolls() {
        System.out.println( "**YOU CAN BUY "+credit+" ROLLS**" );

        Scanner getNumRolls = new Scanner( System.in );
        do{
            System.out.println( "**HOW MANY ROLLS DO YOU WANT TO BUY?**" );
            user_roll_input = getNumRolls.nextInt();
            if ( user_roll_input > credit ){
                System.out.println( "**YOU DON'T HAVE THAT MANY CREDITS**" );
            }
            else{
                System.out.println( "*ROLLING "+user_roll_input+" TIMES**" );
            } 
        } while( user_roll_input > credit );
        
        num_rolls = user_roll_input;
        credit -= num_rolls;
        
        System.out.println( "**YOU NOW HAVE "+credit+" CREDITS**" );
        }
}

public class Demo{
    public static void main( String[] args ){
    
    System.out.println("~*WELCOME TO THE GUESSING GAME*~");

   
    // Instantiate player, assign name 
    Player GamePlayer = new Player( 10 );
    GamePlayer.getName();
    
    System.out.println( "**HELLO "+GamePlayer.player_name+"**" );
    System.out.println( "**HOW MANY FACES DOES YOUR DIE HAVE?**" );
    
    // Instantiate Dice, assign max val
    Scanner sc = new Scanner( System.in );
    int dice_size = sc.nextInt();
    Dice GameDice = new Dice( dice_size );
    GameDice.announce();
    
    while(GamePlayer.credit > 0){
        GamePlayer.chooseNumber();

        System.out.println( "**HOW MANY ROLLS WOULD YOU LIKE TO BUY?**" );

        GamePlayer.buyRolls();
        
        GameDice.runGame( GamePlayer );   
        }
    }
}








