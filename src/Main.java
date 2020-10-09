public class Main {

    public static void main(String[] args) {
        LabGradingManager labGradingManager = new LabGradingManager();

        labGradingManager.CalculateGrades("Lab", "FA17-BSE-078");
        labGradingManager.CalculateGrades("CovidLab", "FA17-BSE-144");
        labGradingManager.CalculateGrades("CovidNonLab", "FA17-BSE-054");

        labGradingManager.CalculateGrades("Covid Lab without lab", "FA17-BSE-058");


    }
}
