package io.sau.bb;

import net.dti.aa.Test01;

public class Test03 { //extends สืบทอด
    public void met3(){
        Test01 ob3 =new Test01();
        System.out.println(ob3.a);
        //System.out.println(ob3.b); error
        //System.out.println(ob3.c); error
//       //System.out.println(ob3.d; error

    }
}


//public ที่ไหนก็ได้
//private ภายในคลาส
//protected ภายใน package เดียวกัน กรณีต่างแพคเกจ
//ต้องสืบทอด inhertance กัน
//default ภายใน package เดียวกัน