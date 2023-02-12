public class Task_1 {
    /*
    Написать метод/функцию, который/которая на вход принимает массив городов.
    В качестве результата возвращает строку, где города разделены запятыми,
    а в конце стоит точка.
    Пример:
    «Москва, Санкт-Петербург, Воронеж.»
    */

    static void action() {
        System.out.println(listToString(repairArray()));
    }

    private static String[] repairArray() {
        return new String[]{"Москва", "Санкт-Петербург", "Казань", "Ростов-на-Дону"};
    }

    private static String listToString(String[] listOfCities) {
        String s = String.join(", ", listOfCities).toString();
        return s + ".";
    }
}
