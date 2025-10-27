Soal 1 : command pada class course
Perbedaannya
Class adalah template atau blueprint untuk membuat object.
Contoh: Course adalah class yang mendefinisikan atribut dan perilaku (method).
Object adalah instansiasi dari class, yaitu hasil nyata dari blueprint-nya.
Contoh:
Course oop = new Course("Pemrograman Berorientasi Objek", 3, "Bu Lidya");
oop.displayInfo();

Soal 2: diclass course1
Kenapa Encapsulation penting?

Untuk melindungi data agar tidak diubah langsung dari luar (contohnya: credit = -5 tidak diperbolehkan).
Mencegah error logika pada program.
Menjaga integritas data dan memberi kontrol bagaimana atribut diubah.
→ oop adalah object dari class Course.

Soal 4: Sudah di Main 

Soal 5 : pada class Assessment
Kapan Menggunakan Abstract Class
Digunakan ketika beberapa class memiliki kesamaan atribut dan perilaku dasar.
Abstract class dapat berisi method dengan isi (concrete method) dan juga method tanpa isi (abstract method).
Cocok digunakan sebagai kerangka umum untuk class turunannya.
Contoh:
Assessment dijadikan abstract class karena semua jenis penilaian memiliki nama mahasiswa dan cara menghitung nilai akhir, tetapi setiap jenis penilaian memiliki perhitungan yang berbeda.

Kapan Menggunakan Interface
Digunakan ketika berbagai class perlu memiliki perilaku yang sama, meskipun tidak berada dalam satu hierarki pewarisan.
Interface hanya berisi deklarasi method tanpa implementasi (sebelum Java 8).
Cocok digunakan sebagai kontrak perilaku yang wajib dimiliki class yang mengimplementasikannya.
Contoh:
Gradable dijadikan interface karena setiap class yang dapat dinilai (seperti Exam dan Assignment) wajib memiliki method getGrade().
