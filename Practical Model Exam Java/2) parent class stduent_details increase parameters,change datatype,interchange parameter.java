class Parent {
    void student_details(int regno, String name) {
        System.out.println("Registration Number: " + regno);
        System.out.println("Name: " + name);
    }
}

class Child extends Parent {
    void student_details(double regno, String name, double percentage) {
        student_details((int) regno, name); 
        System.out.println("Percentage: " + percentage);
    }
    
    void student_details(String name, int regno) {
        student_details(regno, name); 
    }
}

public class Java {
    public static void main(String[] args) {
        Child child = new Child();
        child.student_details(123, "John Doe");
        child.student_details(123.0, "John Doe", 85.5);
        child.student_details("Jane Doe", 456);
    }
}
