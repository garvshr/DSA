public class two_pointer 
{
    static void swap(int arr[], int left, int right)
    {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

    static void print(int arr[])
    {
        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    public static void main(String[] args) 
    {
        int arr[] = {2,6,25,38,67,44,89,69};
        int n = arr.length;
        int left=0, right=n-1;
        
        while(left <= right)
        {
            if(arr[left] % 2 == 1 && arr[right] % 2 == 0)
            {
                swap(arr, left, right);
                left++;
                right--;
            }
            if(arr[left] % 2 == 1)
                left++;
            if(arr[right] % 2 == 0)
                right--;
        }    
        print(arr);
    }
}
