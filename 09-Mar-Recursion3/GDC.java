import java.util.Scanner;

// 4. Find GCD of two number using recursion. GCD(4,8) => 4.        

public class GDC 
{
    static int div = 2;
    static int sum = 1;
    static int factors(int x,int y)
    {
        if(x>=div && y>=div){
            if(x%div == 0 && y%div==0)
            {
                sum *= div;
                factors(x/div, y/div);
            }
            else
            {
                ++div;
                factors(x, y);
            }
            }
                
        return sum;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two no for GDC : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int res = factors(a, b);
        System.out.println(res);
        sc.close();

    }
}
