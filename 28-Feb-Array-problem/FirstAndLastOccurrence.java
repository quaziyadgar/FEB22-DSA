class FirstAndLastOccurrence {
    public int[] searchRange(int[] nums , int target) {
        int[] arr = {-1,-1};
        // FirstAndLastOccurrence obj = new FirstAndLastOccurrence();
        int freq1 = frequency(nums, target, false);
        int freq2 = frequency(nums, target, true);
        // System.out.println(freq1+ " "+ freq2);
        if (nums.length == 0)
            return arr;
        else if (freq2-freq1+1 == 0)
            return arr;
        else{
            arr[0] = freq1;
            arr[1] = freq2;
            return arr;
        }
    }
    public int frequency(int[] nums, int target,boolean flag){
        int i,first = 0, len = nums.length, last = len,mid;
        
        for(i=0; i<len ; i++) {
            mid = (first+last)/2;
            if (nums[mid] == target)
            {
                if (flag)
                    first = mid;
                else
                    last = mid;
            }
            else if (nums[mid] > target)
                last = mid ;
            else
                first = mid ;
        }
        if (flag)
            return first;
        else
            return last;
    }

    public static void main(String[] args) {
        FirstAndLastOccurrence obj = new FirstAndLastOccurrence();
        int[] arr1 = {5,7,7,8,8,10};
        int target= 8;
        int[] res = obj.searchRange(arr1, target);
        System.out.println("["+res[0]+" "+res[1]+"]");
    }
}