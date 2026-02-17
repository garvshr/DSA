import java.util.Scanner;
public class palindromeString {

    static boolean checkP(String s, int i)
    {
        if(i >= s.length() / 2) 
            return true;
        if(s.charAt(i) != s.charAt(s.length() - i - 1)) 
            return false;
        return checkP(s, i + 1);
    }

    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        String s = ob.next();
        System.out.println(checkP(s, 0));;
    }
}
