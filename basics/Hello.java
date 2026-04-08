package basics;

class Calculator{
    int a;
    int b;
    Calculator(){

    }

    Calculator(int a,int b){
        this.a=a;
        this.b=b;
    }
    int add(int a,int b){
        return a+b;
    }
}

public class Hello {
    public static void main(String[] args){
        int ch=(int) 5.6; // roundoff to floor value
        System.out.println(ch);
        System.out.println("Hello World!");

        //type promotiom
        byte a=10;
        byte b=30;
        System.out.println(a*b); //a*b is promoted to int

        //Class and objects
        Calculator c=new Calculator(2,3);
        System.out.println(c.add(2,3));
    }
}
