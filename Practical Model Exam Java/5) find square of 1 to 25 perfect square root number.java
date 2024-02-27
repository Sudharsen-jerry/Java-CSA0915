public class Java {
    public static void main(String[] args) {
        System.out.println("Perfect Square Numbers and Their Squares:");
        for (int i = 1; i <= 25; i++) {
            if (isPerfectSquare(i)) {
                int square = i * i;
                System.out.println(i + ": " + square);
            }
        }
    }
    public static boolean isPerfectSquare(int num) {
        int sqrt = (int) Math.sqrt(num);
        return sqrt * sqrt == num;
    }
}
