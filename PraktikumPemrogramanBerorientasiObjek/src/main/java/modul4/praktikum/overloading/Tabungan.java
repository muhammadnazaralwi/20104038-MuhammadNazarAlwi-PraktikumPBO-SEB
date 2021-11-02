package modul4.praktikum.overloading;

public class Tabungan {
    private String nama;
    private int noRekening;
    private int saldo;
    private int pin;

    public Tabungan(String nama, int noRekening) {
        this.nama = nama;
        this.noRekening = noRekening;
    }

    public Tabungan(String nama, int noRekening, int saldo, int pin) {
        this.nama = nama;
        this.noRekening = noRekening;
        this.saldo = saldo;
        this.pin = pin;
    }

    public void simpanUang(int jumlah) {
        this.saldo += jumlah;
    }

    public void tarikUang(int jumlahTarik) {
        this.saldo -= jumlahTarik;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int jumlah) {
        this.saldo = jumlah;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pinBaru) {
        this.pin = pinBaru;
    }
}
