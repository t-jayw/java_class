

/* Student s17tw, Tyler WOOD
 * Homework 7
 * Usage: java Homework9
 * Sample output: 
 *
not present
no 13th pet
2
Woof
Meow
cant walk this beast
 */

import java.util.ArrayList;

abstract class Pet{
    abstract void speak();
    abstract void eat();
    abstract boolean walkable();
}

class CantWalkException extends Exception{
    CantWalkException(){
        System.out.println("cant walk this beast");
    }
}

class Dog extends Pet{
    public void speak(){
        System.out.println("Woof");
    }

    public void eat(){
        System.out.println("Kibble, yummy");
    }
    
    public boolean walkable(){
        return true;
    }
}

class Cat extends Pet{
    public void speak(){
        System.out.println("Meow");
    }
    public void eat(){
        System.out.println("MEOWMIXMEOWMIXMEOWMIX");
    }
    public boolean walkable(){
        return false;
    }
}

class petSitJob{
    ArrayList<Pet>  petsToWatch = new ArrayList<>();

    public petSitJob(Pet... pets ){
        for ( Pet p : pets ) {
            petsToWatch.add( p );
        }
     }

    public void walkPets(ArrayList<Pet> pets){
        for ( Pet p : pets ) {
            try{
                p.speak();
                if(p.walkable() == false){
                    throw new CantWalkException();
                }
            }
            catch(CantWalkException e){
            }
        }
    }

    public void getRidOfUnluckyPets(){
        try{
            this.petsToWatch.remove(12);
        }
        catch(IndexOutOfBoundsException e){
            System.out.println("not present");
        }
        finally{
            System.out.println("no 13th pet");
        }
    }
}
class Homework9 {

    public static void main(String[] args){
    
    Dog Spike = new Dog();
    Cat Kitty = new Cat();    

    petSitJob job  = new petSitJob(Spike, Kitty);
    
    job.getRidOfUnluckyPets();

    System.out.println(job.petsToWatch.size()); 
    
    job.walkPets(job.petsToWatch);
    }
}

