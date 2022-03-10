import java.util.Scanner;

// 3.Write a head recursion code to print only EVEN elements in decreasing order starting from user-defined input N.
//         example: N = 76 
//                        Output: 76,74,72,70,68,66......2

public class PrintEven {
    static void printEven(int n)
    {
        if(n>0)
        {
            System.out.print(n+" ");
            printEven(n-2);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a range : ");
        int n = sc.nextInt();
        if(n%2==0)
        printEven(n);
        else
        printEven(n-1);
        sc.close();
    }
}
