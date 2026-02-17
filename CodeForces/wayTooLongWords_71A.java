import java.util.*;
public class wayTooLongWords_71A 
{
    public static void main(String[] args) 
    {
        Scanner ob = new Scanner(System.in);
        int n = ob.nextInt();
        ob.nextLine();
        for(int i = 1; i <= n; i++)
        {
            String st = ob.nextLine();
            int length = st.length();
            if(length > 10)
                System.out.println(st.charAt(0) + "" + (length - 2) + st.charAt(length - 1));
            else
                System.out.println(st);
        }
    }
}

//71A