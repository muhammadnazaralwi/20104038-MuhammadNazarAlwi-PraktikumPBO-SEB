
## Modul 3: Pengenalan Pemrograman Berorientasi Objek
 
### Dasar Teori
Pemrograman Berorientasi Objek (Object Oriented Programming/OOP) merupakan pemrograman yang berorientasikan kepada objek, dimana semua data dan fungsi dibungkus dalam class- class atau object-object.  PBO memiliki beberapa karakteristik mendasar, antara lain adalah abstraksi, encapculation (pembungkusan), inheritance (pewarisan), dan polymorphism.

* **Mendeklarasikan suatu class**
Class adalah wadah yang berisi abstraksi (pemodelan) dari suatu fungsi objek (benda), yang mendeskripsikan data (sifat 	karakteristik) dan fungsi yang dimiliki oleh objek tersebut. 

	Deklarasi class dapat dilakukan dengan sintaks sebagai berikut:
	```
	<modifier> class <nama_class> { 
		[isi class]  
	}
	```
	Contoh:
	```
	public class Mobil{ }
	```
* **Mendeklarasikan suatu atribut**
Attributes merupakan nilai (type) data yang terdapat pada suatu object yang berasal dari class. Attributes merepresentasikan karakteristik dari suatu object. 

	Deklarasi atribut dapat dilakukan dengan sintaks sebagai berikut:
	```
	<modifier> <tipe> <nama_atribut>;
	```
	Contoh:
	```
	public String warna;
	```
* **Mendeklarasikan suatu metode** 
Metode/method adalah sesuatu yang dapat dilakukan oleh objek. Method dalam implementasi program ditulis dalam bentuk fungsi. Metode menentukan apa yang terjadi ketika objek itu dibuat serta berbagai operasi yang dapat dilakukan objek.

	Deklarasi metode dapat dilakukan dengan sintaks sebagai berikut:
	```
	<modifier> <return_type> <nama_metode>([daftar_argumen]) {
		[<statement>]  
	}
	```
	Contoh:
	```
	public void info()	{
		System.out.println(warna);
	}
	```

* **Mengakses anggota suatu objek**
Untuk dapat mengakses anggota-anggota dari suatu obyek, maka harus dibuat instance dari class tersebut terlebih dahulu. 

	Berikut ini adalah contoh pengaksesan anggota-anggota dari class Mobil:
	```
	public class Mobil {  
		public static void main(String args[]) { 
			Mobil m = new Mobil(); 
			m.warna = ”hitam”;  
			m.no_Plat = ”KT 2837 UE”;  
			m.info();  
		}  
	}
	```

### Penjelasan Kode
Pada praktikum kali ini kami diminta untuk mengimplementasikan sebuah UML diagram. UML tersebut mendeskripsikan sebuah class dengan nama `Tabungan` dan memiliki attribute saldo. Class tersebut juga memiliki 3 behavior yaitu `getSaldo()`, `simpanUang()`, dan `ambilUang()`.

Berikut keseluruhan kode dari implementasi UML Tabungan:
```
public class Tabungan {  
	public int saldo;  

	public Tabungan(int saldo) {  
		this.saldo = saldo;  
	}  

	public int getSaldo() {  
		return saldo;  
	}  

	public void simpanUang(int jumlah) {  
		saldo += jumlah;  
	}  

	public boolean ambilUang(int jumlah) {  
		if (saldo >= jumlah) {  
			saldo -= jumlah;  
			return true;  
		} else {  
			return false;  
		}  
	}  
}
```

Variabel atau attribute saldo sebagai variabel global berfungsi untuk menyimpan nilai.
```
public class Tabungan {  
	public int saldo;
	...
}
```

Untuk meng-inject nilai dari luar class Tabungan, dibutuhkan sebuah constructor. Constructor ini bisa disebut sebagai behavior.
```
public class Tabungan {  
	...
	public Tabungan(int saldo) {  
		this.saldo = saldo;  
	}  
	...
}
```

Untuk melihat nilai dari suatu attribute di dalam class, dibutuhkan sebuah fungsi public yang mengembalikan nilai dari attribute tersebut. Fungsi ini biasa disebut sebagai fungsi getter. Dengan adanya fungsi ini, kita tidak perlu membuat attribute menjadi public (mencegah perubahan dari luar class).

```
public class Tabungan {  
	...
	public int getSaldo() {  
		return saldo;  
	}
	...
}
```

Untuk merubah nilai dari variabel saldo berdasarkan nilai baru dari luar kelas. Dibutuhkan sebuah fungsi void yang di dalamnya berisi logika penambahan saldo.

```
public class Tabungan {  
	...
	public void simpanUang(int jumlah) {  
		saldo += jumlah;  
	}  
	...
}
```

Fungsi di bawah ini memuat logika sederhana pengambilan uang. Jika saldo mencukupi atau lebih dari jumlah yang ingin diambil, maka kurangi saldo dengan jumlah uang yang diambil lalu kembalikan nilai true. Sebaliknya, cukup kembalikan nilai false saja.

### Kesimpulan
* Attribute atau property merupakan sebuah variabel atau konstanta.
* Behavior merupakan fungsi.
* Untuk dapat mengakses anggota-anggota dari suatu obyek, harus dibuat instance dari class tersebut terlebih dahulu.
* Constructor dipanggil ketika object pertama kali dibuat.
* Fungsi getter memungkinkan developer untuk mendapatkan nilai attribute dari suatu class tanpa membuat attribute tersebut public.
