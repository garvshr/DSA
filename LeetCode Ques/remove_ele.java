public class remove_ele
{
    public static void main(String[] args) 
    {
        int nums[] = {1,2,3,4,5,6,1,2,1};
        int k = 0;
        int val=2;
        for(int i=0; i < nums.length; i++)
        {
            if(nums[i] != val)
            {
                nums[k++] = nums[i];
            }
        }
        
        System.out.print(k);
            
    }
}