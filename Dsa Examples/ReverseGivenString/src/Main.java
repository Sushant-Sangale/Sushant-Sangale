import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String str;
        System.out.println("Enter a new string");
        Scanner sc = new Scanner(System.in);
        str= sc.nextLine();
        int length = str.length();
        String rev = "";
        System.out.println("the reversed string is :");
        for(int i=length-1 ;i>=0;i--)
        {
            rev = rev + str.charAt(i);
        }
        System.out.println(rev);
    }
}