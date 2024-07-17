public class merge_sorted_arr 
{
    public static void main(String[] args) 
    {
        int nums1[] = {1,2,3,0,0,0};
        int nums2[] = {2,5,6};
        int n = 3, m = 3;
        int k=0;
        for(int i = m; i < nums1.length; i++)
        {
            nums1[i] = nums2[k++];
        }
        int left = 0;
        int kk = 0;
        int right= nums1.length - 1;
        int num[] = new int[nums1.length];
        while(left <= right) 
        {
            if(nums1[left] > nums1[right])
            {
                num[kk++] = nums1[left];
                left++;
            }
            else
            {
                num[kk++] = nums1[right];
                right--;
            }   
        }
        for (int i = 0; i < num.length; i++) 
        {
            System.out.print(num[i] + " ");
        }
    }
} 
