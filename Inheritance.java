
import java.util.Scanner;

class GrandParent{
    public void gout(){
        System.out.println("Hello I am GrandParent");
    }
}

class Parent extends GrandParent{

    public void pout() {
        System.out.println("Hello I am Parent");
    }
}

class Child extends Parent {

    public void cout() {
        System.out.println("Hello I am Child");
    }

}



public class Inheritance {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        Child c = new Child();
        c.cout();
        c.pout();

        in.close();
    }
}
