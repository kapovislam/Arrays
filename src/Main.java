public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        //Часть 2
        task5();
        task6();
        task7();
        task8();

    }

    private static void task8() {
        //Задание 2.4
        /**
         *Ф.И.О. сотрудников начали отображаться в обратную сторону.
         * Напишите код, который в случае такого бага будет выводить Ф.И.О. сотрудников в корректном виде.
         */
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }

    private static void task7() {
        //Задание 2.3
        /**
         * А теперь нам нужно понять, какую в среднем сумму наша компания тратила в течение данных 30 дней.
         */
        int arr[] = generateRandomArray();
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i] / 30;
        }
        System.out.println(sum);
    }

    private static void task6() {
        //Задание 2.2
        /**
         * Следующая задача — найти минимальную и максимальную трату за день.
         */
        int arr[] = generateRandomArray();
        int maxDay = 0;
        int minDay = 200000;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxDay) {
                maxDay = arr[i];
            }
        }
        System.out.println("Максимальная сумма трат за день составила " + maxDay + "  рублей");
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] < minDay) {
                minDay = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minDay + "  рублей");
    }

    private static void task5() {
        //Задание 2.1
        /**
         * Посчитать сумму всех выплат за месяц.
         * Нужно написать программу, которая решит эту задачу, и вывести в консоль результат
         * в формате: «Сумма трат за месяц составила … рублей».
         */
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
    }

    private static void task4() {
        //Задание 4
        /**
         *Пройдитесь по первому целочисленному массиву и все нечетные числа в нем
         * сделайте четными (нужно прибавить 1).
         */
        int[] month = new int[3];
        month[0] = 1;
        month[1] = 2;
        month[2] = 3;
        for (int i = 0; i < month.length; i++) {
            if (month[i] % 2 == 0) {
                System.out.println(month[i]);
            } else if (month[i] % 2 != 0) {
                month[i] += 1;
                System.out.println(month[i]);
            }
        }
    }

    private static void task3() {
        //Задание 3
        /**
         * Теперь ваша задача – распечатать все элементы всех трех массивов,
         * но начинать нужно не с первого элемента массива, а с последнего.
         */
        int[] month = new int[3];
        month[0] = 1;
        month[1] = 2;
        month[2] = 3;
        for (int i = month.length - 1; i >= 0; i--) {
            System.out.print(month[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        double[] weight = {1.57, 7.654, 9.986};
        for (int i = weight.length - 1; i >= 0; i--) {
            System.out.print(weight[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        int[] passport = {14, 20, 45};
        for (int i = passport.length - 1; i >= 0; i--) {
            System.out.print(passport[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    private static void task2() {
        //Задание 2
        /**
         * распечатайте все элементы всех трех массивов, начиная с первого элемента, через запятую.
         * Запятая между последним элементом одного массива и первым элементом следующего не нужна.
         */
        int[] month = new int[3];
        month[0] = 1;
        month[1] = 2;
        month[2] = 3;
        for (int i = 0; i < month.length; i++) {
            System.out.print(month[i]);
            if (i != month.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        double[] weight = {1.57, 7.654, 9.986};
        for (int i = 0; i < weight.length; i++) {
            System.out.print(weight[i]);
            if (i != weight.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        int[] passport = {14, 20, 45};
        for (int i = 0; i < passport.length; i++) {
            System.out.print(passport[i]);
            if (i != passport.length - 1) {
                System.out.print(", ");
            }

        }
        System.out.println();
    }


    private static void task1() {
        //Задание 1.1
        /**
         * Объявите три массива:
         * Целочисленный массив, заполненный тремя цифрами – 1, 2 и 3 – с помощью ключевого слова new.
         * Массив, в котором можно хранить три дробных числа – 1.57, 7.654, 9.986 –  сразу заполнив его значениями.
         * Произвольный массив – тип и количество данных определите сами.
         */
        int[] month = new int[3];
        month[0] = 1;
        month[1] = 2;
        month[2] = 3;
        double[] weight = {1.57, 7.654, 9.986};
        int[] passport = {14, 20, 45};

    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}
