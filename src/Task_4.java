import java.math.BigInteger;

public class Task_4 {
    /*
    Написать метод/функцию, который/которая на вход принимает целое число,
    а на выходе возвращает то, является ли число простым (не имеет делителей кроме 1 и самого себя).
    */
    static void action() {

        primeNumberCheck(199);
    }

    private static void primeNumberCheck(int number) {

        BigInteger bigInteger = BigInteger.valueOf(number);
        System.out.println(bigInteger.isProbablePrime((int) Math.log(number)));
    }
}
