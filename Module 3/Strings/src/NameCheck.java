@SuppressWarnings({"ConstantValue", "PointlessBooleanExpression"})
public class NameCheck {
    public static void checkName() {
        String person1 = "Иван Иванов";
        String person2 = "иван иванов";
        boolean match = person1.equalsIgnoreCase(person2);
        if (match == true) {
            System.out.println("Выберите другое имя пользователя: ");
        } else {
            System.out.println("Отличное имя!");
        }

        String person3 = person1.replace("Иван", "Вован");
        System.out.println(person3);
        int nameLen = person3.length();

        System.out.println("Ваше имя имеет " + nameLen + " символов.");

        String trimmedName = person3.replace(" ", "");
        System.out.println(trimmedName);
        int trimmedNameLen = trimmedName.length();

        System.out.println("А без пробелов ваше имя занимает " + trimmedNameLen + " символов");

    }
}
