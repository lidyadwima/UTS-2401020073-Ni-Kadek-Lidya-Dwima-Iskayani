import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;

        System.out.println("--- MENU PROGRAM ---");
        System.out.println("1. Soal 4 - Inheritance & Polymorphism");
        System.out.println("2. Soal 5 - Abstract Class & Interface");
        System.out.print("Pilih nomor soal: ");
        pilihan = input.nextInt();
        input.nextLine(); // membersihkan buffer

        switch (pilihan) {
            case 1:
                System.out.println("---- Soal 4: Inheritance & Polymorphism ----");
                Person[] people = {
                        new Student1("Andi", "2025"),
                        new Lecturer("Bu Lili", "Pemrograman Java"),
                        new Person("budi")
                };

                for (Person p : people) {
                    p.introduce();
                }
                break;

            case 2:
                System.out.println("---- Soal 5: Abstract Class & Interface ----");
                System.out.print("Masukkan nama mahasiswa: ");
                String nama = input.nextLine();

                System.out.print("Masukkan nilai ujian: ");
                double nilaiUjian = input.nextDouble();

                System.out.print("Masukkan jumlah tugas: ");
                int jumlahTugas = input.nextInt();

                double[] nilaiTugas = new double[jumlahTugas];
                for (int i = 0; i < jumlahTugas; i++) {
                    System.out.print("Nilai tugas ke-" + (i + 1) + ": ");
                    nilaiTugas[i] = input.nextDouble();
                }

                Exam exam = new Exam(nama, nilaiUjian);
                Assignment tugas = new Assignment(nama, nilaiTugas);

                System.out.println("---- HASIL PENILAIAN ----");
                System.out.println("Nama Mahasiswa: " + nama);
                System.out.println("Nilai Ujian Akhir: " + exam.calculateFinalScore() + " → Grade: " + exam.getGrade());
                System.out.println("Nilai Rata-rata Tugas: " + tugas.calculateFinalScore() + " → Grade: " + tugas.getGrade());
                break;

            default:
                System.out.println("Pilihan tidak valid!");
        }

        input.close();
    }
}
