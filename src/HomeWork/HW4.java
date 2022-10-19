package HomeWork;

public class HW4 {
    static int number = 1;

    public static void task() {
        System.out.println();
        System.out.println("TASK " + number);
        number++;
    }

    public static void verifyTest(int expectedResult, int actualResult) {
        if (expectedResult == actualResult) {
            System.out.println("\u001B[32m" + "Pass" + "\u001B[0m");
        } else {
            System.out.println("\u001B[31m" + "Fail" + "\u001B[0m");
        }
    }



    public static void task3() {
        System.out.println("(2 == 2) && (7 == 7)");
        System.out.println("!(15 < 3)");
        System.out.println("(Сосна == Дуб) && (Вишня == Клён)");
        System.out.println("!(Сосна == Дуб)");
        System.out.println("!(15 < 3)) && (10 > 20)");
        System.out.println("Глаза даны, чтобы видеть && Под третьим этажом находится второй этаж");
        System.out.println("(6/2 == 3) || (7*5 == 20)");
    }


    public static void task4() {
        System.out.println("Света < Андрея && Света < Наташи");
        System.out.println("полкa == учебники && стол == справочники");
        System.out.println("девочки > мальчики");
    }


    public static void task5() {
        int age = 16;

        if (age >= 16) {
            System.out.println("Водительские права можно получить");
        } else {
            System.out.println("Водительские права можно получить, только когда исполнится 16 лет");
        }
    }

    public static void task6() {
        String petia = "читает книгу";

        if (petia != "читает книгу") {
            System.out.println();
        }
    }


    public static void task7() {
        boolean friend = true;

        if (friend == true) {
            System.out.println("хорошо");
        } else {
            System.out.println("плохо");
        }
    }

    public static void task8() {
        int x = 10;

        if (x > 10) {
            System.out.println("x больше 10");
        } else if (x < 0) {
            System.out.println("x - отрицательное число");
        } else if ( x == 5) {
            System.out.println("Разность x и 5 равна " + (x - 5));
        } else {
            System.out.println("Число x меньше 11, больше или равно 0, но не равно 5");
        }
    }


    public static void task9() {
        int even9 = 11;

        if (even9 % 2 == 0) {
            System.out.println(even9 * 2);
        } else {
            System.out.println(even9 * even9);
        }
    }

    public static void task10() {
        int age10 = 20;

        if (age10 >= 18) {
            System.out.println("Голосовать можно с 18 лет");
        } if (age10 >= 16) {
            System.out.println("Машину можно водить с 16 лет\n");
        } if (age10 >= 5) {
            System.out.println("В школу можно идти с 5 лет\n");
        }
    }

    public static void task11() {
        int mark = 4;

        if (mark == 5) {
            System.out.println("выдать похвальную грамоту и перевести в следующий класс\n");
        } else if (mark == 4) {
            System.out.println("перевести в следующий класс");
        } else if (mark == 3) {
            System.out.println("дать задание на лето и перевести в следующий класс");
        } else {
            System.out.println("вызвать родителей и оставить в текущем классе на второй год");
        }
    }


    //----------------PART 2 ----------------------------------

    public static void task12() {
        double temperatureTselsii = 28.0;
        double fahrenheit = (temperatureTselsii * 9/5) + 32;
        System.out.println(temperatureTselsii + " °C = " +fahrenheit + " °F");
    }


    public static void task13() {
        int digit1 = 10;
        int digit2 = 10;

        if (digit1 % 3 == 0 && digit2 % 3 == 0) {
            System.out.println(digit1 + digit2);
        }
        if (digit1 % 5 == 0 && digit2 % 5 == 0) {
            System.out.println(digit1 - digit2);
        }

        if (digit1 < 0 || digit2 < 0) {
            System.out.println((digit1 * digit2) * -1);
        } else if (digit1 % 2 == 0 && digit2 % 2 == 0) {
            System.out.println(digit1 * digit2);
        } else {
            System.out.println("Error");
        }
    }

    public static void task14() {
        int k = 20;
        int l = 14;
        int m = 6;

        System.out.println("Результат деления k на l = " + (k / l) + ", а остаток от деления = " + (k % l));
        System.out.println("Результат деления k на m = " + (k / m) + ", а остаток от деления = " + (k % m));
        System.out.println("Результат деления l на m = " + (l / m) + ", а остаток от деления = " + (l % m));
        System.out.println("Результат деления k на l = " + (m / k) + ", а остаток от деления = " + (m % k));
    }


    //------------------------PART 3-----------------------------------

    public static int task15(int heads, int legs) {
        int containForTwoLegs = heads * 2;
        int legsLeft = legs - containForTwoLegs;
        int legsAddRabbits = legsLeft / 2;

        return heads - legsAddRabbits;
    }

//
//    public static double task16(int distance, double time) {
//
//    }














    public static void main(String[] args) {

        task();


        //TASK 3
        task();
        task3();


        //TASK 4
        task();
        task4();


        //TASK 5
        task();
        task5();


        //TASK 6
        task();
        task6();


        //TASK 7
        task();
        task7();

        //TASK 8
        task();
        task8();

        //TASK 9
        task();
        task9();


        //TASK 10
        task();
        task10();

        //TASK 11
        task();
        task11();

        //TASK 12
        task();
        task12();

        //TASK 13
        task();
        task13();

        //TASK 14
        task();
        task14();

        //TASK 15
        task();
        task15(25, 39);
        verifyTest(23, task15(35, 94));
    }
}
