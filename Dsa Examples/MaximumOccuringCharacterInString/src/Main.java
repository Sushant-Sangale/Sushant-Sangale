import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the String : ");
        Scanner sc = new Scanner(System.in);
        String st=sc.nextLine();
        int arr[] = new int[127];
        int max = -1;
        char c=' ';
        int x = 0;
        for(int i=0;i<st.length();i++)
        {
            arr[st.charAt(i)]=arr[st.charAt(i)]+1;
        }
        for(int i = 0;i<st.length();i++)
        {
            if(arr[st.charAt(i)] > max )
            {
                max = arr[st.charAt(i)];
                c=st.charAt(i);
                x=i;
            }
        }
        System.out.println("Maximum occurring character in string is " + c + " and it occurred "+ arr[st.charAt(x)] +" times");

    }
}