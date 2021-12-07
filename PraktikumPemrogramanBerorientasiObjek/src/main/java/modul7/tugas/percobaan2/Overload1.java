package modul7.tugas.percobaan2;

public class Overload1 {
    void myMethod(short s) {
        System.out.println("short");
    }
    void myMethod(int i) {
        System.out.println("int");
    }
    void myMethod(long l) {
        System.out.println("long");
    }
    public static void main(String[] args) {
        byte b = 1;
        Overload1 o = new Overload1();
        o.myMethod(b);
        /*
         *statement di atas akan menghasilkan "short", *hal ini karena short lebih "dekat" dengan
         *byte bila dibandingkan dengan int ataupun long
        */
    }
}
