package com.sau.aa;

public class TestB {
    public static void main(String[]args) {
        HI ob1 = new HI();

        HI ob2 = new HI(50);

        //instance / object คือ การใช้งาน data และ method
        //การใฃ้งาน data คือ กำหนดค่าให้มันใหม่ / เอาค่ามาใช้

        ob1.aa = 99;
        System.out.println(ob1.aa + ob2.aa);

        //การใช้งาน method คือ สั่งให้ method นั้นๆทำงาน
        ob1.showA();
        ob2.showA();
        ob2.show();
    }
}
