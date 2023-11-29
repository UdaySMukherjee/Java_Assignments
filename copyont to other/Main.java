import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class Main {
    public static void main(String[] args) {
        String sourceFilePath = "input.txt";
        String targetFilePath = "target.txt";
        try {
            FileReader reader = new FileReader(sourceFilePath);
            FileWriter writer = new FileWriter(targetFilePath);
            int character;
            while ((character = reader.read()) != -1) {
                writer.write(character);
            }
            reader.close();
            writer.close();
            System.out.println("File copied successfully!");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}