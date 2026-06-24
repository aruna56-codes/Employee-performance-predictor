public class FullTimeEmployee extends Employee {

    private int experience;

    public FullTimeEmployee(
            int id,
            String name,
            double attendance,
            double taskCompletion,
            double trainingScore,
            int experience) {

        super(id, name,
              attendance,
              taskCompletion,
              trainingScore);

        this.experience = experience;
    }

    public int getExperience() {
        return experience;
    }
}
