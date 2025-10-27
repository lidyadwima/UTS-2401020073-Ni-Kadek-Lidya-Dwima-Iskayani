public class Course1 {
    private String courseName;
    private int credit;
    private String instructorName;

    public Course1(String courseName, int credit, String instructorName) {
        this.courseName = courseName;
        setCredit(credit); // panggil setter agar validasi tetap berlaku
        this.instructorName = instructorName;
    }

    public void setCredit(int credit) {
        if (credit < 0) {
            System.out.println("Credit tidak boleh negatif. Diset ke 0.");
            this.credit = 0;
        } else {
            this.credit = credit;
        }
    }

    public int getCredit() {
        return credit;
    }

    public void displayInfo() {
        System.out.println("Course: " + courseName);
        System.out.println("Credit: " + credit);
        System.out.println("Instructor: " + instructorName);
    }
}

//soal2:
//Kenapa Encapsulation penting?

//Untuk melindungi data agar tidak diubah langsung dari luar (contohnya: credit = -5 tidak diperbolehkan).
//Mencegah error logika pada program.
//Menjaga integritas data dan memberi kontrol bagaimana atribut diubah.