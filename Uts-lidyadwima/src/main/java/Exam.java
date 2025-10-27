public class Exam extends Assessment implements Gradable {
    private double score;

    public Exam(String studentName, double score) {
        super(studentName);
        this.score = score;
    }

    @Override
    double calculateFinalScore() {
        return score;
    }

    @Override
    public String getGrade() {
        if (score >= 80) return "A";
        else if (score >= 70) return "B";
        else if (score >= 60) return "C";
        else return "D";
    }
}
