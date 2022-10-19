package HomeWork;

import java.util.Arrays;

public class HW7 {
    static int number = 1;

    public static void task() {
        System.out.println();
        System.out.println("TASK " + number);
        number++;
    }

    public static int[] task21(int l) {
        int[] arr = new int[l];
        for (int i = 0; i < l;) {
            int num = (int) (Math.random() * 7);
            if (num % 2 == 0) {
                arr[i] = num;
                i++;
            }
        }

        return arr;
    }


    //TASK 22
    public static int task22(int[] arr) {
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            counter += arr[i];
        }
        int avg = counter / arr.length;
        return avg;
    }

    //TASK 23
    public static int[] task23() {
        int count23 = 0;
        for (int i = -1000; i < -900; i++) {
            if (i % 2 != 0) {
                count23++;
            }
        }
        int[] arr = new int[count23];
        int odd = 0;
            for (int i = -1000; i < -900; i++) {
                if (i % 2 != 0) {
                    arr[odd++] = i;
                }
            }

        return arr;
    }


    //TASK 24
    public static int[] task24() {
        int[] arr24 = new int[10];
        for (int i = 0; i < arr24.length; i++) {
            arr24[i] = (int) ((Math.random() * 101) + 100);
        }
        return arr24;
    }


    //TASK 25
    public static void task25(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                System.out.println("yes");
            }
            if (array[i] == number + 1 || array[i] == number - 1) {
                System.out.println("maybe");
            }
            if ((array[i] != number) && (array[i] != number + 1) && (array[i] != number - 1)) {
                System.out.println("no");
            }
        }
    }


    //TASK 26
    public static void task26(int[] array) {
        int countEven = 0;
        int countOdd = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
        }

        int[] evenArr = new int[countEven];
        int[] oddArr = new int[countOdd];
        int evenNum = 0;
        int oddNum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evenArr[evenNum++] = array[i];
            } else {
                oddArr[oddNum++] = array[i];
            }
        }
        System.out.println(Arrays.toString(evenArr));
        System.out.println(Arrays.toString(oddArr));
    }

    public static int[][] task28() {
        int[][] arr28 = new int[4][8];
        for (int i = 0; i < arr28.length; i++) {
            for (int j = 0; j < arr28[i].length; j++) {
                arr28[i][j] = (int) (Math.random() * 11);
            }
        }
        return arr28;
    }

    //TASK 29
    public static int task29(int[][] array29) {
        System.out.println(Arrays.deepToString(array29));
        int count = 0;
        for (int i = 0; i < array29.length; i++) {
            for (int j = 0; j < array29[i].length; j++) {
                if (array29[i][j] % 2 == 0) {
                    count+= array29[i][j];
                }
            }
        }
        return count;
    }


    public static void main(String[] args) {
        task();
        task();


        //TASK 3
        task();
        String[] catsNames = {"Васька", "Лари", "Кокос", "Мурзик", "Мурка", "Дымка", "Рыжик", "Том"};

        //TASK 4
        task();
        catsNames[4] = "Рыжик";
        System.out.println(catsNames[4]);
        catsNames[1] = "Черныш";
        System.out.println(catsNames[1]);


        //tASK 5
        task();
        String[] catsColors = {"Серый", "Черный", "Серый", "Коричневый", "Рыжий", "Серый", "Рыжий", "Серый"};

        //TASK 6
        task();
        int[] catsAges = {2, 4, 1, 6, 5, 3, 8, 7};

        //TASK 7
        task();
        boolean[] isCatRed = {false, false, false, false, true, false, true, false};

        //TASK 8
        task();

        //1
        System.out.println(catsNames[5]);
        System.out.println();

        //2
        for (int i = 0; i < catsNames.length; i++) {
            if (i % 2 == 0) {
                System.out.println(catsNames[i] + " ");
            }
        }
        System.out.println();

        //3
        for (int i = 0; i < catsNames.length; i++) {
            if (i % 4 == 0) {
                System.out.println(catsNames[i] + " ");
            }
        }
        System.out.println();
        //4
        for (int i = 0; i < catsColors.length; i++) {
            if (i % 2 != 0) {
                System.out.println(catsColors[i] + " ");
            }
        }
        System.out.println();

        //5
        for (int i = 0; i < catsColors.length; i++) {
            if (i % 3 == 0 && i % 2 != 0) {
                System.out.println(catsColors[i] + " ");
            }
        }
        System.out.println();


        //TASK 9
        task();
        for (int i = 0; i < catsColors.length; i++) {
            if (catsColors[i].equals("Серый")) {
                System.out.println("Накорми кота!");
            }
        }


        //TASK 10
        task();
        for (int i = 0; i < isCatRed.length; i++) {
            if (isCatRed[i] == true) {
                System.out.println("Дай коту воды!");
            }
        }

        //TASK 11
        task();
        for (int i = 0; i < catsAges.length; i++) {
            if (catsAges[i] < 2) {
                System.out.println("Отнеси кота на прививку!");
            }
        }

        //TASK 12
        task();
        System.out.println(catsNames[catsNames.length - 1]);
        System.out.println(catsColors[catsColors.length - 1]);
        System.out.println(catsAges[catsAges.length - 1]);


        //TASK 13
        task();


        //TASK 14
        task();
        if (catsAges.length == catsNames.length) {
            for (int i = 0; i < catsAges.length; i++) {
                if (catsAges[i] > 2) {
                    System.out.println(catsNames[i]);
                }
            }
        }


        //TASK 15
        task();
        if (isCatRed.length == catsNames.length) {
            for (int i = 0; i < isCatRed.length; i++) {
                if (isCatRed[i] == true) {
                    System.out.println("Накорми " + catsNames[i] + "a!");
                }
            }
        }

        //TASK 16
        task();
        int count = 0;
        for (int i = 0; i < catsAges.length; i++) {
            count += catsAges[i];
        }
        int avg = count / catsAges.length;
        System.out.println(avg);


        //TASK 17
        task();
        int minAge = Integer.MAX_VALUE;
        for (int i = 0; i < catsAges.length; i++) {
            if (catsAges[i] < minAge) {
                minAge = catsAges[i];
            }
        }
        System.out.println(minAge);


        //TASK 18
        task();
        int maxAge = Integer.MIN_VALUE;
        for (int i = 0; i < catsAges.length; i++) {
            if (catsAges[i] > maxAge) {
                maxAge = catsAges[i];
            }
        }
        System.out.println(maxAge);


        //TASK 19
        task();
        int countGrey = 0;
        int countRed = 0;
        for (int i = 0; i < catsColors.length; i++) {
            if (catsColors[i].equals("Серый")) {
                countGrey++;
            } else if (catsColors[i].equals("Рыжий")) {
                countRed++;
            }
        }
        System.out.println(countGrey);
        System.out.println(countRed);


        //TASK 20
        task();
        if (catsNames.length == catsAges.length) {
            for (int i = 0; i < catsNames.length; i++) {
                if ((i % 2 != 0) && (catsAges[i] < 2)) {
                    System.out.println(catsNames[i]);
                }
            }
        }

        //TASK 21
        task();
        System.out.println(Arrays.toString(task21(10)));


        //TASK 22
        task();
        System.out.println(task22(catsAges));


        //TASK 23
        task();
        System.out.println(Arrays.toString( task23()));


        //TASK 24
        task();
        System.out.println(Arrays.toString(task24()));


        //TASK 25
        task();
        int[] num = {1, 2, 1, 4, 7, 10};
        task25(catsAges, 1);


        //TASK 26
        task();
        task26(task24());


        //TASK 27
        task();
        String[][] cats = new String[3][];

        cats[0] = catsNames;
       // cats[1] = String.valueOf(catsAges);
        cats[2] = catsColors;


        //TASK 28
       task();
        System.out.println(Arrays.deepToString(task28()));


        //TASK 29
        task();
        System.out.println(task29(task28()));












    }
}