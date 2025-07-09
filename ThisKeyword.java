
class Pen {

    String name;
    int age;

    Pen(String iname,int iage) {
        name=iname;
        age=iage;

        System.out.println("Constructor Called Here");
    }

    public void output() {
        System.out.println("may name is " + name + " my age is " + age);
    }
}

public class ThisKeyword {

    public static void main(String args[]) {
        Pen p1 = new Pen("Aniket",22);
        // p1.name = "Aniket";
        // p1.age = 22;
        p1.output();
        Pen p2 = new Pen("Ankita",18);
        // p2.name = "Ankita";
        // p2.age = 18;
        p2.output();

    }
}
