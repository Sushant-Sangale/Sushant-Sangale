import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        int length = 0;
        int temp = num;


       while(temp!=0){

            length = length +1;
           temp = temp/10;
       }
       int t2= num;
        int arm=0;
        int rem;
       while(t2!=0){
           int mul=1;
           rem = t2%10;
           for(int i=0; i<length; i++)
           {
                mul = mul*rem;
           }
           arm= arm+ mul;
           t2 = t2/10;

       }
       if(arm == num)
       {
           System.out.println("it is");
       }
       else
       {
           System.out.println("not");
       }
       }
    }




