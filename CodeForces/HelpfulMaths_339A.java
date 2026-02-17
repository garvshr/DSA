
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class HelpfulMaths_339A 
{
	public static void main(String[] args) 
    {
        Scanner ob = new Scanner(System.in);
        String st = ob.nextLine();
        String test = "";
        for(char c : st.toCharArray())
        {
            if(Character.getNumericValue(c) >= 0 && Character.getNumericValue(c) <= 9)
                test += c;
        }
        List<Character> sortedList = new ArrayList<>();
        for(char c : test.toCharArray()) {
            sortedList.add(c);
        }
        Collections.sort(sortedList);
    }
}

//339A