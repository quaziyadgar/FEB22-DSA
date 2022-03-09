// 2. For the given array = ['a','b','d','e','f','g','h','i','x','z'] use binary search to find the target element = 'z'.

public class BinarySearch 
{
    public static void main(String[] args)
    {
        BinarySearch obj = new BinarySearch();
        char[] arr = {'a','b','d','e','f','g','h','i','x','z'};
        char target = 'z';
        obj.binarySearch(arr, target);
    }

    public void binarySearch(char[] arr, char target)
    {
        int i;
        int first = 0;
        int last = arr.length;
        boolean flag = false;
        int mid = 0;
        for(i=0; i < arr.length; i++)
        {
            mid = (first+last)/2;
            if (arr[mid] == target)
                {
                    flag = true;
                    break;
                }
            else if(arr[mid] < target)
                first = mid;
            else
                last = mid;
        }
        if (flag)
            System.out.println("Element found at position = " + mid);
        else
            System.out.println("Element not present");
    }
}
