package com.sau.wow;

public class Test01 {
    public static void main(String[] args) {
        //สร้าง object / Instace of class
        //วิธีที่ 1 มี 2 ขั้นตอน
        DTiSAU mod;
        mod = new DTiSAU();


        //วิธี 2 มี 1 ขั้นตอน
        DTiSAU med = new DTiSAU();

        //การใช่้งาน object / Instace คือ การใช้ data / method
        //ใช data คือ การเปลี่ยนให้มันใหม่ หรือ เอาคำมาใช้ใหม่
        //การใช้งาน method คือ ให้ method ของ Object / Instace นั้นๆ ทำงาน
        mod.name = "สมขาย";
        System.out.println(mod.name + " สูง  " + mod.high);

        med.name = "สมศรี";
        med.showHi();

    }
}
