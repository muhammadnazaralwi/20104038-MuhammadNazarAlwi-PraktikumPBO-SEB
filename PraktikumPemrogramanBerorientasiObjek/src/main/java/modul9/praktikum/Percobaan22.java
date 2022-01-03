package modul9.praktikum;

public class Percobaan22 {
    public static void main(String[] args) {
        int bil = 10;
        try {
            System.out.println(bil/0);
        } catch(ArithmeticException e) {
            System.out.println("Tidak boleh membagi bilangan dengan 0");
        }
    }
}
