import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args) {
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        try {
            fileReader = new FileReader("example.txt");
            bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while working with the file: " + e.getMessage());
        } finally {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
                if (fileReader != null) {
                    fileReader.close();
                }
            } catch (IOException e) {
                System.out.println("Error closing the file: " + e.getMessage());
            }
        }
    }
}