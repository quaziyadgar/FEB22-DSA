import java.util.Scanner;

//3. Write a recursive binary search

public class BinarySearch {
    static int binarySearch(int[] arr,int f,int l,int target)
    {
        if(f<l)
        {
        int mid = (f+l)/2;
        if(arr[mid] == target)
        return mid ;
        else if(arr[mid]<target)
        binarySearch(arr, mid, l, target);
        else
        binarySearch(arr, f, mid, target);
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int l = sc.nextInt();
        int[] arr = new int[l];
        System.out.println("Enter elements in array");
        for(int i = 0 ;i<l;i++)
            arr[i] = sc.nextInt();
        System.out.println("Enter target");
        int t = sc.nextInt();
        int b = binarySearch(arr, 0, l-1, t);
        if(b!=-1)
        System.out.println("Element present at "+(b+1));
        else
        System.out.println("Element not found");
        sc.close();
    }
}
