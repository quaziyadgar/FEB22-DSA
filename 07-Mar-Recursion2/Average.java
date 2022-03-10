import java.util.Scanner;

//2. Calculate the avg of elements of an array using recursive code

public class Average {
    static int sum = 0;
    static int average(int[] arr,int n)
    {
        if(n>=0)
        {
            sum += arr[n];
            average(arr, n-1);
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array length : ");
        int n = sc.nextInt();
        System.out.println("Enter array : ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        arr[i] = sc.nextInt();
        System.out.println("Average = "+ average(arr, n-1));
    }
}
