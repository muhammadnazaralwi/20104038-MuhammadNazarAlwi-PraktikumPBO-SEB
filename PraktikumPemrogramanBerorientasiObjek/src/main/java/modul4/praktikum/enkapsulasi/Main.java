package modul4.praktikum.enkapsulasi;

public class Main {
    public static void main(String[] args) { Tabungan saya = new Tabungan("Barca", 50410420,1000000,12345); System.out.println("Nama \t : " + saya.getNama());
        System.out.println("noRekening \t : " + saya.getNoRekening());
        System.out.println("saldo \t : " + saya.getSaldo());
        System.out.println("pin \t : " + saya.getPin());
    }
}
