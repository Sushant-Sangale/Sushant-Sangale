import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the number of elements");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int arr[]=new int[num];
        int sum = 0;
        System.out.println("Enter the Elements");
        for(int i=0; i< num; i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Addition of even integers : ");
        for(int i=0;i<num;i++)
        {
           if(arr[i]%2==0 )
           {
               System.out.println(arr[i]+ " + ");
               sum=sum+arr[i];
           }
        }
        System.out.println(" = " + sum);
    }
}