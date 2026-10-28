
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
        System.out.println("Candidate: " + candidate.getName());
        System.out.println("Percentage: " + candidate.getPercentage());
        System.out.println("Backlogs: " + candidate.getBacklogs());
        System.out.println("Graduation Year: " + candidate.getGraduationYear());
        System.out.println("");
        Job job = new Job("Infosys", "Java Developer", 65.0, 0, 2026);

        System.out.println("Candidate: " + candidate.getName());
        System.out.println("Company: " + job.getCompany());
        System.out.println("Role: " + job.getRole());
        System.out.println("Minimum Percentage: " + job.getMinimumPercentage());
        System.out.println("Maximum Backlogs: " + job.getMaximumBacklogs());
        System.out.println("Required Graduation Year: " + job.getRequiredGraduationYear());

        scanner.close();
    }
}
