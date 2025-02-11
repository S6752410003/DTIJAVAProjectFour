package ac.th.sau;

public class MyClass01 {
    //OOP คุณสมบัติ
    //1 Encapsulation (information Hiding) การซ่อน data
    public int dataA;
    private String dataB;

//ให้ฝช้งาน data ผ่าน Getter / Setter
    public int dataA(){
        return  dataA;

    }

    public String getDataB(){
        return dataB;

    }

    public  void setDataA(int dataA){
        this.dataA = dataA;

    }

    public void setDataB(String dataB){
        this.dataB = dataB;


    }

}


//OOP คุณสมบัติ
//1 Encapsulation (information Hiding) การซ่อน data
//2 Inheritance สืบทอดคลาส
//3 Polymorphism พฤติกรรมทำงานเดียวกัน แต้วิธีต่าง