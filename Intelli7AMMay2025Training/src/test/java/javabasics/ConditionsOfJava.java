package javabasics;

public class ConditionsOfJava {

    public static void main(String[] args) {

        int a = 20 ;
        // less than 20 * 2
        // Greater than 20 * 3 but less than 50
        //greater than 50 * 4

        if(a < 20 ){
            System.out.println(a * 2);
        }
        else if(a == 20){

        }
        else if( a > 20 && a < 50 ){
            System.out.println(a * 3);
        }
        else{
            System.out.println(a * 4);
        }

        String name = "hello";
        String name2 = "Hello";

        if(name2.equals(name)){

        }


    }
}
