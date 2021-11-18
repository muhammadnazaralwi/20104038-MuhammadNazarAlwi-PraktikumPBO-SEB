
## Modul 6: Konsep Inheritance

### Dasar Teori
Dengan konsep inheritance, sebuah class dapat mempunyai class turunan. Suatu class yang mempunyai class turunan dinamakan parent class atau base class. Sedangkan class turunan itu sendiri seringkali disebut subclass atau child class. Suatu subclass dapat mewarisi apa-apa yang dipunyai oleh parent class-nya. Kesimpulannya, boleh dikatakan bahwa suatu subclass adalah tidak lain hanya memperluas (extend) parent class-nya.

Di dalam Java untuk mendeklarasikan suatu class sebagai subclass dilakukan dengan cara menambahkan kata kunci extends setelah deklarasi nama class, kemudian diikuti dengan nama parent class-nya. Berikut adalah contoh deklarasi inheritance.

Contoh:
```
public class B extends A { 
	...
}
```

Contoh diatas memberitahukan kompiler Java bahwa kita ingin meng- extend class A ke class B. Dengan kata lain, class B adalah subclass (class turunan) dari class A, sedangkan class A adalah parent class dari class B.

Java hanya memperkenankan adanya single inheritance. Konsep single inheritance hanya memperbolehkan suatu sublass mempunyai satu parent class. Dengan konsep single inheritance ini, masalah pewarisan akan dapat diamati dengan mudah.

Suatu parent class dapat tidak mewariskan sebagian member-nya kepada subclass-nya. Sejauh mana suatu member dapat diwariskan ke class lain, ataupun suatu member dapat diakses dari class lain, sangat berhubungan dengan access control (kontrol pengaksesan). Di dalam java, kontrol pengaksesan dapat digambarkan dalam tabel berikut ini:

|Modifier| class yang sama | package yang sama	| subclass | class manapun |
|--|--| -- | -- | -- |
| private | ✅ |	   |    |    |
| default | ✅ |  ✅   |    |    |
| protected | ✅ |  ✅  | ✅   |    |
| public   | ✅ | ✅ | ✅  | ✅ |

Kata kunci super dipakai untuk merujuk pada member dari parent class, sebagaimana kata kunci this yang dipakai untuk merujuk pada member dari class itu sendiri.

Ada beberapa hal yang harus diingat ketika menggunakan pemanggil constuktor super:
 1. Pemanggil super() HARUS DIJADIKAN PERNYATAAN PERTAMA DALAM constructor.
 2. Pemanggil super() hanya dapat digunakan dalam definisi constructor.
 3. Termasuk constructor this() dan pemanggil super() TIDAK BOLEH TERJADI DALAM constructor YANG SAMA.

Contoh:
```
public class Siswa {  
	private int nilai;
	
	public setNilai(int nilai) { 
		this.nilai=nilai;  
	}  
}
```

### Penjelasan Kode
#### Percobaan 1
Pada percobaan kali ini, kami memiliki class `Bentuk` dengan attribute `panjang` dan `lebar` bertipe data integer.

```
public class Bentuk {
	protected int panjang, lebar;
}
```

Kemudian class `Persegi` menurunkan sifat dari class `Bentuk`:
```
public class Persegi extends Bentuk { ... }
```

Karena class `Persegi` merupakan turunan dari class `Bentuk`, maka kelas persegi dapat mengakses attribut dan behavior dari class `Bentuk`. Cara mengaksesnya bisa menggunakan keyword `super`.
```
public class Persegi extends Bentuk {
	...
	public void setSuperPanjang(int p) {
		super.panjang = p;
	}
}
```

#### Percobaan 2
Hasil running program pada percobaan 2 ini sebagai berikut:
```
Inside Person:Constructor
Inside Student:Constructor
```

Program mengeluarkan output di atas karena di dalam fungsi main dilakukan instansiasi atau pembuatan objek dari class `Student`:
```
public static void main(String[] args) {
	Student Wahyu = new Student();
}
```

Ketika membuat suatu objek, constructor dari objek tersebut akan dipanggil.
```
public class Student extends Person {
	public Student() {
		System.out.println("Inside Student:Constructor");
	}
}
```

Tetapi karena class `Student` merupakan turunan dari class `Person` maka program akan memanggil constructor dari kelas `Person` terlebih dahulu sebelum memanggil constructor dari kelas `Student`.
```
public Person() {
	System.out.println("Inside Person:Constructor");
	name = "";
	address = "";
}
```

#### Percobaan 3
Pada saat meng-compile program pada percobaan 3 ini, program tidak bisa dieksekusi karena terjadi compiler error.
Ada dua jenis error pada program ini yaitu:

1. Error karena access modifier.
Karena variabel x dan y yang berada di class A akan diakses oleh subclass dari class A, maka access modifier dari variabel tersebut harus `protected` atau `public`. Dalam kasus ini kami memilih untuk menggunakan `protected` karena subclass dari class A masih berada di package yang sama.
	```
	protected int x, y;
	```
2. Error karena typo
Untuk error ini, untuk memperbaikinya cukup mengganti huruf "z" menjadi "Z". 
	```
	anak.setZ(50);
	```

#### Percobaan 4
Pada percobaan ini kami telah mempelajari bahwa pemanggilan parent class's constructor harus dipanggil sebelum pemanggilan subclass's constructor. 

```
public class Parent { }

public class Child extends Parent {
	int x;

	public Child() {
		super();
		x = 5;
	}
}
```

Pemanggilan parentclass's constructor (`super`) harus dipanggil pertama kali karena untuk memastikan kalau kita memanggil method dari parent class, parent class sudah terdefinisikan.

### Kesimpulan
* Dalam paradigma OOP sebuah class dapat mempunyai class turunan.
* Class yang mempunyai turunan disebut parent class, sementara class yang menurunkan sifat dari parent class disebut subclass.
* Untuk mengakses attribute atau behavior parent class dari subclass, gunakan keyword `super`.
* Constructor merupakan behavior yang pertama kali dipanggil saat objek dibuat.
* Jika attribute atau behavior yang berada di parent class diakses oleh subclassnya, gunakanlah access modifier `protected` atau `public`.
* Pemanggilan parent class's constructor harus dipanggil di baris pertama pada subclass's constructor.
