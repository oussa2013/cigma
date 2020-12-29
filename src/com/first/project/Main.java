package com.first.project;

import java.util.*;

public class Main{

    public static void main(String[] args) {
        /*System.out.println("oussa");
        System.out.println("number of array: " + args.length);
        for (int i = 0; i < args.length; i++) {
            System.out.println("array " + i + ":" + args[i]);
        }

        //super
        SubC subC = new SubC(10);

        subC.name();
        //abstract
        Abc test = new Test();
        test.test();


        List<String> a = new LinkedList<>();*/
        int i = 9;
        Test  t = new Test(10);
      /*  Test  t2 = new Test(20);
        System.out.println(t.i);
        System.out.println(t2.i);*/
        //static int a = 4;

        System.out.println( t.age());
        System.out.println( Test.age(4));

        //////////////////////////////////////

            List<String> aa = new ArrayList<>();
            aa.add(0,"ss");
            aa.add(0,"ss");
            List<String > a = new LinkedList<>();


        Map<String,Integer> aaa = new HashMap();
        Map<String,Integer> aaaa = new LinkedHashMap<>();
        Map<String,Integer> aaaaa = new TreeMap<>();

        Set<String> anna = new LinkedHashSet<>();
        Set<String> aanna = new LinkedHashSet<>();

    }
}
