import java.lang.reflect.Method;

public class ReflectionMethod {

    public static void main(String[] args) {
        try {
            String className = "ExampleClass";

            String methodName = "exampleMethod";

            Class<?> clazz = Class.forName(className);
            Object instance = clazz.newInstance();

            Method method = clazz.getMethod(methodName);

            method.invoke(instance);
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | NoSuchMethodException e) {
            e.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

class ExampleClass {
    public void exampleMethod() {
        System.out.println("Метод exampleMethod вызван!");
    }
}
