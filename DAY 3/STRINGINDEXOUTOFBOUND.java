public class Main {
    public static void main(String[] args) {
        try {

            String text = "Hello";
            char character = text.charAt(10);
            System.out.println("Character: " + character);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException caught: " + e.getMessage());
        }
    }
}