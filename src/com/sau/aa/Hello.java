package com.sau.aa;

public class Hello {
    //data member
    public int a;
    public int b = 10;

    //method member
    public  void showA  (){
        System.out.println(a);

    }


    public void showSumA(){
        System.out.println(a+b);
    }


    //construstor
    //public Hello (   ){  }
    public Hello(int a ){
        this.a = 0;
        System.out.println("Hello....");
    }

    public  Hello (){
        System.out.println("Hi......");
    }

    public Hello(String x){
        System.out.println("Hey....." + x);

    }
}
