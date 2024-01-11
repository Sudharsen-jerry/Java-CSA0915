import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try (DataInputStream dis = new DataInputStream(new FileInputStream("example.dat"))) {
            int value = dis.readInt();
            System.out.println("Read value: " + value);
        } catch (EOFException e) {
            System.out.println("End of file reached: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IOException: " + e.getMessage());
        }
    }
}