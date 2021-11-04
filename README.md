
## Modul 4: Dasar Pemrogramman Berorientasi Objek
 
### Dasar Teori
**Information Hiding** adalah menyembunyikan atribut dan method suatu
objek dari objek lain. Informasi dari suatu class disembunyikan agar anggota- anggota tersebut tidak dapat diakses dari luar. Adapun caranya adalah cukup dengan memberikan akses control private ketika mendeklarasikan suatu atribut atau method. 

Contoh:
```
private int nilai;
```

**Encapsulation (Enkapsulasi)** adalah suatu cara untuk menyembunyikan implementasi detail dari suatu class. Enkapsulasi mempunyai dua hal mendasar, yaitu:
1. Information hiding.  
2. Menyediakan suatu perantara (method) untuk pengaksesan data.

Contoh:
```
public class Siswa {  
	private int nilai;  
	public void setnilai(int n) { nilai = n; }  
}
```

**Contructor (konstruktor)** adalah suatu method yang pertama kali dijalankan pada saat pembuatan suatu obyek. Konstruktor ini merupakan method yang berfungsi untuk menginisialisasi variabel-variabel instans yang akan di miliki oleh objek. Konstruktor dipanggil pada saat proses instansiasi kelas menjadi objek. 

Beberapa karakteristik yang dimiliki oleh constructor:
1.  Method constructor harus memiliki nama yang sama dengan nama class.
2.  Tidak mengembalikan suatu nilai (tidak ada keyword return).
3.  Satu class memiliki lebih dari satu constructor (overloading constructor).
4.  Dapat ditambah access modifier public, private, protected maupun default.
5. Suatu constructor bisa dipanggil oleh constructor lain dalam satu class.

Struktur dari konstruktor yaitu:
```
Class Nama_kelas {  
	Nama_kelas() { //ini adalah constructor
		//isi konstruktor
	}
	//isi dari kelas
}
```

Contoh:
```
public class Siswa {  
	private int nilai;  
	private String nama;  
	public Siswa(int n, String m) { 
		nilai= n;
		nama= m;
	}
}
```

**Overloading Constructor** merupakan suatu class yang mempunyai lebih dari 1 constructor dengan syarat daftar parameternya tidak boleh ada yang sama. Contoh:
```
public class Siswa {
	private int nilai;
	public Siswa() { nilai=0; }
	public Siswa(int n) { nilai=n; }
}
```

Constructor tidak dapat dipanggil secara langsung, namun harus dipanggil dengan menggunakan operator new pada pembentukan sebuah class.

### Penjelasan Kode
Constructor pada class [Tabungan](https://github.com/muhammadnazaralwi/20104038-MuhammadNazarAlwi-PraktikumPBO-SEB/blob/d0b0de360b97c8304569f9f8a82543b88bec5a46/PraktikumPemrogramanBerorientasiObjek/src/main/java/modul4/praktikum/enkapsulasi/Tabungan.java#L9-L14), berfungsi untuk menginisiasi nilai dari atribut class tersebut.
```
public Tabungan(String nama, int noRekening, int saldo, int pin) {
    this.nama = nama;
    this.noRekening = noRekening;
    this.saldo = saldo;
    this.pin = pin;
}
```

Dengan adanya constructor, untuk mengisi nilai atribut pada suatu class, atribut tersebut tidak perlu menjadi public.

Fungsi [getter dan setter](https://github.com/muhammadnazaralwi/20104038-MuhammadNazarAlwi-PraktikumPBO-SEB/blob/d0b0de360b97c8304569f9f8a82543b88bec5a46/PraktikumPemrogramanBerorientasiObjek/src/main/java/modul4/praktikum/enkapsulasi/Tabungan.java#L16-L30) juga sangat mendukung konsep enkapsulasi karena setiap atribut tidak perlu menjadi public. Untuk merubah nilai atau mendapatkan nilai dari atribut pada suatu class, cukup gunakan bantuan fungsi getter dan setter.

```
public String getNama() {
    return nama;
}


public int getNoRekening() {
    return noRekening;
}


public int getSaldo() {
    return saldo;
}


public int getPin() {
    return pin;
}
``` 

Class Tabungan ini juga menerapkan konsep [overloading](https://github.com/muhammadnazaralwi/20104038-MuhammadNazarAlwi-PraktikumPBO-SEB/blob/d0b0de360b97c8304569f9f8a82543b88bec5a46/PraktikumPemrogramanBerorientasiObjek/src/main/java/modul4/praktikum/overloading/Tabungan.java#L9-L21), dimana sebuah fungsi atau behavior memiliki parameter atau bentuk yang berbeda.
```
public Tabungan(String nama, int noRekening) {
    this.nama = nama;
    this.noRekening = noRekening;
    this.setSaldo(10000);
    this.setPin(11111);
}

public Tabungan(String nama, int noRekening, int saldo, int pin) {
    this.nama = nama;
    this.noRekening = noRekening;
    this.saldo = saldo;
    this.pin = pin;
}
```
<hr>

Untuk latihan [Student Record](https://github.com/muhammadnazaralwi/20104038-MuhammadNazarAlwi-PraktikumPBO-SEB/tree/d0b0de360b97c8304569f9f8a82543b88bec5a46/PraktikumPemrogramanBerorientasiObjek/src/main/java/modul4/tugas) pada modul, kami diminta untuk menuliskan program yang tertera dan progarm akan menghasilkan output sebagai berikut:
```
Wahyu
Hitung=0
```

Hanya saja program tidak dapat dieksekusi karena error pada bagian:
```
System.out.println( getName() );
```

Error tersebut terjadi karena pemanggilan fungsi `getName()` secara langsung yang mana fungsi tersebut berada di class `StudentRecord`. Untuk memanggil fungsi dari class lain, dibutuhkan instance dari class tersebut.

Karena output yang diharapkan adalah nama **Wahyu**, maka asumsi kami seharusnya pemanggilan fungsi `getName()` ini melalui instance `wahyu` yang sudah dibuat sebelumnya.
```
System.out.println(wahyu.getName());
```
Dan untuk output:
```
Hitung=0
```
Output tersebut tetap 0 (nol) karena merupakan nilai return dari fungsi `getStudentCount()`. 
```
System.out.println("Hitung=" + StudentRecord.getStudentCount());
```

Fungsi tersebut mengembalikan nilai dari atribut `studentCount` pada class `StudentRecord`.
```
public static int getStudentCount() {  
    return studentCount;  
}
```
Karena pada class `StudentRecord` tidak ada operasi yang merubah nilai dari `studentCount`, oleh karena itu output yang dihasilkan adalah 0 (nilai awal integer).

### Kesimpulan
* Information Hiding adalah menyembunyikan atribut dan method suatu objek dari objek lain.
* Encapsulation adalah suatu cara untuk menyembunyikan implementasi detail dari suatu class.
* Contructor adalah suatu method yang pertama kali dijalankan pada saat pembuatan suatu obyek.
* Overloading Constructor merupakan suatu class yang mempunyai lebih dari 1 constructor dengan syarat daftar parameternya tidak boleh ada yang sama.
* Untuk memanggil fungsi dari class lain, dibutuhkan instance dari class tersebut.
