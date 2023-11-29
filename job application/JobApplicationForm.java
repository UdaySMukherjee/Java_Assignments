import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class JobApplicationForm {

    private String name;
    private String address;
    private String contactDetails;
    private String workExperience;

    public void displayForm() {
        System.out.println("***** Job Application Form *****");
    }

    public void acceptInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        this.name = scanner.nextLine();

        System.out.print("Enter your address: ");
        this.address = scanner.nextLine();

        System.out.print("Enter your contact details: ");
        this.contactDetails = scanner.nextLine();

        System.out.print("Enter your work experience: ");
        this.workExperience = scanner.nextLine();
    }

    public void storeInFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("job_application.txt"))) {
            writer.write("Name: " + name);
            writer.newLine();
            writer.write("Address: " + address);
            writer.newLine();
            writer.write("Contact Details: " + contactDetails);
            writer.newLine();
            writer.write("Work Experience: " + workExperience);
            writer.newLine();
            System.out.println("Application submitted successfully! Data has been stored in 'job_application.txt'.");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        JobApplicationForm applicationForm = new JobApplicationForm();
        applicationForm.displayForm();
        applicationForm.acceptInput();
        applicationForm.storeInFile();
    }
}
