import java.util.*;
public class unique_occ 
{
    public boolean uniqueOccurrences(int[] arr) 
    {
        HashMap<Integer, Integer> nums = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();

        for(int i : arr)
        {
            nums.put(i , nums.getOrDefault(i,0)+1);
        }

        for(int j : nums.values())
        {
            if(!set.add(j))
                return false;
        }
        return true;
    }
    public static void main(String[] args) 
    {
        unique_occ ac=new unique_occ();
        int[] test1 = {1, 2, 2, 1, 1, 3};
        int[] test2 = {1, 2};
        int[] test3 = {-3, 0, 1, -3, 1, 1, 1, -3, 10, 0};
        System.out.println(ac.uniqueOccurrences(test1));
        System.out.println(ac.uniqueOccurrences(test2));
        System.out.println(ac.uniqueOccurrences(test3));
    }
}
