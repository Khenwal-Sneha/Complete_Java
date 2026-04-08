package test.java.com.demo;

public class AppTest{
    @Test
    void testApp(){
        App a=new App();
        int result=a.divide(10,2);
        int expected=20;
        assertEquals(expected,result);
    }
}