import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter a new string");
        Scanner sc = new Scanner(System.in);
        String str= sc.nextLine();
        StringBuilder string = new StringBuilder();


        char []chr = str.toCharArray();
        for(int i = 0; i<chr.length;i++)
        {
            boolean rep = false;
            for (int j = i + 1; j < chr.length; j++) {
                if (chr[i] == chr[j]) {
                    rep = true;
                    break;
                }
            }
            if (!rep ) {
                string.append(chr[i]);
            }
        }
        System.out.println("String is : " + string);
    }
}