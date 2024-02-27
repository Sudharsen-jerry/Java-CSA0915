
interface Maths {
    void average(int[] numbers);
    int total(int[] numbers);
    void percentage(int obtained, int total);
}

class Student implements Maths {
    public void average(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        double avg = (double) sum / numbers.length;
        System.out.println("Average: " + avg);
    }

    public int total(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }
    public void percentage(int obtained, int total) {
        double percentage = ((double) obtained / total) * 100;
        System.out.println("Percentage: " + percentage + "%");
    }
}

public class Java {
    public static void main(String[] args) {
        int[] marks = {80, 75, 90, 85, 70};
        int totalMarks = 500; 
        Student student = new Student();
        student.average(marks);
        int total = student.total(marks);
        System.out.println("Total: " + total);
        student.percentage(total, totalMarks);
    }
}
