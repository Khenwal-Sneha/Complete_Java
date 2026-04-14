public class ClassForNameEx {
    public static void main(String[] args) throws ClassNotFoundException {
        //load the class into memory
        Class.forName("Demo");
    }
}

class Demo{
    //executed when class is loaded into memory
    static{
        System.out.println("Static block executed");
    }

    //executed when object is created
    {
        System.out.println("Instance block executed");
    }
}
