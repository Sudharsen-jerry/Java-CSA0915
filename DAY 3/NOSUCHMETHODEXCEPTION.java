public class Main {
    public static void main(String[] args) {
        Thread myThread = new Thread(() -> {
            try {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Working... " + i);
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted: " + e.getMessage());
            }
        });
        myThread.start();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        myThread.interrupt();
    }
}