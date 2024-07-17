public class remove_ele
{
    public static void main(String[] args) 
    {
        int arr[] = {1,2,3,4,5,6,1,2,1};
        int k = 0;
        int val=1;
        int left=0;
        int right = arr.length-1;
        for(int i=0; i < arr.length; i++)
        {
            if(arr[left] != arr[right])
            {
                arr[k++] = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) 
        {
            System.out.print(ans[i] + " ");
        }
            
    }
}