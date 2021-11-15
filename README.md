## Modul 5: Mengelola Class

### Dasar Teori
#### Package
Package adalah suatu cara untuk memenej class-class yang kita buat pakage akan sangat bermanfaat jika class-class yang kita buat sangat banyak sehingga perlu dikelompokan berdasarkan kategori tertentu. Yang harus diperhatikan adalah biasanya nama class utama harus sama dengan nama package. Berikut ini adalah sintak pernyataan package untuk meletakkan hasil kompilasi sebuah kelas ke dalam paket:
```
package nama-paket;  
<identifier> class <nama_class sama dengan package> 
```

Contoh: 
```
package Utama;  
public class Utama { }
```

#### Import Class
Perintah import digunakan untuk memberitahukan kepada program untuk mengacu pada class-class yang terdapat dalam package tertentu, buka menjalankan class-class tersebut.

Contoh penggunaan import (dengan implementasinya):
```
import matematik.bilangan; 

class Utama {
	public static void main(String[] args) { 
		Bilangan x = new Bilangan(); 
		x.setDesimal(-44); 
		System.out.println("Bilangan biner dari "+ x.getDesimal() + " adalah "+ x.biner()); 
	}
}
```

#### Kata Kunci this
Kata kunci ini digunakan dalam sebuah kelas untuk menyatakan object sekarang. Kata kunci this sangat berguna untuk menunjukkan suatu member dalam class-nya sendiri. this dapat digunakan baik untuk data member maupun untuk function member, serta dapat juga digunakan untuk konstruktor. 

### Penjelasan Kode
Keyword `this` pada suatu class merupakan objek dari class itu sendiri. 
```
public Mahasiswa() {
	this(0, "");
}
```

