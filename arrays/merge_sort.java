public class merge_sort 
{
    static void conquer(int arr[], int si, int mid, int ei)
    {
        int merged[] = new int[ei - si +1];
        int n1 = si;
        int n2 = mid+1;
        int x = 0;

        while(n1 <= mid && n2 <= ei)
        {
            if(arr[n1] <= arr[n2])
                merged[x++] = arr[n1++];
            else
                merged[x++] = arr[n2++];
        }

        while(n1 <= mid)
            merged[x++] = arr[n1++];
        
        while(n2 <= ei)
            merged[x++] = arr[n2++];

        for(int i=0, j=si; i < merged.length; i++, j++)
        {
            arr[j] = merged[i];
        }

    }

    static void divide(int arr[], int si, int ei)
    {
        int mid = si + (ei - si)/2;
        if(si >= ei)
            return;
        divide(arr, si, mid);
        divide(arr, mid+1, ei);
        conquer(arr, si, mid, ei);
    }

    public static void main(String[] args) 
    {
        int arr[] = {54,6,36,57,63,6,1,6,456,0};
        divide(arr, 0, arr.length-1);
        for(int i=0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}