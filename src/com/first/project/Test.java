package com.first.project;


import java.util.Date;

/**
 * Created by Oussama_Qaiboub on 06/11/2020.
 */

public class Test extends Abc {

   // static int a = 5;
     int a ;

    public Test(int a) {
        this.a = a;
    }

    @Override
        public void test() {
            System.out.println("Hamza");
        }


  public int age(){
        int d = 7;
        return d-a;
    }

    public static int age(int c){
        int d = 7;
        return d-c;
    }
}
