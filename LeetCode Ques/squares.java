public class squares 
{
    public static void main(String[] args) 
    {
        int arr[] = {-4,-1,0,3,10};
        int nums[] = new int[arr.length];
        int left = 0;
        int k = 0;
        int right= arr.length - 1;
        while(left <= right) 
        {
            if(Math.abs(arr[left]) > Math.abs(arr[right]))
            {
                nums[k++] = arr[left] * arr[left];
                left++;
            }
            else
            {
                nums[k++] = arr[right] * arr[right];
                right--;
            }
        }
        for (int i = 0; i < nums.length; i++) 
        {
            System.out.print(nums[i] + " ");
        }
    }    
}
