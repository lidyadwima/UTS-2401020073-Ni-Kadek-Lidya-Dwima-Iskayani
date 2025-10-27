public class Student1 extends Person {
    private String studentId;

    public Student1(String name, String studentId) {
        super(name); // panggil constructor dari Person
        this.studentId = studentId;
    }

    @Override
    public void introduce() {
        System.out.println("Saya mahasiswa bernama " + name + " dengan NIM " + studentId);
    }
}
