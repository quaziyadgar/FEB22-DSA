import java.util.Scanner;

//1. Reverse a number using a recursive program.
/**
 * Reverse
 */
public class Reverse {
    static int rev=0;
    static int reverse(int n)
    {
        if(n>0)
        {
            int temp = n%10;
            rev = rev*10 + temp;
            reverse(n/10);
        }
        return rev;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no. to reverse");
        int n = sc.nextInt();
        System.out.println(reverse(n));
        sc.close();
    }
}