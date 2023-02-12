import java.util.Arrays;

public class Task_3 {
    /*
    Написать метод/функцию, который/которая на вход принимает число (int),
    а на выходе выдает слово “компьютер” в падеже, соответствующем указанному количеству.
    Например, «25 компьютеров», «41 компьютер», «1048 компьютеров».
    //  1 компьютер
    //  2,3,4 компьютера
    //  5,6,7,8,9,11,12,13,14,15,16,17,18,0,19, компьютеров
     */
    static void action() {
        int[] numbers = {25, 41, 1048, 5, 11, 14, 2, 1, 0, 111};
        System.out.println(Arrays.toString(numbers));
        for (int i = 0; i < numbers.length; i++) {
            outputNumberOfPCsCorrectCase(numbers[i]);
        }
    }

    private static void outputNumberOfPCsCorrectCase(int numberOfPCs) {
        String number = String.valueOf(numberOfPCs);
        char[] num;
        if (number.length() < 2) {
            num = String.valueOf('0' + number).toCharArray();
        } else {
            num = String.valueOf(number).toCharArray();
        }

        if (num[num.length - 2] == '1' | num[num.length - 1] == '0') {
            System.out.println(numberOfPCs + " компьютеров");
        }
        if (num[num.length - 2] != '1' & '5' <= num[num.length - 1]) {
            System.out.println(numberOfPCs + " компьютеров");
        }
        if (num[num.length - 2] != '1' & num[num.length - 1] == '1') {
            System.out.println(numberOfPCs + " компьютер");
        }
        if (num[num.length - 2] != '1' & ('2' <= num[num.length - 1] & num[num.length - 1] <= '4')) {
            System.out.println(numberOfPCs + " компьютера");
        }
    }
}
