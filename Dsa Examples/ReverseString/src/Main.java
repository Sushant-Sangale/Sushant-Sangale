import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the String");
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
       System.out.println("Reverse String is : ");
       int length = s1.length();
       String rev="";

       for(int i=length-1; i>=0;i--)
       {
          rev = rev+s1.charAt(i);

       }
       System.out.println(rev);

    }
}