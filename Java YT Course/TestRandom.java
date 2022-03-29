import java.util.Random;
public class TestRandom {
    public static void main(String[] args) {
        //Random until is useful for game development
        //Line 6 as random object
        Random test=new Random();

        //Below assigns random variables
        int x=test.nextInt(6)+1;
            //randomizes no. 0-6 and "+1" to remove 0
        double y=test.nextDouble();
            //randomizes no. 0-1
        boolean z=test.nextBoolean();
            //randomizes true and flase 

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        /* Note: Random util does not use true random nos. 
         * but uses suedo random nos. 
         * that are similar enough to true random nos.
         */
    
    }
}
