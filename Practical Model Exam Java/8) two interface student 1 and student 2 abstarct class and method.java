interface Student1 {
    int total();
    double percentage();
}

interface Student2 {
    int total();
    double percentage();
}

abstract class AbstractStudent implements Student1, Student2 {
    public int total() {
        return 500;
    }
    
    public double percentage() {
        int totalMarks = total();
        return (totalMarks / 5.0);
    }
    
    public abstract String studentName();
}

class ConcreteStudent extends AbstractStudent {
    public String name;
    
    public ConcreteStudent(String name) {
        this.name = name;
    }
    
    public String studentName() {
        return name;
    }
}

public class Main {
    public static void main(String[] args) {
        ConcreteStudent student = new ConcreteStudent("John Doe");
        
        System.out.println("Student Name: " + student.studentName());
        System.out.println("Total Marks: " + student.total());
        System.out.println("Percentage: " + student.percentage());
    }
}
