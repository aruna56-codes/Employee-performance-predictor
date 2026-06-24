public class Predictor extends PerformanceEvaluator {

    @Override
    public String predictPerformance(
            FullTimeEmployee employee) {

        double score =
                employee.getAttendance() * 0.30 +
                employee.getTaskCompletion() * 0.40 +
                employee.getTrainingScore() * 0.20 +
                employee.getExperience() * 1.0;

        if(score >= 90)
            return "Excellent";

        else if(score >= 75)
            return "Good";

        else if(score >= 60)
            return "Average";

        else
            return "Poor";
    }
}
