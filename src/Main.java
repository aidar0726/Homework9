import java.util.Arrays;

public class Main {
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void main(String[] args) {

        System.out.println("//задание 1");
        int[] arrayMonthlyExpenses = generateRandomArray();
        int sum = 0;
        for (int i = 0; i < arrayMonthlyExpenses.length; i++) {
            sum = sum + arrayMonthlyExpenses[i];
        }

        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        System.out.println("//задание 2");
        int maxSum = 0;
        for (int i = 0; i < arrayMonthlyExpenses.length; i++) {
            if (arrayMonthlyExpenses[i] - maxSum >= 0) {
                maxSum = arrayMonthlyExpenses[i];
            }
        }
        System.out.println("Максимальная сумма трат за день составила " + maxSum + " рублей");

        System.out.println("//задание 3");

        double averageAmount = sum / arrayMonthlyExpenses.length;
        System.out.println("Средняя сумма трат за месяц составила " + averageAmount + " рублей");

        System.out.println("//задание 4");

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }


    }

}