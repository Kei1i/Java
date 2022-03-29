import java.util.Scanner;
public class WhileLoop {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        String name="";


        //While loop executes a block as long as it's condition remain true
        //The while condition will be checked first before executing the block within while
        //Below, if name is equal to "", the block is executed
        while(name.equals("")) {
            System.out.println("Enter your name: ");
            name=input.nextLine();
        }
        //When the input isn't blank, output below is executed
        System.out.println("Hello "+name);

        //Using do
        //The block within do will execute first, always atleast once then the while condition is checked
        do {
            System.out.println("Enter your name: ");
            name=input.nextLine();
        }while(name.equals(""));

        //Output
        System.out.println("Hello "+name);

        //Testing change

    } 
}
