import java.util.Scanner;
public class EvenOddArray{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);

        int n;
        System.out.print("Enter Size : ");
        n=in.nextInt();
        int arr[]=new int[n];

        System.out.print("Enter Elements : ");
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }

        int even[]=new int[n];
        int odd[]=new int[n];
        int e=0;
        int o=0;

        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                even[e]=arr[i];
                e++;
            }
            else{
                odd[o]=arr[i];
                o++;
            }
        }


        System.out.print("Even Members are : ");
        for(int i=0;i<e;i++){
            System.out.print(even[i]+" ");
        }
        
        System.out.print("\nOdd Members are : ");
        for(int i=0;i<o;i++){
            System.out.print(odd[i]+" ");
        }

    }

}