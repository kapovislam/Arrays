public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();

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
            if (month[i]%2==0){
                System.out.println(month[i]);
            }else if (month[i] % 2 != 0) {
                month[i]+=1;
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
}