package javabasics;

public class ConstructorExample {

    static int a ;
    static int b ;

    public ConstructorExample(){
        a = 1;
        b = 2;
    }

    public ConstructorExample(int a){
        this.a = a ;
    }

    public static void main(String[] args) {

        ConstructorExample c = new ConstructorExample(45);
        System.out.println(a);
        System.out.println(b);
    }
}
