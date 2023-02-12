public class Task_6 {

    /* Написать метод, который в консоль выводит таблицу умножения.
    На вход метод получает число, до которого выводит таблицу умножения.
    В консоли должна появиться таблица. Например, если на вход пришло число 5, то получим:

      1 2  3  4  5
    1 1 2  3  4  5
    2 2 4  6  8  10
    3 3 6  9  12 15
    4 4 8  12 16 20
    5 5 10 15 20 25
    Важно:
    В последней строке между числами ровно по одному пробелу должно выводиться.
    В каждом столбце числа должны быть выровнены по правому краю.
    */
    public static void action() {
        createsTable(5);
    }

    private static void createsTable(int number) {

        int lengthOfProductOfNumbers = String.valueOf(number * number).length();
        int productOfNumbers;


        StringBuilder builder = new StringBuilder();
        String[][] table = new String[number][number];

        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                productOfNumbers = (i + 1) * (j + 1);
                builder.append(productOfNumbers);
                for (int k = String.valueOf(productOfNumbers).length(); k < lengthOfProductOfNumbers; k++) {
                    builder.insert(0, " ");
                }

                table[i][j] = String.valueOf(builder);
                builder.delete(0, builder.length());
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
    }
}
