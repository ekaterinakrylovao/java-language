import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ReflectionExample {

    public static void printClassInfo(Object obj) {
        Class<?> clazz = obj.getClass();

        System.out.println("Class: " + clazz.getName());

        System.out.println("Fields:");
        for (Field field : clazz.getDeclaredFields()) {
            System.out.println("  " + field.getType().getName() + " " + field.getName());
        }

        System.out.println("All Methods:");
        for (Method method : clazz.getDeclaredMethods()) {
            System.out.println("  " + method.getReturnType().getName() + " " + method.getName());
        }
    }

    public static void printPublicMethods(Class<?> clazz) {
        System.out.println("Public Methods:");

        for (Method method : clazz.getMethods()) {
            System.out.println("  " + method.getReturnType().getName() + " " + method.getName());
        }
    }

    public static void printNonStaticMethods(Class<?> clazz) {
        System.out.println("Non-Static Methods:");

        for (Method method : clazz.getDeclaredMethods()) {
            if (!Modifier.isStatic(method.getModifiers())) {
                System.out.println("  " + method.getReturnType().getName() + " " + method.getName());
            }
        }
    }

    public static void main(String[] args) {
        String exampleString = "Hello, Reflection!";

        // Вывести полную информацию о классе
        printClassInfo(exampleString);

        // Вывести только публичные методы
        printPublicMethods(String.class);

        // Вывести только нестатические методы
        printNonStaticMethods(String.class);
    }
}
