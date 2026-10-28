
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter candidate Name: ");
        String name = scanner.next();
        System.out.println("Enter percentage: ");
        double percentage = scanner.nextDouble();
        System.out.println("Enter backlogs: ");
        int backlogs = scanner.nextInt();
        System.out.println("Enter graduation year: ");
        int graduationYear = scanner.nextInt();

        Candidate candidate = new Candidate(name, percentage, backlogs, graduationYear);

        Job job = new Job("Infosys", "Java Developer", 65.0, 0, 2026);

        boolean percentagePass = candidate.getPercentage() >= job.getMinimumPercentage();

        boolean backlogPass = candidate.getBacklogs() <= job.getMaximumBacklogs();

        boolean yearPass = candidate.getGraduationYear() == job.getRequiredGraduationYear();

        boolean eligible = percentagePass && backlogPass && yearPass;

        System.out.println("==========================================");
        System.out.println("PLACEMENT ELIGIBILITY RESULT");
        System.out.println("==========================================");
        System.out.println();

        System.out.println("Candidate : " + candidate.getName());
        System.out.println("Company :" + job.getCompany());
        System.out.println("Role: " + job.getRole());
        System.out.println();

        if (percentagePass) {
            System.out.println("Percentage : PASS");
        } else {
            System.out.println("Percentage : FAIL");
        }

        if (backlogPass) {
            System.out.println("Backlogs : PASS");
        } else {
            System.out.println("Backlogs : FAIL");
        }

        if (yearPass) {
            System.out.println("Graduation Year : PASS");
        } else {
            System.out.println("Graduation Year : FAIL");
        }

        System.out.println();

        if (eligible) {
            System.out.println("Final RESULT : ELIGIBLE");
        } else {
            System.out.println("Final RESULT : NOT ELIGIBLE");
        }

        System.out.println("==========================================");

        scanner.close();
    }
}
