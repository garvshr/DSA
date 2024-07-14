import java.util.*;
class duplicate {
    public List<Integer> findDuplicates(int[] nums) 
    {
        HashMap<Integer, Integer> hash = new HashMap<>();
        List<Integer> res = new ArrayList<>();
        for(int i=0 ; i<nums.length ; i++)
        {
            if(hash.getOrDefault(nums[i],0) == 0)
                hash.put(nums[i] , 1);
            else
                res.add(nums[i]);
        }
        return res;
    }
    public static void main(String[] args) 
    {
        duplicate ac=new duplicate();
        int[] test1 = {4,3,2,7,8,2,3,1};
        System.out.println(ac.findDuplicates(test1));
    }
}
