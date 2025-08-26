import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
public class calculator 
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        boolean running = true;
        String file = "history.txt";
        while(running){
        System.out.println("\t-<- Welcome to the Calculator ->-");
        System.out.println("Press 1 for Addition \nPress 2 for Subtraction \nPress 3 for Multiplication \nPress 4 for Division \nPress 5 to Show the History \nPress 6 to Clear the History");
        int choice = ob.nextInt();

        if(choice == 5)
        {
            CheckHistory(file);
            
        }
        else if(choice == 6)
        {
            ClearHistory(file);
            
        }

        System.out.println("Enter two numbers");

        double n1 = ob.nextDouble();
        double n2 = ob.nextDouble();

        String result;
        switch(choice)
        {
            case 1:
                result = n1 + " + " + n2 + " = " + (n1 + n2);
                History(file, result);
                System.out.println("Result is = " + (n1 + n2));
                break;

            case 2:
                result = n1 + " - " + n2 + " = " + (n1 - n2);
                History(file, result);
                System.out.println("Result is = " + (n1 - n2));
                break;

            case 3:
                result = n1 + " * " + n2 + " = " + (n1 * n2);
                History(file, result);
                System.out.println("Result is = " + (n1 * n2));
                break;

            case 4:
                if(n2 != 0)
                {
                    result = n1 + " / " + n2 + " = " + (n1 / n2);
                    History(file, result);
                    System.out.println("Result is = " + (n1 / n2));
                }
                else    
                    System.out.println("Division by zero is not possible");
                break;

            default:
                System.out.println("Invalid Input");
        }
        ob.nextLine();
        System.out.println("Do you want to Continue ? Enter y or n");
        String check = ob.nextLine();
        running = check.equalsIgnoreCase("y");
    }
        ob.close();
    }  

    private static void History(String file, String result)
    {
        try
        {
            FileWriter writer = new FileWriter(file,true);
            writer.write(result);
            writer.write(System.lineSeparator());
            writer.close();
        }
        catch(IOException e)
        {
            System.out.println("Error Occured");
        }
    }

    private static void CheckHistory(String file)
    {
        try
        {
            Scanner in = new Scanner(new File(file));

            if(!in.hasNextLine())
                System.out.println("No History Available");

            while(in.hasNextLine())
            {
                System.out.println(in.nextLine());
            }
            in.close();
        }
        catch(IOException e)
        {
            System.out.println("Error Reading the file" + e.getMessage());
        }
    }

    private static void ClearHistory(String file) 
    {   
        try
        {
            FileWriter writer = new FileWriter(file);
            writer.write("");
            writer.close();
            System.out.println("History cleared successfully.");
        }
        catch(IOException e)
        {
            System.out.println("Error Reading the file" + e.getMessage());
        }
    }
}
