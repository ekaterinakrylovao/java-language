public class MyClass<T> {
    private T value;

    public MyClass(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public static <T> void swapValues(MyClass<Wrapper<T>> obj1, MyClass<Wrapper<T>> obj2) {
        Wrapper<T> value1 = obj1.getValue();
        Wrapper<T> value2 = obj2.getValue();
        
        Wrapper<T> temp = new Wrapper<>(value1.get());
        value1.set(value2.get());
        value2.set(temp.get());
    }


    public static void main(String[] args) {
        MyClass<Wrapper<Integer>> obj1 = new MyClass<>(new Wrapper<>(5));
        MyClass<Wrapper<Integer>> obj2 = new MyClass<>(new Wrapper<>(10));

        System.out.println("Values before swap:");
        System.out.println("obj1: " + obj1.getValue().get());
        System.out.println("obj2: " + obj2.getValue().get());

        swapValues(obj1, obj2);

        System.out.println("\nValues after swap:");
        System.out.println("obj1: " + obj1.getValue().get());
        System.out.println("obj2: " + obj2.getValue().get());
    }
}
