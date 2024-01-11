public class Main {
    public static void main(String[] args) {
        try {

            Class.forName("NonExistentClass");
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found: " + e.getMessage());
        }
    }
}