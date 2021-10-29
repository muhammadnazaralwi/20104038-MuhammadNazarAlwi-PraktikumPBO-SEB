package modul2.tugas;

public class ChickenStory {
    public static void main(String[] args) {
        for (int i = 10; i >= 1; i--) {
            System.out.println("Anak ayam turun " + i);
            if (i == 1) {
                System.out.println("Mati 1 tinggal Induknya");
                break;
            }
            System.out.println("Mati 1 tinggal " + (i-1));
        }
    }
}
