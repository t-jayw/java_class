/*
 * Student s17tw, Tyler WOOD
 * Homework 7
 * Usage: java Homework7
 * Sample outpoot: "woof"
 */

class Mammal {
    String name;

    Mammal(String name){
        this.name = name;
    }

    public void announce(){
        System.out.println("I am " + this.name);
    }
}

class Dog extends Mammal {

    Dog(String name){
        super(name);
    }

    public  void announce(){
        System.out.println("Woof");
    }
}

class Homework7 {
    public static void main(String[] args){
        Dog spot = new Dog("spot");
        spot.announce();
    }
}
