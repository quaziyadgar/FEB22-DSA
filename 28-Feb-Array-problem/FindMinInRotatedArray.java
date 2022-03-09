import java.net.SocketPermission;

class FindMinInRotatedArray {
    public int findMin(int[] nums) {
        int i,first=0,last=nums.length,mid;
        
        for(i=0 ; i < nums.length; i++)
        {
            mid = (first+last)/2;
            // if(nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1])
            //     return(nums[mid+1]%nums.length);
            if (nums[mid]<nums[mid<1?nums.length-1:mid-1] && nums[mid]<nums[(mid+1)%nums.length])
                return(nums[mid]);
            else if (nums[mid]>nums[mid<1?nums.length-1:mid-1] && nums[mid]>nums[nums.length-1])
                first = mid;
            else
                last = mid;
        }
    return (nums[0]);
    }


    public static void main(String[] args) {
        FindMinInRotatedArray obj = new FindMinInRotatedArray();
        int[] arr = {3,4,5,1,2};
        int[] arr2 = {4,5,6,7,0,1,2};
        int[] arr3 = {11,13,15,17};
        int res1 = obj.findMin(arr);
        int res2 = obj.findMin(arr2);
        int res3 = obj.findMin(arr3);
        System.out.println("Min value of {3,4,5,1,2} = "+res1);
        System.out.println("Min value of {4,5,6,7,0,1,2} = "+res2);
        System.out.println("Min value of {11,13,15,17} = "+res3);
    }
}