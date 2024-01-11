public class Main {
    public static int calculateSquare(int sideLength) {
        if (sideLength <= 0) {
            throw new IllegalArgumentException("Side length must be a positive integer");
        }
        return sideLength * sideLength;
    }

    public static void main(String[] args) {
        try {
            int result = calculateSquare(-5);
            System.out.println("Square: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught: " + e.getMessage());
        }
    }
}