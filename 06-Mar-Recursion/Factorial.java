import java.util.Scanner;

// 4.Write a recursive code to find the factorial of a user defined N 
//         example : N = 5 => 5! => 120 must be printed on screen.     

public class Factorial {
    static int fact(int n)
    {
        if(n==1)
            return 1;
        else
            return n*fact(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no for factorial ");
        int n =sc.nextInt();
        System.out.println(fact(n));
        sc.close();
    }
}
