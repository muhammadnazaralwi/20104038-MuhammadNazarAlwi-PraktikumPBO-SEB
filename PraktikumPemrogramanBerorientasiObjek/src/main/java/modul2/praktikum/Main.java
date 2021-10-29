package modul2.praktikum;

import modul2.praktikum.protec.ModifierProtected;

public class Main {
    public static void main(String[] args) {
        Modifier modifier = new Modifier();

        System.out.println(modifier.angkaNon);
        System.out.println(modifier.angkaPublic);
        System.out.println(modifier.angkaProtected);

        modifier.printAngkaPrivate();

        ModifierProtected modifierProtected = new ModifierProtected();
        System.out.println(modifierProtected.teksPublic);
    }
}
