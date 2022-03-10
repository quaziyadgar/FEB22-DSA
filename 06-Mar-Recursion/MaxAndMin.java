// 1.Write a recursive code for finding the max and min element in the given array arr ={1,-1,0,2,-2,3,-3,4,-4}
//         NOTE: pass arr in every function call.


public class MaxAndMin {
    static int max(int[] arr,int i) throws Exception
    {
        if(i==1)
            return arr[0];
        
            return Math.max(arr[i-1], max(arr, i-1));
            
    }
    static int min(int[] arr,int i) throws Exception
    {
        if(i==1)
            return arr[0];
        
            return Math.min(arr[i-1], max(arr, i-1));
            
    }

    public static void main(String[] args) throws Exception {
        int[] arr= {1,-1,0,2,-2,3,-3,4,-4};
    
        System.out.println("Max = "+max(arr,arr.length));
        System.out.println("Min = "+min(arr,arr.length));
    }
}
