package modul5.praktikum.sekolah;

import modul5.praktikum.Mahasiswa;

public class Kelas {
    private int kodekelas;
    private String namakelas;
    private Mahasiswa[] mahasiswa = new Mahasiswa[10];
    private int mahasiswaLength;

    public Kelas(int kode, String nama) {
        this.kodekelas = kode;
        this.namakelas = nama;
        this.mahasiswaLength = -1;
    }

    public void setMhs(Mahasiswa mahasiswa) {
        mahasiswaLength++;
        this.mahasiswa[mahasiswaLength] = mahasiswa;
    }

    public String getNamaKelas() {
        return namakelas;
    }

    public Mahasiswa[] getMahasiswa() {
        Mahasiswa[] mahasiswaReturn = new Mahasiswa[mahasiswaLength + 1];
        for (int i = 0; i <= mahasiswaLength; i++) {
            mahasiswaReturn[i] = mahasiswa[i];
        }
        return mahasiswaReturn;
    }
}