Keyword `this` [di atas](https://github.com/muhammadnazaralwi/20104038-MuhammadNazarAlwi-PraktikumPBO-SEB/blob/8a8646c2d3c1d3fae1892dacc230df77840ac79d/PraktikumPemrogramanBerorientasiObjek/src/main/java/modul5/praktikum/Mahasiswa.java#L8) memanggil [constructor yang memiliki 2 parameter](https://github.com/muhammadnazaralwi/20104038-MuhammadNazarAlwi-PraktikumPBO-SEB/blob/8a8646c2d3c1d3fae1892dacc230df77840ac79d/PraktikumPemrogramanBerorientasiObjek/src/main/java/modul5/praktikum/Mahasiswa.java#L11-L13) dari class Mahasiswa.
```
public Mahasiswa(String nama) {
    this(0, nama);
}
```

Ketika membuat class [`Kelas`](https://github.com/muhammadnazaralwi/20104038-MuhammadNazarAlwi-PraktikumPBO-SEB/blob/modul5/PraktikumPemrogramanBerorientasiObjek/src/main/java/modul5/praktikum/sekolah/Kelas.java#L3), dibutuhkan objek dari class `Mahasiswa`. Karena class Mahasiswa berada di luar package `sekolah`, kami perlu menuliskan statement `import` sebelum deklarasi class.
```
import modul5.praktikum.Mahasiswa;
```

Pada class main `TesLatihan`, kami membutuhkan objek dari class `Nasabah` dan `Tabungan` yang berada di package `perbankan`. Oleh karena itu kita perlu menuliskan statement import pada class `TesLatihan`.
```
import modul5.tugas.perbankan.Nasabah;
import modul5.tugas.perbankan.Tabungan;
```

Penulisan statment import di atas dapat disederhanakan dengan mengganti penulisan class yang dituju dengan tanda bintang (`*`).

```
import modul5.tugas.perbankan.*;
```

### Kesimpulan
* Ketika ingin memanggil objek dari suatu class di dalam class tersebut, gunakan keyword `this`.
* Ketika hendak meng-impor suatu class, pastikan class tersebut bersifat public.
* Gunakan tanda bintang (`*`) untuk mengimpor beberapa class yang berada di package yang sama.## Modul 5: Mengelola Class

### Dasar Teori
#### Package
Package adalah suatu cara untuk memenej class-class yang kita buat pakage akan sangat bermanfaat jika class-class yang kita buat sangat banyak sehingga perlu dikelompokan berdasarkan kategori tertentu. Yang harus diperhatikan adalah biasanya nama class utama harus sama dengan nama package. Berikut ini adalah sintak pernyataan package untuk meletakkan hasil kompilasi sebuah kelas ke dalam paket:
```
package nama-paket;  
<identifier> class <nama_class sama dengan package> 
```

Contoh: 
```
package Utama;  
public class Utama { }
```

#### Import Class
Perintah import digunakan untuk memberitahukan kepada program untuk mengacu pada class-class yang terdapat dalam package tertentu, buka menjalankan class-class tersebut.

Contoh penggunaan import (dengan implementasinya):
```
import matematik.bilangan; 

class Utama {
	public static void main(String[] args) { 
		Bilangan x = new Bilangan(); 
		x.setDesimal(-44); 
		System.out.println("Bilangan biner dari "+ x.getDesimal() + " adalah "+ x.biner()); 
	}
}
```

#### Kata Kunci this
Kata kunci ini digunakan dalam sebuah kelas untuk menyatakan object sekarang. Kata kunci this sangat berguna untuk menunjukkan suatu member dalam class-nya sendiri. this dapat digunakan baik untuk data member maupun untuk function member, serta dapat juga digunakan untuk konstruktor. 

### Penjelasan Kode
Keyword `this` pada suatu class merupakan objek dari class itu sendiri. 
```
public Mahasiswa() {
	this(0, "");
}
```

Keyword `this` [di atas](https://github.com/muhammadnazaralwi/20104038-MuhammadNazarAlwi-PraktikumPBO-SEB/blob/8a8646c2d3c1d3fae1892dacc230df77840ac79d/PraktikumPemrogramanBerorientasiObjek/src/main/java/modul5/praktikum/Mahasiswa.java#L8) memanggil [constructor yang memiliki 2 parameter](https://github.com/muhammadnazaralwi/20104038-MuhammadNazarAlwi-PraktikumPBO-SEB/blob/8a8646c2d3c1d3fae1892dacc230df77840ac79d/PraktikumPemrogramanBerorientasiObjek/src/main/java/modul5/praktikum/Mahasiswa.java#L11-L13) dari class Mahasiswa.
```
public Mahasiswa(String nama) {
    this(0, nama);
}
```

Ketika membuat class [`Kelas`](https://github.com/muhammadnazaralwi/20104038-MuhammadNazarAlwi-PraktikumPBO-SEB/blob/modul5/PraktikumPemrogramanBerorientasiObjek/src/main/java/modul5/praktikum/sekolah/Kelas.java#L3), dibutuhkan objek dari class `Mahasiswa`. Karena class Mahasiswa berada di luar package `sekolah`, kami perlu menuliskan statement `import` sebelum deklarasi class.
```
import modul5.praktikum.Mahasiswa;
```

Pada class main `TesLatihan`, kami membutuhkan objek dari class `Nasabah` dan `Tabungan` yang berada di package `perbankan`. Oleh karena itu kita perlu menuliskan statement import pada class `TesLatihan`.
```
import modul5.tugas.perbankan.Nasabah;
import modul5.tugas.perbankan.Tabungan;
```

Penulisan statment import di atas dapat disederhanakan dengan mengganti penulisan class yang dituju dengan tanda bintang (`*`).

```
import modul5.tugas.perbankan.*;
```

### Kesimpulan
* Ketika ingin memanggil objek dari suatu class di dalam class tersebut, gunakan keyword `this`.
* Ketika hendak meng-impor suatu class, pastikan class tersebut bersifat public.
* Gunakan tanda bintang (`*`) untuk mengimpor beberapa class yang berada di package yang sama.
