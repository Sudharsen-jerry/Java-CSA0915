public class Java {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            int squared = i * i;
            double squareRoot = Math.sqrt(squared);
            System.out.println("Number: " + i + ", Squared: " + squared + ", Square Root: " + squareRoot);
        }
    }
}