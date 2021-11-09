package modul5.praktikum;

import modul5.praktikum.sekolah.Kelas;

public class Main {
    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa(1001, "Ei");
        Mahasiswa mahasiswa2 = new Mahasiswa(1002, "Sara");
        Mahasiswa mahasiswa3 = new Mahasiswa(1003, "Yae");
        Mahasiswa mahasiswa4 = new Mahasiswa(1004, "Beidou");

        Kelas kelasElec = new Kelas(100, "Electro");

        kelasElec.setMhs(mahasiswa1);
        kelasElec.setMhs(mahasiswa2);
        kelasElec.setMhs(mahasiswa3);

        for ( Mahasiswa mahasiswaX : kelasElec.getMahasiswa() ) {
            System.out.println(mahasiswaX.getNama());
        }

        System.out.println();

        kelasElec.setMhs(mahasiswa4);
        for ( Mahasiswa mahasiswaX : kelasElec.getMahasiswa() ) {
            System.out.println(mahasiswaX.getNama());
        }

    }
}
