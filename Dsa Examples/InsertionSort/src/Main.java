import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the number of elements : ");
        Scanner sc = new Scanner(System .in);
        int num = sc.nextInt();
        int arr[]= new int[5];
        System.out.println("Enter the elements : ");
        for(int i=0; i<num; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Sorted Elements are : ");
        int temp,j;
        for(int i=1; i<num; i++)
        {
            j = i;
            temp = arr[i];
            while(j>0 && arr[j-1]>temp)
            {
                arr[j]=arr[j-1];
                j=j-1;
            }
            arr[j]=temp;
            }
        for(int i: arr)

        {
            System.out.println(i);
        }
        }

    }
