import java.util.*;
class TwoSum {
    public int[] twoSum(int[] nums, int target) 
    {
        int i;
        HashMap<Integer,Integer> indexMap = new HashMap<Integer,Integer>();
        for (i = 0; i<nums.length; i++)
        {
            Integer required = (Integer) (target - nums[i]);
            if (indexMap.containsKey(required))
            {
                int arr[] = {indexMap.get(required),i};
                return arr;
            }
            else
                indexMap.put(nums[i],i);
        }
    return null;
    }
    void display(int[] arr)
    {
        for (int i = 0; i<arr.length; i++)
        System.out.print(arr[i]+",");
    }
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int target = 9;
        TwoSum obj = new TwoSum();
        int[] res = obj.twoSum(arr, target);
        obj.display(res);
    }
}
