public class Triple<T extends Number & Comparable<T>> {
    private T first;
    private T second;
    private T third;

    public Triple(T first, T second, T third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }

    public T getThird() {
        return third;
    }

    public T min() {
        if (first.compareTo(second) <= 0 && first.compareTo(third) <= 0) {
            return first;
        } else if (second.compareTo(first) <= 0 && second.compareTo(third) <= 0) {
            return second;
        } else {
            return third;
        }
    }

    public T max() {
        if (first.compareTo(second) >= 0 && first.compareTo(third) >= 0) {
            return first;
        } else if (second.compareTo(first) >= 0 && second.compareTo(third) >= 0) {
            return second;
        } else {
            return third;
        }
    }

    public double mean() {
        return (first.doubleValue() + second.doubleValue() + third.doubleValue()) / 3;
    }

    public Triple<T> add(T value) {
        return new Triple<>(addValues(first, value), addValues(second, value), addValues(third, value));
    }

    public Triple<T> subtract(T value) {
        return new Triple<>(subtractValues(first, value), subtractValues(second, value), subtractValues(third, value));
    }

    public Triple<T> multiply(T value) {
        return new Triple<>(multiplyValues(first, value), multiplyValues(second, value), multiplyValues(third, value));
    }

    public Triple<T> divide(T value) {
        if (value.doubleValue() == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return new Triple<>(divideValues(first, value), divideValues(second, value), divideValues(third, value));
    }

    private T addValues(T a, T b) {
        return convertToNumber(a.doubleValue() + b.doubleValue());
    }

    private T subtractValues(T a, T b) {
        return convertToNumber(a.doubleValue() - b.doubleValue());
    }

    private T multiplyValues(T a, T b) {
        return convertToNumber(a.doubleValue() * b.doubleValue());
    }

    private T divideValues(T a, T b) {
        return convertToNumber(a.doubleValue() / b.doubleValue());
    }

    private T convertToNumber(double result) {
        if (first instanceof Integer) {
            return (T) Integer.valueOf((int) result);
        } else if (first instanceof Double) {
            return (T) Double.valueOf(result);
        } else {
            throw new UnsupportedOperationException("Unsupported numeric type");
        }
    }

    public static void main(String[] args) {
        Triple<Integer> triple = new Triple<>(5, 8, 3);

        System.out.println("Min: " + triple.min());
        System.out.println("Max: " + triple.max());
        System.out.println("Mean: " + triple.mean());

        Triple<Integer> addedTriple = triple.add(2);
        System.out.println("Added Triple: " + addedTriple.getFirst() + ", " + addedTriple.getSecond() + ", " + addedTriple.getThird());

        Triple<Integer> subtractedTriple = triple.subtract(1);
        System.out.println("Subtracted Triple: " + subtractedTriple.getFirst() + ", " + subtractedTriple.getSecond() + ", " + subtractedTriple.getThird());

        Triple<Integer> multipliedTriple = triple.multiply(3);
        System.out.println("Multiplied Triple: " + multipliedTriple.getFirst() + ", " + multipliedTriple.getSecond() + ", " + multipliedTriple.getThird());

        Triple<Integer> dividedTriple = triple.divide(2);
        System.out.println("Divided Triple: " + dividedTriple.getFirst() + ", " + dividedTriple.getSecond() + ", " + dividedTriple.getThird());
    }
}
