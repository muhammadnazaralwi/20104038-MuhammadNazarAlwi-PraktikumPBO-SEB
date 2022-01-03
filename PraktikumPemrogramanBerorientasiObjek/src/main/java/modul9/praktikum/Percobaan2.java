package modul9.praktikum;

public class Percobaan2 {
    public static void main(String[] args) {
        int[] a = new int[5];
        try {
            a[5] = 100 ;
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Indeks Array melebihi batas");
        }
    }
}
