
## Modul 2: Dasar Pemrogramman Java
 
### Dasar Teori
Penamaan identifier harus diawali dengan karakter unicode, 	tanda $ (dollar) atau tanda _ (underscore). Penamaan identifier ini bersifat case- sensitive dan tidak dibatasi panjang maksimum.

* Keyword dalam Java
Kata kunci adalah identifier yang telah dipesan untuk didefinisikan sebelumnya oleh Java untuk tujuan tertentu. Anda tidak dapat menggunakan keyword sebagai nama variabel, class, method.

* Tipe Dasar
Java mempunyai 8 tipe dasar, yaitu boolean, char, byte, short, int, long, float, dan double.

* Variabel
Variabel adalah item yang digunakan data untuk menyimpan pernyataan objek. Variabel memiliki tipe data dan nama. Tipe data menandakan tipe nilai yang dapat dibentuk oleh variabel itu sendiri. Nama variabel harus mengikuti aturan untuk identifier.

	Berikut Aturan penamaan variable:
		1. Diawali dengan : huruf/abjad atau karakter mata uang atau underscore ( _ )
		2. Terdiri dari huruf/abjad, angka dan underscore
		3. Tidak boleh mengandung karakter khusus atau spasi
		4. Tidak boleh diawali dengan angka
	
* Casting dan Promotion 
Casting diperlukan untuk mengkonversi dari suatu tipe ke tipe data yang lebih kecil panjang bitnya. Sedangkan promotion terjadi pada saat mengkonversi dari suatu tipe data ke tipe data yang lebih panjang bitnya.
		
### Penjelasan Kode
* Soal 1
	```
	long p = 2147483648;
	```
	Kode di atas akan mengalami compiler error dengan pesan error *Integer number too large*. Hal ini disebabkan karena Java langsung menyimpulkan bahwa bilangan tersebut merupakan interger 32-bit.
		
	Cara mengatasinya, tambahkan huruf `L` atau `l` di akhir bilangan untuk menyatakan secara eksplisit bahwa bilangan tersebut bertipe data `long`:
	```
	long p = 2147483648L;
	atau
	long p = 2147483648l; 
	```

* Soal 2
	```
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
	```
	Untuk membuat Cerita Ayam yang dijelaskan pada soal, dibutuhkan looping decrement untuk melakukan perulangan yang dimulai dari *anak ayam turun 10* hingga *anak ayam turun 1*.
		
	Jika variabel pencacah pada looping sudah bernilai 1, maka cetak **Mati 1 tinggal Induknya**. Pada kasus tersebut dibutuhkan conditional statement untuk mengecek nilai dari variabel pencacah. Dan tambahkan statement `break` untuk segera mengakhiri looping agar program tidak mengeksekusi kode di bawahnya.
		
* Soal 3
Karena pada soal diminta untuk menginputkan bilangan 3 buah bilangan sebanyak nilai dari test case, bilang tersebut dapat didefinisikan sebagai array integer. Besarnya array tergantung dari nilai test casenya.
	```
	public static void main(String[] args) {  
		Scanner scanner = new Scanner(System.in);  
		int testCaseCount;  
		int[] a, b, c, result;  

		testCaseCount = scanner.nextInt();  
		a = new int[testCaseCount];  
		b = new int[testCaseCount];  
		c = new int[testCaseCount];  
		result = new int[testCaseCount];

		...
	}
	```
	   
	 Proses input dapat dilakukan dengan looping. Dan di akhir looping terdapat operasi aritmatika yang hasilnya diinisiasikan pada array result.
	```
	for (int i = 0; i < testCaseCount; i++) {  
		a[i] = scanner.nextInt();  
		b[i] = scanner.nextInt();  
		c[i] = scanner.nextInt();  
		result[i] = a[i] + b[i] - c[i];  
	}
	```
	   
	 Terakhir, cetak nilai dari result menggunakan looping.
	```
	for (int i = 0; i < testCaseCount; i++) {
		System.out.println(result[i]);
	}
	```

### Kesimpulan
* Penamaan identifier harus diawali dengan karakter unicode, tanda $ (dollar) atau tanda _ (underscore).
* Tambahkan huruf `L` atau `l` untuk menyatakan secara eksplisit bahwa suatu bilangan bertipe data `long`.
* Tambahkan statement `break` untuk langsung mengakhiri proses looping.
* Secara default, Java langsung menyimpulkan bahwa bilangan yang kita tulis pada program merupakan interger 32-bit.
