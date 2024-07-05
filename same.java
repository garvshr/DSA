class same 
{
    static int nums[] = {4,3,2,7,8,2,3,1},n;
    static void similiar(int n)
    {
        int arr[]=new int[nums.length];
        int c=0;
        for(int i=0;i<nums.length;i++)
        {
            if(n==nums[i])
            {
                c++;
            }
        }
        for(int i=0 ; i<nums.length ; i++)
        {
            if(c>2)
            {
                arr[i]=n;
            }
        }
        for(int i=0 ; i<arr.length ; i++)
        {
            System.out.print(arr[i]);
        }
    }

    public static void main(String[] args) 
    {
        for(int i=0;i<nums.length;i++)
        {
            similiar(nums[i]);
        }
    }
}
