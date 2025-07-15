import java.util.Scanner;
class Prime {

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n=in.nextInt();
        in.close();

        int flag=1;
        for(int i=2;i<n;i++){
            if(n%i==0){
                flag=0;
                break;
            }
        }

        if(flag==1){
            System.out.println("It is Prime Number");
        }
        else{
            System.out.println("It is Not Prime Number");
        }

    }
}
