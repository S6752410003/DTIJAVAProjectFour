package com.sau.aa;

public class Hey {
    public int a = 10; //intstance variable
    public static int b = 20; // clss variable

    //มีวงเล็บคือ member
    public void showHi(){ //intstance method
        System.out.println("Hi...");

    }

    public static void showHey(){ //class method static ไม่มีผล กับ obj
        System.out.println("Hey....");

    }

    public void metA(){
        a = 11;
        b = 22;
        showHi();
        showHey();
    }

    public static void metB(){
        //a = 11; error
        b = 22;
        //showHi(); error
        showHey();
    }
}
