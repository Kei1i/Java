import javax.swing.JOptionPane;

public class SimpleGUI{
    public static void main(String[] args) {

        //Line 7 as the input display
        String name=JOptionPane.showInputDialog("Enter Your Name");
        //Line 9 as the output display
        JOptionPane.showMessageDialog(null,"Hello "+name);

        //Line 14 uses a "showInputDialog" that returns a string but int variable is being used
        //Convert to int by using "Interger.parseInt()" method shown below
        //Same appies with other varaible (Ex. "Double.parseDouble()")
        int age=Integer.parseInt(JOptionPane.showInputDialog("Enter Your Age"));
        JOptionPane.showMessageDialog(null,"Your age is "+age);
    }
}