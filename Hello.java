
interface mother {

    public void mshow();
};

interface father {

    public void fshow();
};

class child implements mother, father {

    public void hello() {
        System.out.println("Hello");
    }

    public void fshow() {
        System.out.println("Hello I am Father's Child");
    }

    public void mshow() {
        System.out.println("Hello I am Mother's Child");
    }
}

public class Hello {

    public static void main(String args[]) {
        child c = new child();
        c.fshow();
        c.mshow();
    }
}
