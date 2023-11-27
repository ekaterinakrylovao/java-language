public class SwitchExample {
    enum Day { MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY }

    public static void main(String[] args) {
        byte byteValue = 2;
        short shortValue = 222;
        int integerValue = 222222;
        char grade = 'A';
        String dayOfWeek = "Monday";
        Day enumDay = Day.WEDNESDAY;

        switchByte(byteValue);
        switchShort(shortValue);
        switchInteger(integerValue);
        switchChar(grade);
        switchString(dayOfWeek);
        switchEnum(enumDay);
    }

    static void switchByte(byte value) {
        switch (value) {
            case 2:
                System.out.println("Byte variable is 2");
                break;
            default:
                System.out.println("Byte variable is not 2");
        }
    }

    static void switchShort(short value) {
        switch (value) {
            case 2:
                System.out.println("Short variable is 2");
                break;
            case 4:
                System.out.println("Short variable is 4");
                break;
            case 222:
                System.out.println("Short variable is 222");
                break;
            default:
                System.out.println("There is no 'case' declared for this short value");
        }
    }

    static void switchInteger(int value) {
        switch (value) {
            case 2:
                System.out.println("Integer variable is 2");
                break;
            case 222222:
                System.out.println("Integer variable is 222222");
                break;
            default:
                System.out.println("There is no 'case' declared for this integer value");
        }
    }

    static void switchChar(char value) {
        switch (value) {
            case 'A':
                System.out.println("Char variable is 'A' (65)");
                break;
            case 'B':
                System.out.println("Char variable is 'B' (66)");
                break;
            default:
                System.out.println("There is no 'case' declared for this char value");
        }
    }

    static void switchString(String value) {
        switch (value) {
            case "Sunday":
                System.out.println("String variable is \"Sunday\"");
                break;
            case "Monday":
                System.out.println("String variable is \"Monday\"");
                break;
            default:
                System.out.println("There is no 'case' declared for this string value");
        }
    }

    static void switchEnum(Day value) {
        switch (value) {
            case WEDNESDAY:
                System.out.println("Enum variable is WEDNESDAY");
                break;
            case FRIDAY:
                System.out.println("Enum variable is FRIDAY");
                break;
            default:
                System.out.println("There is no 'case' declared for this enum value");
        }
    }
}
