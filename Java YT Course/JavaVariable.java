public class JavaVariable {
    public static void main(String[] args) {

        //Primitive Data Types
            //*boolean 1bit: true or false
                //declaration
                    boolean k;
                    boolean l;
                //assignment
                    k=true;
                    l=false;
                //initialization
                    boolean a=true;
                    boolean b=false;

            //byte 1byte: -128 to 127
            byte c=100;

            //short 2bytes: -32768 to 32767
            short d=1000;

            //*int 4byte: −2,147,483,648 to 2,147,483,647

            int e=1000000;

            //long 8bytes: −9,223,372,036,854,775,808 to 9,223,372,036,854,755,807
            long f=100000000000L;

            //float 4bytes: −3.4e−038 to 3.4e+038
            float g=1.0000001f;

            //*double 8bytes: −1.7e−308 to 1.7e+038
            double h=1.000000000000001;

            //*char 2bytes: single character
            char i='a';
        
        //Reference Data Type
            //*string varies: sequence of characters
            String j="Hello World!";

            System.out.println(k);
            System.out.println(l);
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
            System.out.println(d);
            System.out.println(e);
            System.out.println(f);
            System.out.println(g);
            System.out.println(h);
            System.out.println(i);
            System.out.println(j);
            System.out.println("I have "+c+" pages to read.");

            String CupA="Water";
            String CupB="Coffee";
            String CupC=null;

            CupC=CupA;
            CupA=CupB;
            CupB=CupC;

            System.out.println("CupA "+CupA);
            System.out.println("CupB "+CupB);
            //System.out.println("CupC "+CupC);


    }
}
