public class Stack {

    private int maxSize;
    private int[] stackArray;
    private int top;

    public Stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    public void push(int value) {
        if (top < maxSize - 1) {
            stackArray[++top] = value;
            System.out.println("Добавлен элемент: " + value);
        } else {
            System.out.println("Стек полон. Невозможно добавить элемент.");
        }
    }

    public int pop() {
        if (top >= 0) {
            int value = stackArray[top--];
            System.out.println("Удален элемент: " + value);
            return value;
        } else {
            System.out.println("Стек пуст. Невозможно удалить элемент.");
            return -1;
        }
    }

    public int peek() {
        if (top >= 0) {
            return stackArray[top];
        } else {
            System.out.println("Стек пуст. Возвращается значение по умолчанию: " + -1);
            return -1;
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Верхний элемент стека: " + stack.peek());

        stack.pop();
        stack.pop();
        stack.pop();

        System.out.println("Стек пуст: " + stack.isEmpty());
        System.out.println("Стек полон: " + stack.isFull());
    }
}
