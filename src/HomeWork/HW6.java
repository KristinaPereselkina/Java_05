package HomeWork;

public class HW6 {
    static int number = 1;
    static int testCaseNum = 1;
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static void task() {
        System.out.println();
        System.out.println("TASK " + number);
        number++;
    }

    public static void task1() {
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }
    }


    public static void task2() {
        for (int i = 9; i >= 0; i--) {
            System.out.print(i + " ");
        }
    }

    public static void task3() {
        for (int i = 50; i < 56; i += 2) {
            System.out.print(i + " ");
        }
    }


    public static void task4() {
        for (int i = 326; i > 300; i--) {
            if (i % 7 == 0)
                System.out.print(i + " ");
        }
    }

    public static void task5() {
        for (double i = 12; i <= 13; i += 0.1) {
            System.out.print((Math.round(i * 10.0) / 10.0) + " ");
        }
    }

    public static void task6() {
        for (int i = 215; i <= 237; i++) {
            if (i % 2 == 0)
                System.out.print(i + " ");
        }
    }

    public static void task7() {
        for (int i = 7; i < 15; i++) {
            if (i % 7 == 0)
                System.out.print(i + " ");
        }
    }

    public static void task8() {
        for (int i = Short.MIN_VALUE; i <= Short.MAX_VALUE; i++) {
            if (i % 15001 == 0) {
            System.out.print(i + " ");
        }
    }
        }

    public static void task9() {
        for (int i = -10; i < 35; i++) {
            if (i == 0) {
                System.out.println("ZERO");
            } else if (i % 11 == 0) {
                System.out.println(ANSI_BLUE + i + ANSI_RESET);
            } else if (i % 12 == 0) {
                System.out.println(ANSI_GREEN + i + ANSI_RESET);
            } else {
                System.out.println(i);
            }
        }
    }



    public static void task10(int start, int end, int step) {
        for (int i = start; i < end; i += step) {
            System.out.println(i + " ");
        }
    }

    public static void task11(char m, char n) {
        for (char i = m; i < n; i++) {
            System.out.print(i + " ");
        }
    }

    public static void task12(int l) {
        for (int i = 0; i < l; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void task13(int n) {
        for (int i = 0; i < n; i++) {
            int a = (int) Math.pow(i, 2);
            System.out.println(a);
        }
    }

    public static void task14() {

        for (int i = 0; i < 10; i++) {
            System.out.print(i);
            if (i == 9) {
                for (int j = 0; j < 10; j++) {
                    System.out.print(j + "" + j);
                }
            }
        }
    }



    public static void task15() {

        for (int i = 1; i < 6; i++) {
            System.out.print(i + " " + -i + " ");

        }
    }


    public static void task16() {
        for (int i = 0; i < 26; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void task17(int n, int l, int m) {
        for (int i = n; i < l; i += m) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }

        }
    }

    public static void task18(int m, int n, int l) {
        for (int i = 0; i < l; i++) {
            System.out.print(((int) (Math.random() * m) + n) + " ");

        }
    }

    public static void task19() {

    }


    public static void main(String[] args) {

        task();
        task1();

        task();
        task2();

        task();
        task3();

        task();
        task4();

        task();
        task5();

        task();
        task6();

        task();
        task7();

        task();
        task8();

        task();
        task9();


        task();
        task10(10, 20, 3);

        task();
        task11('a', 'k');

        task();
        task12(15);

        task();
        task13(11);

        task();
        task14();

        task();
        task15();

        task();
        task16();

        task();
        task17(5, 40, 2);

        task();
        task18(15, 5, 20);


    }
}

