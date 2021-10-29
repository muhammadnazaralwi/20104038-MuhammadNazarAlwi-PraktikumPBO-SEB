package modul2.praktikum;

import modul2.praktikum.protec.ModifierSubClass;

public class MainSub extends ModifierSubClass {
    public static void main(String[] args) {
        MainSub mainSub = new MainSub();

        System.out.println(mainSub.teksPublic);
        System.out.println(mainSub.teksProtec);
    }
}
