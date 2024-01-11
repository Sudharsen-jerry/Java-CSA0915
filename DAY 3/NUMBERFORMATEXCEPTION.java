public class Main {
    public static void main(String[] args) {
        try {

            String nonNumericString = "abc";
            int number = Integer.parseInt(nonNumericString);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught: " + e.getMessage());
        }
    }
}