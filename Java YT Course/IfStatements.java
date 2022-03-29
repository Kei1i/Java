public class IfStatements {
    public static void main(String[] args) {

        int no=1;

        //The condition goes to "if" first
        if(no==100) {
            System.out.println("Ceiling Grade");
        }
        //If the first condition is not true, it will go through the "else if" one by one
        else if(no>=85) {
            System.out.println("Dean's Lister Grade");
        }
        else if(no>=75) {
            System.out.println("Passing Grade");
        }
        //If both "if" and "else ifs" are not true then "else" will output
        else {
            System.out.println("Failing Grade");
        }
        
    }
    
}
