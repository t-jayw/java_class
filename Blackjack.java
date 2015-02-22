import java.util.Scanner;
import java.util.Random;



class Card
{
    public int suit;
    public int value;

    public Card(int Suit, int Value){
        this.suit = Suit;
        this.value = Value;
    }
    public void announce(){
        System.out.println("sup I'm " + suit + " and " + value);
    }
}

class Deck
{
    
    public Card[] deck = new Card[52];
    
    int i, q;
    public void buildDeck(){
        for(i = 1, q = 0; i < 5; i++, q++){
            for(int j = 1; j < 14; j++,q++){
              System.out.println(q);
              deck[q] = new Card(i,j);
            }
        }
    }
}
        



public class Blackjack
{
    public static void main(String[] args)
    {
        
        Deck foo = new Deck();
        foo.buildDeck();
        Card bar = foo.deck[7];
        bar.announce();
        }
}

      

