import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the string : ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int flag=0;
            char[] arr = str.toCharArray();
            for(int i=0; i<arr.length/2;i++)
            {
                if(arr[i] != arr[arr.length - i - 1])
                {
                    flag = 1;
                    System.out.println("false");
                    break;

                }

            }
            if(flag==0)
            {
                System.out.println("true");
            }
            }
            }






