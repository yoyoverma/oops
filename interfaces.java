package OOPS;
interface Animal{
    void walk();
    //constructor nhi hote not
    //non struct

}
interface herbivore{//multiple inhertence java ke andr classes se nhi hota interfaces se hota hai 

}
class Horse implements Animal, herbivore{
    public void walk(){ //public nhi likha by default assecc modifire default
        System.out.println("walks on 4 legs");
    }
}
public class interfaces {
    public static void main(String args[]){
        Horse horse = new Horse();
        horse.walk();
    }
}
