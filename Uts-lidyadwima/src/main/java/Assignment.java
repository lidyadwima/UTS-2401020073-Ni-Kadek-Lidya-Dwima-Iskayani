public class Assignment extends Assessment implements Gradable {
    private double[] scores;

    public Assignment(String studentName, double[] scores) {
        super(studentName);
        this.scores = scores;
    }

    @Override
    double calculateFinalScore() {
        double total = 0;
        for (double s : scores) total += s;
        return total / scores.length;
    }

    @Override
    public String getGrade() {
        double finalScore = calculateFinalScore();
        if (finalScore >= 85) return "A";
        else if (finalScore >= 70) return "B";
        else if (finalScore >= 55) return "C";
        else return "D";
    }
}
