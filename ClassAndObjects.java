class Anger {
    static int n = 10;

    static void out() {
        System.out.println("Hello");
    }
}

public class ClassAndObjects extends Anger {

    public static void main(String[] args) {

        n = 90;
        Anger.out();
        System.out.println(Anger.n);

    }
}
