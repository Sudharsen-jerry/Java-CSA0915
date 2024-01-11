import java.lang.reflect.Field;
public class Main {
    public static void main(String[] args) {
        MyClass myObject = new MyClass();

        try {
            Field field = myObject.getClass().getDeclaredField("nonExistentField");
            System.out.println("Field value: " + field.get(myObject));
        } catch (NoSuchFieldException e) {
            System.out.println("Field not found: " + e.getMessage());
        } catch (IllegalAccessException e) {
            System.out.println("Illegal access: " + e.getMessage());
        }
    }
}
