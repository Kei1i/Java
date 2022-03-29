import java.util.Scanner;
public class LogicalOperators {
    public static void main(String[] args){
        //Logical Operators
        /** > Greater Than
         *  < Less Than 
         *  =
         *  >=
         *  <=
         *  || Or (If 1 is true, statement is true)
         *  && And (If all is true, statement is true)
         *  ! Not (Reverses boolean value)
         */

        //(|| Or) and (&& And)
         Scanner scan=new Scanner(System.in);

         System.out.println("Start?");
         String x=scan.next();

        if (x.equals("Yes") || x.equals("yes"))
            System.out.println("Starting!");
        else if(x.equals("No") || x.equals("no"))
            System.out.println("Not Starting");
        else
            System.out.println("Invalid");

        //(! Not)
        System.out.println("Quit?");
         String y=scan.next();

        if (!y.equals("Yes") || !y.equals("yes"))
            System.out.println("Starting!");
        else
            System.out.println("Quiting");
         
    }
    
}
