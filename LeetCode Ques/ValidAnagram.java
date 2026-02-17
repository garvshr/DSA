import java.util.HashMap;
public class ValidAnagram {
    static void isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        // if(s.length() != t.length())
        //     return false;
        for(char c : s.toCharArray())
        {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for(char c : t.toCharArray())
        {
            if(!map.containsKey(c))
                System.out.print(c);
            else
            {
                map.put(c, map.get(c) - 1);
                if(map.get(c) == 0)
                    map.remove(c);
            }
        }
        System.out.print(map);
    }

    public static void main(String[] args) {
        isAnagram("anagram", "nagaram");
    }
}
