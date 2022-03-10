// import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

// 3. Given a sorted array of non-negative distinct integers, find the smallest missing non-negative element in it.

//  Input: numb[] = [0, 1, 2, 6, 9, 11, 15]  Output: The smallest missing element is 3

//  Input: numb[] = [1, 2, 3, 4, 6, 9, 11, 15] Output: The smallest missing element is 0 .

// Input: numb[] = [0, 1, 2, 3, 4, 5, 6] Output: The smallest missing element is 7

public class MissingElement {
    static void missingElement(int[] arr1,int[] arr2,int[] arr3)
    {
        int l1 = arr1.length;
        int l2 = arr2.length;
        int l3 = arr3.length;
        Set<Integer> set = new HashSet<>();
        for(int i:arr1)
        {
            set.add(i);
        }
        for(int i:arr2)
        {
            set.add(i);
        }
        for(int i:arr3)
        {
            set.add(i);
        }
        
        for(int i=0;i<l1;i++)
        {
            if(!set.contains(arr1[i]))
            {
                System.out.println("Missing min element from arr1"+arr1[i]);
                break;
            }
        }
        for(int i=0;i<l2;i++)
        {
            if(!set.contains(arr2[i]))
            {
                System.out.println("Missing min element from arr2"+arr2[i]);
                break;
            }
        }
        for(int i=0;i<l3;i++)
        {
            if(!set.contains(arr3[i]))
            {
                System.out.println("Missing min element from arr3"+arr3[i]);
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {0, 1, 2, 6, 9, 11, 15};
        int[] b = {1, 2, 3, 4, 6, 9, 11, 15};
        int[] c = {0, 1, 2, 3, 4, 5, 6};
        missingElement(a, b, c);
    }
}
