package javabasics;

public class StringExampl {

    public static void main(String[] args) {

        String name = "Up to 52,000.00 off" ;
        System.out.println(name.substring(5,16).replace(",",""));

       int amount = Integer.parseInt(name.substring(5,16).replace(",",""));
    }
}
