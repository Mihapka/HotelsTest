public class Task_2 {
    /*
    Написать метод/функцию, который/которая на вход принимает число (float),
    а на выходе получает число, округленное до пятерок.
    Пример:
    27 => 25, 27.8 => 30, 41.7 => 40.

   */
    static void action() {
        System.out.println("27 -> " + roundUp(27));
        System.out.println("27.8 -> " + roundUp(27.8));
        System.out.println("41.7 -> " + roundUp(41.7));
    }

    public static int roundUp(double num) {
        return (int) (Math.round(num / (double) 5) * 5);
    }
}
