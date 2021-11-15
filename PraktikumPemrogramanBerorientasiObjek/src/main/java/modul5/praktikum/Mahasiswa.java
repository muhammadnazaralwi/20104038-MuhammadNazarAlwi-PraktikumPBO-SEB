package modul5.praktikum;

public class Mahasiswa {
    private int nrp;
    private String nama;

    public Mahasiswa() {
        this(0, "");
    }

    public Mahasiswa(String nama) {
        this(0, nama);
    }

    public Mahasiswa(int nrp, String nama) {
        this.nrp = nrp;
        this.nama = nama;
    }

    public int getNrp() {
        return nrp;
    }

    public String getNama() {
        return nama;
    }
}
