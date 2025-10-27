public class Lecturer extends Person {
    private String subject;

    public Lecturer(String name, String subject) {
        super(name);
        this.subject = subject;
    }

    @Override
    public void introduce() {
        System.out.println("Saya dosen bernama " + name + " yang mengajar mata kuliah " + subject);
    }
}
