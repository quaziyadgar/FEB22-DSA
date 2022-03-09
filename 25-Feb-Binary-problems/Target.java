// 4. Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

//  Input: nums = [1,3,5,6], target = 2 Output: 1 
// Input: nums = [1,3,5,6], target = 7 Output: 4

/**
 * Target
 */
public class Target {

    public int target(int[] arr, int target) 
    {
        int i,first = 0, len = arr.length, last = len, mid=-1;
        for(i = 0; i < len; i++) 
        {
            mid = (first+last)/2;
            if (arr[mid] == target)
                return mid;
            else if(arr[mid]>target)
                last = mid;
            else
                first = mid;
        }
        return mid+1;
    }

    public static void main(String[] args) {
        Target obj = new Target();
        int[] num1 = {1,3,5,6};
        int target1 = 2;
        int res = obj.target(num1, target1);
        int[] num2 = {1,3,5,6};
        int target2 = 7;
        int res2 = obj.target(num2, target2);
        System.out.println("Target1 "+res);
        System.out.println("Target1 "+res2);
    }
}