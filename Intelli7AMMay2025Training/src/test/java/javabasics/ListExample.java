package javabasics;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

    public static void main(String[] args) {


        List<Integer> l = new ArrayList<Integer>();
        l.add(56);
        l.add(77);
        System.out.println(l);
        l.add(89);
        l.add(89);
        l.add(0,200);
        System.out.println(l);

        System.out.println(l.get(1));

        for(int j:l){
            System.out.println(j);
        }

        List<String> l2 = new ArrayList<String>();
        l2.add("hello");
        l2.add("hh");

        System.out.println(l2);


    }
}
