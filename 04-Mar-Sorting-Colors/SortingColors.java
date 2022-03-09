class SortingColors {
    public void sortColors(int[] nums) {
        int i=0, start=0,end = nums.length-1;
        if (nums.length != 1)
        {
            while(i<=end)
            {
            
            if (nums[i] == 0)
            {
                int temp = nums[i];
                nums[i] = nums[start];
                nums[start] = temp;
                start++;
                i++;
            }
            else if (nums[i] == 2)
            {
                int temp = nums[i];
                nums[i] = nums[end];
                nums[end] = temp;
                end--;
            }
            else
                i++;
            }
        }
        
    }
    void display(int[] arr)
    {
        for (int i = 0; i<arr.length; i++)
        System.out.print(arr[i]+",");
    }
    public static void main(String[] args) {
        int[] arr = {1,0,2,1,2,0,1,0};
        SortingColors obj = new SortingColors();
        obj.sortColors(arr);
        obj.display(arr);
    }
}