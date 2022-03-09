// 3. Given a sorted array of non-negative distinct integers, find the smallest missing non-negative element in it.

//  Input: numb[] = [0, 1, 2, 6, 9, 11, 15]  Output: The smallest missing element is 3

//  Input: numb[] = [1, 2, 3, 4, 6, 9, 11, 15] Output: The smallest missing element is 0 .

// Input: numb[] = [0, 1, 2, 3, 4, 5, 6] Output: The smallest missing element is 7

public class MissingElement {
    public int missingElement(int[] arr1,int[] arr2,int[] arr3)
    {
        int i;
        int l1 = arr1.length;
        int l2 = arr2.length;
        int l3 = arr3.length;
        int max = Math.max(l1, Math.max(l2, l3));
        int[] arr = new int[max+1];


        return 0;
    }

    public static void main(String[] args) {
        
    }
}
