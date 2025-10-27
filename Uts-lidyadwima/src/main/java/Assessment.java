public abstract class Assessment {
    protected String studentName;

    public Assessment(String studentName) {
        this.studentName = studentName;
    }

    // method abstract → harus diimplementasikan di subclass
    abstract double calculateFinalScore();
}

//Soal 5 :

//Kapan Menggunakan Abstract Class
//Digunakan ketika beberapa class memiliki kesamaan atribut dan perilaku dasar.
//Abstract class dapat berisi method dengan isi (concrete method) dan juga method tanpa isi (abstract method).
//Cocok digunakan sebagai kerangka umum untuk class turunannya.
//Contoh:
//Assessment dijadikan abstract class karena semua jenis penilaian memiliki nama mahasiswa dan cara menghitung nilai akhir, tetapi setiap jenis penilaian memiliki perhitungan yang berbeda.

//Kapan Menggunakan Interface
//Digunakan ketika berbagai class perlu memiliki perilaku yang sama, meskipun tidak berada dalam satu hierarki pewarisan.
//Interface hanya berisi deklarasi method tanpa implementasi (sebelum Java 8).
//Cocok digunakan sebagai kontrak perilaku yang wajib dimiliki class yang mengimplementasikannya.
//Contoh:
//Gradable dijadikan interface karena setiap class yang dapat dinilai (seperti Exam dan Assignment) wajib memiliki method getGrade().