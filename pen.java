package OOPS;
class Pen {
    String color;
    String type;
    public void write(){
        System.out.println("writeing somethingasa");
    }
    public void printColor(){
        System.out.println(this.color); // this can be defined as java keyword this fuction which object to be call
    }
}
//objects
public class pen {
    public static void main(String args[]){
        Pen pen1 = new Pen();
        pen1.color = "blue";
        pen1.type ="gel";

        pen1.write();

        Pen pen2= new Pen();
        pen2.color = "voilet";
        pen2.type = "ballpoint";

        pen1.printColor();
        pen2.printColor();
    }
}
