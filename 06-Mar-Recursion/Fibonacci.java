import java.util.Scanner;

// 2.Write a recursive code for printing the Fibonacci series up to N. 
//         example : if the user enters 10 , then print 1,1,2,3,5,8,13,21,34,55


public class Fibonacci {
    static int n1=0,n2=1,n3=0;
    static void fibonacci(int n)
    {
        if(n>0)
        {
            n3 = n1 + n2;    
            n1 = n2;    
            n2 = n3; 
            System.out.print(" "+n3);
            fibonacci(n-1);
        }
       
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no for fibonacci");
        int n = sc.nextInt();
        System.out.print(n1+" "+n2);
        fibonacci(n-2);
        sc.close();
    }
}
