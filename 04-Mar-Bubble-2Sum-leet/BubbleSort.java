class BubbleSort {
    public int[] sortArray(int[] nums) {
        int i;
        for(i = 0; i<nums.length-1; i++)
        {
            for(int j = 0; j<nums.length-i-1; j++)
            {
                if (nums[j] > nums[j+1])
                {
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        return nums;
    }
    void display(int[] arr)
    {
        for (int i = 0; i<arr.length; i++)
        System.out.print(arr[i]+",");
    }
    public static void main(String[] args) {
        int[] arr = {51,4,45,21,3,8,7,5,4,6,4,99};
        BubbleSort obj = new BubbleSort();
        obj.sortArray(arr);
        obj.display(arr);
    }
}