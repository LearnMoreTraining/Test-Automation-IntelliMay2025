package javabasics;

public class StaticNonStaticExample {

   static int a = 10 ;

    public void m1(){
        System.out.println("m1");
        System.out.println(a);
    }

    public static void m2(){

        System.out.println("m2");
        System.out.println(a);
    }

    public void m3(){
        System.out.println(a);
    }
}
