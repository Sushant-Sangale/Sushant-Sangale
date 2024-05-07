import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num,elem;
        System.out.println("Enter the number of elements you want to enter : ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        int arr[]= new int[num];
        System.out.println("Enter the elements : ");
        for(int i=0;i<num;i++)
        {
            elem=sc.nextInt();
            arr[i]=elem;
        }
        System.out.println("the elements you entered are : ");
        for(int i=0;i<num;i++)
        {
            System.out.println(arr[i]);
        }
        System.out.println("the sorted elements are : ");
        int temp=0,flag=0;
        for(int i=0;i<num;i++)
        {
            for(int j=0;j<num-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=1;
                }

            }
            if(flag ==0){
                break;
            }

        }
        for(int i=0;i<num;i++)
        {
            System.out.println(arr[i]);
        }
    }
}