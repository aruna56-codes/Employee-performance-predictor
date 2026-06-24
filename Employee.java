public class Employee {

    private int id;
    private String name;
    private double attendance;
    private double taskCompletion;
    private double trainingScore;

    public Employee(int id, String name,
                    double attendance,
                    double taskCompletion,
                    double trainingScore) {

        this.id = id;
        this.name = name;
        this.attendance = attendance;
        this.taskCompletion = taskCompletion;
        this.trainingScore = trainingScore;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getAttendance() {
        return attendance;
    }

    public double getTaskCompletion() {
        return taskCompletion;
    }

    public double getTrainingScore() {
        return trainingScore;
    }
}
