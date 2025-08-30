
import java.util.Scanner;


class Parent {

    public void pout() {
        System.out.println("Hello I am Parent");
    }
}

class Child1 extends Parent{

    public void c1out() {
        System.out.println("Hello I am Child1");
    }

}

class Child2 extends Parent{

    public void c2out() {
        System.out.println("Hello I am Child2");
    }

}




public class Inheritance {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        Child1 c1 = new Child1();
        Child2 c2 = new Child2();
        c1.c1out();
        c1.pout();
        c2.c2out();
        c2.pout();

        in.close();
    }
}


// Sigle Inheritance
// Multilevel Inheritance
// Heirarchial Inheritance
// Hybrid Inheritance