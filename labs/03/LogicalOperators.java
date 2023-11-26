public class LogicalOperators {

    public static void main(String[] args) {
        // Логические операции && || !
        boolean a = true;
        boolean b = false;
        System.out.println("a && b = " + (a && b));  // false
        System.out.println("a || b = " + (a || b));  // true
        System.out.println("!a = " + !a);            // false

        // Тернарная операция x < y ? x : y
        int x = 5;
        int y = 10;
        int min = (x < y) ? x : y;
        System.out.println("Минимальное значение: " + min);  // 5

        // Поразрядные логические операции & | ^ ~
        int num1 = 5;   // 0101 в двоичной системе
        int num2 = 3;   // 0011 в двоичной системе
        System.out.println("num1 & num2 = " + (num1 & num2));  // 0001 (1)
        System.out.println("num1 | num2 = " + (num1 | num2));  // 0111 (7)
        System.out.println("num1 ^ num2 = " + (num1 ^ num2));  // 0110 (6)
        System.out.println("~num1 = " + (~num1));              // 1111...1111111111111111111111010 (представление зависит от размера int)

        // Операции сдвига >> << >>>
        int num3 = 8;   // 1000 в двоичной системе
        System.out.println("num3 >> 1 = " + (num3 >> 1));     // 0100 (4)
        System.out.println("num3 << 1 = " + (num3 << 1));     // 10000 (16)
        System.out.println("num3 >>> 1 = " + (num3 >>> 1));   // 0100 (4) - сдвиг с заполнением нулями
    }
}
