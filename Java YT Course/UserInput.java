//First import Class (Which is Scanner in this example) 
import java.util.Scanner;
public class UserInput {
    public static void main(String[] args) {
        //Create Scanner object and name the scanner (Which is "scan" in this example)
        Scanner scan=new Scanner(System.in);

        //Display what input is needed
        System.out.println("What is your name?");
        //Set an input
        String name=scan.nextLine();
        //Display the input if necessary
        System.out.println("Hello "+name);
        
        //Different types of Inputs can be accepted.
            //Input for Integers
            System.out.println("How old are you?");
            int age=scan.nextInt();
            System.out.println("You are "+age+" years old.");
        
        //To clear 1st string input, type Line 23 before 2nd string input
        scan.nextLine();
        //A 2nd string input (.nextLine) will be ignored if 1st one isn't cleared
        System.out.println("Favorite color?");
        String color=scan.nextLine();
        System.out.println("You like the color "+color+".");
    }
    
}
