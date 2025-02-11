package com.sau.aa;

public class HI {
    public int aa = 10;

    //method member
    public void showA(){
        System.out.println(aa);

    }

    public void show(){
        System.out.println("Wow ");

    }


    //constructor
    public HI(){
        System.out.println("Boo");

    }

    public HI(int aa){
        this.aa = aa;

    }
}
