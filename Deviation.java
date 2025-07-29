import java.util.Scanner;

public class Deviation{

public static void main(String args[]){

    Scanner in=new Scanner(System.in);
    System.out.print("Enter Size : ");
    
    int n;
    n=in.nextInt();
    in.nextLine();
    String name[]=new String[n];
    int marks[]=new int[n];

    for(int i=0;i<n;i++){
        System.out.print("Name "+(i+1)+" : ");
        name[i] = in.nextLine(); 
    }

    for(int i=0;i<n;i++){
        System.out.print("Marks "+(i+1)+" : ");
        marks[i] = in.nextInt(); 
    }

    int avg=0;
    int sum=0;
    int dev=0;
    for(int i=0;i<n;i++){
        sum=sum+marks[i];
    }
    avg=sum/n;

    for(int i=0;i<n;i++){
        dev=marks[i]-avg;
        System.out.println(name[i]+" : "+dev);
    }



}
}