package basics;

public class Hello {
    public static void main(String[] args){
        int ch=(int) 5.6; // roundoff to floor value
        System.out.println(ch);
        System.out.println("Hello World!");

        //type promotiom
        byte a=10;
        byte b=30;

        System.out.println(a*b); //a*b is promoted to int
    }
}
