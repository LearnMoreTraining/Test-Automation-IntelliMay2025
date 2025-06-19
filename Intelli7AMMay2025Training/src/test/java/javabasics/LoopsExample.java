package javabasics;

public class LoopsExample {

    public static void main(String[] args) {

        int [] a = {56,22,11,44};

        for(int h=0; h < a.length ; h++ ){
            System.out.println(a[h]);
        }

        String [] name = {"lmti","learnmore"};

        for(int d=0 ; d < name.length ; d++){
            System.out.println(name[d]);
        }

        for(String d:name){
            System.out.println(d);
        }
    }
}
