package modul7.praktikum.contoh1;

public class Lagu {
    String pencipta;
    String lagu;

    void isiLagu(String judul) {
        lagu = judul;
        pencipta = "unknown";
    }

    void isiLagu(String judul, String pencipta) {
        lagu = judul;
        this.pencipta = pencipta;
    }

    void cetakKeLayar() {
        System.out.println("Judul\t: " + lagu +  "\nPencipta: " + pencipta);
    }
}
