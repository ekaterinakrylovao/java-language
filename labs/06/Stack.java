import java.util.Arrays;

public class Stack<DataType> {
    private Object[] stackArray;
    private int top;

    public Stack() {
        stackArray = new Object[0];
        top = -1;
    }

    public void push(DataType value) {
        ensureCapacity(top + 2);
        stackArray[++top] = value;
        System.out.println("Добавлен элемент: " + value);
    }

    public DataType pop() {
        if (isEmpty()) {
            System.out.println("Стек пуст. Невозможно удалить элемент.");
            return null;
        }

        DataType value = (DataType) stackArray[top--];
        System.out.println("Удален элемент: " + value);
        return value;
    }

    public DataType peek() {
        if (isEmpty()) {
            System.out.println("Стек пуст. Возвращается значение по умолчанию: " + null);
            return null;
        }

        return (DataType) stackArray[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    private void ensureCapacity(int minCapacity) {
        int oldCapacity = stackArray.length;
        if (minCapacity > oldCapacity) {
            int newCapacity = Math.max(oldCapacity * 2, minCapacity);
            stackArray = Arrays.copyOf(stackArray, newCapacity);
        }
    }

    public static void main(String[] args) {
        Stack<Integer> integerStack = new Stack<>();

        integerStack.push(1);
        integerStack.push(2);
        integerStack.push(3);

        System.out.println("Верхний элемент стека: " + integerStack.peek());

        integerStack.pop();
        integerStack.pop();
        integerStack.pop();

        System.out.println("Стек пуст: " + integerStack.isEmpty());

        Stack<String> stringStack = new Stack<>();

        stringStack.push("One");
        stringStack.push("Two");
        stringStack.push("Three");

        System.out.println("Верхний элемент стека: " + stringStack.peek());

        stringStack.pop();
        stringStack.pop();
        stringStack.pop();

        System.out.println("Стек пуст: " + stringStack.isEmpty());
    }
}
