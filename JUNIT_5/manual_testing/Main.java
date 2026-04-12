package JUNIT_5.manual_testing;

public class Main{
    public static void main(String[] args){
        Calc c=new Calc(5,2);
        int res=c.add();
        int expected=7;
        if(res==expected){
            System.out.println("Test passed");
        }else{
            System.out.println("Test failed");
        }
    }
}