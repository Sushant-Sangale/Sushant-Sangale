import java.util.Scanner;

public class Main
{
    public static void main(String args[])
    {
        int num;
        System.out.println("Enter the number of elements : ");
        Scanner sc = new Scanner(System.in);
         num = sc.nextInt();
        int[] arr = new int[5];
        System.out.println("Enter the elements :" );
        for(int i = 0; i<num; i++)
        {
             arr[i]=sc.nextInt();
        }
        System.out.println("Entered Elements are : ");
        for(int j: arr)
        {
            System.out.println(j);
        }

        System.out.println("Sorted Elements are : ");
        int min;
        int temp=0;
        for(int i=0; i<num; i++)
        {
            min=i;
            for(int j = i+1; j<num;  j++)
            {
                if(arr[j]<arr[min])
                {
                    min = j;
                }
               temp = arr[i];
                arr[i] = arr[min];
                arr[min]=temp;
            }

        }
        for(int i : arr)
            System.out.println(i);
    }
}