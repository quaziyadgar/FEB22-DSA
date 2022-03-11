import java.util.Scanner;

// 3. Write a recursive code to find the x^y . example: 2^5 = 32.        


public class PowerOnDigit {
    static long result = 1;
    static long powerOnDigit(int n,int p)
    {
        if(p>0)
        {
            result *= n;
            powerOnDigit(n, p-1);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no and its power");
        int n = sc.nextInt();
        int p = sc.nextInt();
        long res = powerOnDigit(n, p);
        System.out.println(res);
        sc.close();
    }
}
