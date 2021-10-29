package modul3.praktikum.bank;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Saldo Awal Tabungan\t: ");
        int isi = scanner.nextInt();
        Tabungan tabungan = new Tabungan(isi);

        System.out.println("Jumlah uang yang diambil\t: ");
        int diambil = scanner.nextInt();
        tabungan.ambilUang(diambil);

        System.out.println("Saldo tabungan sekarang\t:");
        System.out.println(tabungan.getSaldo());
    }
}
