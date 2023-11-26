public class SwitchExample {

    enum Day { MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY }

    public static void main(String[] args) {
        int choice = 2;
        switchExample(choice);

        char grade = 'A';
        switchExample(grade);

        String dayOfWeek = "Monday";
        switchExample(dayOfWeek);

        Day enumDay = Day.WEDNESDAY;
        switchExample(enumDay);

        long longValue = 123456789L;
        switchExample(longValue);
    }

    static void switchExample(Object value) {
        switch (value.getClass().getSimpleName()) {
            case "Integer":
                System.out.println("Integer value: " + value);
                break;
            case "Character":
                System.out.println("Character value: " + value);
                break;
            case "String":
                System.out.println("String value: " + value);
                break;
            case "Day":
                System.out.println("Enum value: " + value);
                break;
            case "Long":
                System.out.println("Long value: " + value);
                break;
            default:
                System.out.println("Unsupported type");
        }
    }
}
