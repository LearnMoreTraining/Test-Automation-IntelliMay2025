package javabasics;

public class ReturnStatments {

    int a = 500 ;
    String name = "hello";

    public int m1(){
        int a = 1;
        System.out.println(a); // 1
        System.out.println(this.a); // 500
        return this.a;
    }

    public String m2(){
        String name = "lmti";
        return this.name;
    }
}
