import java.util.ArrayList;

public class Student {
    private String name;
    private String studentId;
    private ArrayList<Course1> courses; // daftar course yang diambil

    public Student(String name, String studentId) {
        this.name = name;
        this.studentId = studentId;
        this.courses = new ArrayList<>(); // inisialisasi daftar kosong
    }

    // menambah course ke daftar
    public void addCourse(Course1 course) {
        courses.add(course);
    }

    // menampilkan daftar course yang diambil
    public void showCourses() {
        System.out.println("Nama Mahasiswa: " + name);
        System.out.println("ID Mahasiswa  : " + studentId);
        System.out.println("Daftar Mata Kuliah:");
        System.out.println("--------------------------");

        for (Course1 c : courses) {
            c.displayInfo();
            System.out.println("--------------------------");
        }
    }
}
