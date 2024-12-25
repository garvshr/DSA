import java.util.ArrayList;
import java.util.List;

public class SOD_strings 
{
    static int position(char c) 
    {
        c = Character.toLowerCase(c);
        return c - 'a' + 1;
    }
    
    static int transform(int n) 
    {
            int sum = 0;
            while (n > 0) {
                sum += n % 10;
                n = n / 10;
            }
            return sum;
        }
        public int getLucky(String s, int k) 
        {
            List<Integer> st = new ArrayList<>();
        for(int i=0; i < s.length(); i++)
        {   
            st.add(position(s.charAt(i)));
        }
        int sum = 0;
        for(int i = 0; i < st.size(); i++)
        {
            if(st.get(i) > 9)
                {
                    int n = st.get(i);
                    while(n > 0)
                    {
                        sum += n % 10;
                        n = n/10;
                    }

                }
                else
                    sum += st.get(i);
        }
        
        while(k > 1)
        {
            sum = transform(sum);
            k--;
        }
        return sum;
        }
    
        public static void main(String[] args) 
        {
            SOD_strings sol = new SOD_strings();
            System.out.println(sol.getLucky("abc", 1));
            System.out.println(sol.getLucky("abc", 2)); 
            System.out.println(sol.getLucky("leetcode", 2)); 
        }
    }
    
