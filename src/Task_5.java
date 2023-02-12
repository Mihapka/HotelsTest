import java.util.HashMap;
import java.util.Map;

public class Task_5 {

    /* Написать метод, который определяет, какие элементы присутствуют в
    двух экземплярах в каждом из массивов (= в двух и более, причем в каждом).
    На вход подаются два массива. На выходе массив с необходимыми совпадениями.
    Пример:
    [7, 17, 1, 9, 1, 17, 56, 56, 23], [56, 17, 17, 1, 23, 34, 23, 1, 8, 1]
    На выходе [1, 17]
    */
    public static void action() {
        searchForDuplicates();
    }

    private static void searchForDuplicates() {

        Map<Integer, Integer> map01 = new HashMap<>();
        Map<Integer, Integer> map02 = new HashMap<>();
        Map<Integer, Integer> resultingMap = new HashMap<>();

        int[] array01 = {1, 3, 4, 7, 2, 89, 4, 12, 43, 3, 1, 2, 4, 7, 98, 3, 43, 4, 56};
        int[] array02 = {3, 10, 3, 2, 7, 3, 33, 56, 76, 12, 7, 89};

        for (int i : array01) {
            if (map01.containsKey(i)) {
                map01.put(i, map01.get(i) + 1);
            } else {
                map01.put(i, 1);
            }
        }
        for (int i : array02) {
            if (map02.containsKey(i)) {
                map02.put(i, map02.get(i) + 1);
            } else {
                map02.put(i, 1);
            }
        }

        map01.forEach((key, value) -> System.out.print(key + " = " + value + "   "));
        System.out.println(" ");

        map02.forEach((key, value) -> System.out.print(key + " = " + value + "   "));
        System.out.println(" ");

        for (Map.Entry<Integer, Integer> set : map02.entrySet()) {
            if (map01.containsKey(set.getKey()) & (map01.get(set.getKey()) == set.getValue())) {
                resultingMap.put(set.getKey(), set.getValue());
            }
        }

        resultingMap.forEach((key, value) -> System.out.print(key + " = " + value + "   "));
    }
}
