public class StringMethods {

    public static void main(String[] args) {
        // Примеры создания строк
        String str1 = "Hello, World!";
        String str2 = new String("Java Programming");

        // Методы для работы с длиной строки
        int length = str1.length();
        System.out.println("Длина строки str1: " + length);

        // Методы для работы с символами строки
        char firstChar = str1.charAt(0);
        char lastChar = str1.charAt(str1.length() - 1);
        System.out.println("Первый символ строки str1: " + firstChar);
        System.out.println("Последний символ строки str1: " + lastChar);

        // Методы для работы с подстроками
        String substring = str2.substring(0, 4);
        System.out.println("Подстрока из строки str2: " + substring);

        // Метод для объединения строк
        String concatString = str1.concat(str2);
        System.out.println("Объединение строк str1 и str2: " + concatString);

        // Метод для замены символов
        String replacedString = str1.replace('o', '0');
        System.out.println("Замена символов в строке str1: " + replacedString);

        // Методы для работы с регистром
        String upperCase = str1.toUpperCase();
        String lowerCase = str2.toLowerCase();
        System.out.println("Строка str1 в верхнем регистре: " + upperCase);
        System.out.println("Строка str2 в нижнем регистре: " + lowerCase);

        // Метод для сравнения строк
        boolean isEqual = str1.equals(str2);
        System.out.println("Строка str1 равна строке str2: " + isEqual);

        // Метод для сравнения строк без учета регистра
        boolean isEqualIgnoreCase = str1.equalsIgnoreCase(str2);
        System.out.println("Строка str1 равна строке str2 без учета регистра: " + isEqualIgnoreCase);

        // Метод для проверки начала и конца строки
        boolean startsWithHello = str1.startsWith("Hello");
        boolean endsWithWorld = str1.endsWith("World!");
        System.out.println("Строка str1 начинается с \"Hello\": " + startsWithHello);
        System.out.println("Строка str1 заканчивается на \"World!\": " + endsWithWorld);

        // Метод для поиска индекса подстроки
        int indexOfJava = str2.indexOf("Java");
        System.out.println("Индекс подстроки \"Java\" в строке str2: " + indexOfJava);

        // Метод для удаления начальных и конечных пробелов
        String stringWithSpaces = "   Trim me!   ";
        String trimmedString = stringWithSpaces.trim();
        System.out.println("Строка с пробелами: \"" + stringWithSpaces + "\"");
        System.out.println("Обрезанная строка: \"" + trimmedString + "\"");

        // Метод для разделения строки на подстроки
        String sentence = "Java is a powerful programming language";
        String[] words = sentence.split(" ");
        System.out.println("Разделенные слова: ");
        for (String word : words) {
            System.out.println(word);
        }

        // Метод для преобразования числа в строку
        int number = 42;
        String numberString = String.valueOf(number);
        System.out.println("Число преобразованное в строку: " + numberString);
    }
}
