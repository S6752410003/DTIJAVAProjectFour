package com.sau.wow;

public class DTiSAU {
    //data member ตัวข้อมูล
    String name;
    int birthYear;
    int age;
    double high = 100;


    //method member การทำงาน
    public  void  showHi(){
        System.out.println("Hi..."+name);
    }
    public void  calAndShowAge(){
        age = 2568 - birthYear;
        System.out.println("Your age" + age);
    }
}
