// 1. Merge Sort

class MergeSort
{
    static void mergeSort(int[] arr,int l,int r)
    {
        if(l<r)
        {
            int m = (r+l)/2;
            mergeSort(arr, l, m);
            mergeSort(arr,m+1, r);

            merge(arr, l, m, r);
        }
    }
    void merge(int[] arr,int l,int r)
    {
        int n1 = m - l + 1;
        int n2 = r - m;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for( int i = 0; i<n1; i++)
            L[i] = arr[l+i];
        for( int i = 0; i<n2; i++)
            R[i] = arr[m + 1 + j];

        int i = 0, j = 0;

        int k = l;
        while(i<n1 && j<n2)
        {
            if(L[i] <= R[j])
            {
                arr[k] = L[i];
                i++;
            }
            else
            {
                arr[k] = R[j];
            }
            k++;
            while(i < n1)
            {
                arr[k] = L[i];
                i++;
                k++;
            }
            while(j < n2)
            {
                arr[k] = R[j];
                j++;
                k++;
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of an array : ");
        int l = sc.nextInt();
        int[] arr = new int[l];
        System.out.println("Enter the elements in an array : ");
        for(int i =0; i<l; i++)
        {
            arr[i] = sc.nextInt();
        }
        mergeSort(arr ,0 , arr.length-1);
        sc.close();
    }
}