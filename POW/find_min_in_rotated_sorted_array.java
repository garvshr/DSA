

public class find_min_in_rotated_sorted_array {
    public int findMin(int[] nums) 
    {
        int n = nums.length;
        int left = 0, right = n - 1;  
        int ans = nums[0];
        while(left <= right)
        {
            int mid = left + (right - left)/2;
            if(nums[mid] > nums[n-1])
            {
                left = mid + 1;
            }
            else
            {
                right = mid - 1;
                ans = nums[mid];
            }
        }
        return ans;
    }
}