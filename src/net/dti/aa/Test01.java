package net.dti.aa;

public class Test01 { //final อยู้หน้า data ตัวไรเปลี่ยนค่าไม่ได้
    public final static int a = 10;
    private final int b = 20;
    protected final int c =30;
    int d =40;


    public  void  met1(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);


    }
}
