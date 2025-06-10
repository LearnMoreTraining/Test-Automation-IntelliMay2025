package javabasics;

public class GlobalLocalVariable {

    int b = 23 ; // global variable
    int c ;

    public void m1(){
        int a = 1;
        System.out.println(a);
        System.out.println(b);

        c = 100;

        System.out.println(c);
    }

    public void m2(){

        String name = "lmti";  //local variable
        System.out.println(name);
        System.out.println(b);
        System.out.println(c);
    }
}
