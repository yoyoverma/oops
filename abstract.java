package OOPS;

abstract class Animal{
    abstract void walk();
    Animal(){//constructor
        System.out.println("you are creating a new Animal");
    }
    public void eat(){ // normal metgod without abstract
        System.out.println("Animal eats");
    }
}
class Horse extends Animal {
    Horse(){
        System.out.println("create a Horse");
    }
    public void walk(){
        System.out.println("walks on 4 legs");
    }
}
class Chicken extends Animal {
    public void walk(){
        System.out.println("walks on 2 legs");
    }
}

public class abstract{
    public static void main(String args[]) {
        Horse horse = new Horse();
        // horse.walk();
        // Animal animal = new Animal()
        // animal.walk();
        //abstract use kiya gya hai cannot initiate  
    }
}