public class Recursion{
    static void hello(int n){
        System.out.println(n);
        if(n<100){
            hello(n+1);
        }
    }
    public static void main(String[] args) {
        hello(5);
    }
}