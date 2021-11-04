package modul4.praktikum.overloading;

public class Main {
    public static void main(String[] args) {
        Tabungan saya = new Tabungan("Barca",12345);
        Tabungan kamu = new Tabungan("Manu",12467,15000,22222);

        System.out.println("Saldo awal saya : "+saya.getSaldo());
        System.out.println("Saldo awal kamu : "+kamu.getSaldo());
        System.out.println("Nomor pin saya : "+saya.getPin());
        System.out.println("Nomor pin kamu : "+kamu.getPin());
    }
}
