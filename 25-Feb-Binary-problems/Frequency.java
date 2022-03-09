// 1. Find the frequency of an element in a sorted array with duplicates present. for eg: [1,1,2,2,4,5,5,6,6,6,6,9,10,11] and target = 6 using binary search.

class Frequency
{
    public static void main(String[] args)
    {
        Frequency obj = new Frequency();
        int arr[] = {1,1,2,2,4,5,5,6,6,6,6,9,10,11};
        int target = 6;
        int feq1 = obj.frequency(arr,target,false);
        int feq2 = obj.frequency(arr, target, true);
        int feq = feq2 - feq1 + 1;
        System.out.println("Frequency of "+target+" = "+ feq);
    }

    public int frequency(int[] arr, int target,boolean flag)
    {
        int len = arr.length;
        int i;
        int first =0;
        int last = len;
        for(i = 0; i<len; i++)
        {
            int mid = (first+last)/2;
            if(arr[mid] == target)
            {
                if(flag)
                {
                    first = mid;
                }
                else{
                    last = mid;
                }
            }
            else if(arr[mid] < target)
                first = mid;
            else
                last = mid;
        }
        if(flag)
        return first;
        else
        return last;
    }
}