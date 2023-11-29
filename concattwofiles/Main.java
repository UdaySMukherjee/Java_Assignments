import java.io.*;
public class Main {
    public static void main(String[] args) {
        String sourceFilePath1 = "input.txt";
        String sourceFilePath2 = "sentences.txt";
        String targetFilePath = "concatenated.txt";
        try {
            FileWriter writer = new FileWriter(targetFilePath);
            FileReader reader1 = new FileReader(sourceFilePath1);
            int character1;
            while ((character1 = reader1.read()) != -1) {
                writer.write(character1);
            }
            reader1.close();
            FileReader reader2 = new FileReader(sourceFilePath2);
            int character2;
            while ((character2 = reader2.read()) != -1) {
                writer.write(character2);
            }
            reader2.close();
            writer.close();
            System.out.println("Files concatenated successfully!");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
