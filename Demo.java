package WrapperClasses;

public class Demo {
    public static void main(String[] args) {
        int i=500;
        Integer integer=new Integer(i);
//        using boxing
        Integer integer1=Integer.valueOf(i);
//        using valueOf method
        Integer integer2=i;
//        autoboxing
        System.out.println(integer);
    }
}
