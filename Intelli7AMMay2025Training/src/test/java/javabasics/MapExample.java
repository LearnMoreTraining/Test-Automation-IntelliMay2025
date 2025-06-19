package javabasics;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

    public static void main(String[] args) {

        Map<Integer , String > m = new HashMap<Integer , String>();
        m.put(567,"apple");
        m.put(789,"grass");
        m.put(789,"white");
        System.out.println(m);

        System.out.println( m.get(789));

    }
}
