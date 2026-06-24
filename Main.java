import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Employee Performance Predictor");

        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Attendance (%): ");
        double attendance = sc.nextDouble();

        System.out.print("Task Completion (%): ");
        double taskCompletion = sc.nextDouble();

        System.out.print("Training Score: ");
        double trainingScore = sc.nextDouble();

        System.out.print("Experience (Years): ");
        int experience = sc.nextInt();

        FullTimeEmployee emp =
                new FullTimeEmployee(
                        id,
                        name,
                        attendance,
                        taskCompletion,
                        trainingScore,
                        experience);

        Predictor predictor = new Predictor();

        String result =
                predictor.predictPerformance(emp);

        System.out.println("\nPrediction Result");
        System.out.println("------------------");
        System.out.println("Employee: " +
                           emp.getName());

        System.out.println("Performance: " +
                           result);

        sc.close();
    }
}
