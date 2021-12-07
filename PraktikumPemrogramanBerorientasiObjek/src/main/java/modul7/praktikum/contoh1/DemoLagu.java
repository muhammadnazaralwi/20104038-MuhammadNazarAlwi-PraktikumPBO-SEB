package modul7.praktikum.contoh1;

public class DemoLagu {
    public static void main(String[] args) {
        Lagu lagu1, lagu2;

        lagu1 = new Lagu();
        lagu2 = new Lagu();

        lagu1.isiLagu("Say It");
        lagu2.isiLagu("Yoru ni Kakeru", "Yoasobi");

        lagu1.cetakKeLayar();
        lagu2.cetakKeLayar();
    }
}
