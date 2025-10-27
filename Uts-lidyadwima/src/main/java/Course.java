public class Course {
    String courseName;
    int credit;
    String instructorName;

    public Course(String courseName, int credit, String instructorName) {
        this.courseName = courseName;
        this.credit = credit;
        this.instructorName = instructorName;
    }

    public void displayInfo() {
        System.out.println("Course: " + courseName);
        System.out.println("Credit: " + credit);
        System.out.println("Instructor: " + instructorName);
    }
}

//Soal 1 :
//Perbedaannya
//Class adalah template atau blueprint untuk membuat object.
//Contoh: Course adalah class yang mendefinisikan atribut dan perilaku (method).

//Object adalah instansiasi dari class, yaitu hasil nyata dari blueprint-nya.
//Contoh:
//Course oop = new Course("Pemrograman Berorientasi Objek", 3, "Bu Lidya");
//oop.displayInfo();
//→ oop adalah object dari class Course.