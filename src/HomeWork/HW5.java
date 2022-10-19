package HomeWork;

public class HW5 {
    static int number = 1;
    static int testCaseNum = 1;

    public static void task() {
        System.out.println();
        System.out.println("TASK " + number);
        number++;
    }

    public static void testCaseNumber() {
        System.out.print("TC " + testCaseNum++ + "\t--\t");
    }

    public static void printTestResult(String value) {
        System.out.println(value);
    }


    //TASK 1
    public static String verifyEquals(int expectedResult, int actualResult) {
        if (expectedResult == actualResult) {

            return ("\u001B[32m" + "Pass" + "\u001B[0m");
        }

        return ("\u001B[31m" + "Fail" + "\u001B[0m");
    }

    public static String verifyEquals(double expectedResult, double actualResult) {
        if (expectedResult == actualResult) {

            return ("\u001B[32m" + "Pass" + "\u001B[0m");
        }

        return ("\u001B[31m" + "Fail" + "\u001B[0m");
    }

    public static String verifyEquals(String expectedResult, String actualResult) {
        if (expectedResult.equals(actualResult)) {

            return "\u001B[32m" + "Pass" + "\u001B[0m";
        }

        return "\u001B[31m" + "Fail" + "\u001B[0m";
    }


    //TASK 2
    /*Написать метод, который принимает на вход число
     от 1 до 7  и возвращает день недели. Протестировать метод*/

    public static String weekDay(int dayNumber) {
        if (dayNumber > 1 && dayNumber < 8) {
            if (dayNumber == 1) {
                return "Monday";
            }
            if (dayNumber == 2) {
                return "Tuesday";
            }
            if (dayNumber == 3) {
                return "Wednesday";
            }
            if (dayNumber == 4) {
                return "Thursday";
            }
            if (dayNumber == 5) {
                return "Friday";
            }
            if (dayNumber == 6) {
                return "Saturday";
            }
            if (dayNumber == 7) {
                return "Sunday";
            }
        }
        return "There is no such day";
    }


    public static int averageAge(int age1, int age2, int age3) {
        if ((age1 >= 0 && age1 <= 150) && (age2 >= 0 && age2 <= 150) && (age3 >= 0 && age3 <= 150)) {

            return (age1 + age2 + age3) / 3;
        }

        return 0;
    }


    //TASK 4
    public static int findMinBeetwenTwo(int k, int l) {
        if (k <= l) {

            return k;
        }

        return l;
    }

    public static int findMinBeetwenThree(int k, int l, int m) {

        return Math.min(k, Math.min(l, m));
    }

    public static int findMinBeetwenFour(int k, int l, int m, int n) {

        return Math.min(k, Math.min(l, Math.min(m, n)));
    }


    //TASK 5--------------------------------------------

    public static int avgCatTemperature(int t1, int t2, int t3, int t4, int t5) {
        if ((t1 >= 25 && t1 <= 45) && (t2 >= 25 && t2 <= 45) && (t3 >= 25 && t3 <= 45) && (t4 >= 25 && t4 <= 45) && (t5 >= 25 && t5 <= 45)) {

            return (int) (t1 + t2 + t3 + t4 + t5) / 5;
        }

        return -1;
    }

    //TASK 6--------------------------------------------
    public static int monthSalary(int hourWork, double salaryCost) {
        if (salaryCost >= 12) {
            double daySalary = hourWork * salaryCost;
            int salaryMonth = (int) daySalary * 20;

            return salaryMonth;
        }

        return -1;
    }


    //TASK 7--------------------------------------------
    public static String sumPurchase(double price, int amount) {
        if (amount > 0) {
            double sum = price * amount;
            int separateRoundPrice = (int) sum;
            return "" + separateRoundPrice + " uah " + Math.round((sum - separateRoundPrice) * 100) + " kop";
        }

        return "-1";
    }


    //TASK 8 --------------------------------------------
    public static String salaryAct(String lastName, String firstName, double salary) {
        if (firstName == null || lastName == null || salary == 0) {
            return "";
        } else {
            int salaryRound = (int) salary;
            long changeSalary = Math.round((salary - salaryRound) * 100);
            if (changeSalary < 10) {
                return lastName + " " + firstName + "\t\t" + salaryRound + " uah " + "0" + changeSalary + " kop";
            }
            return lastName + " " + firstName + "\t\t" + salaryRound + " uah " + changeSalary + " kop";
        }
    }


    //TASK 9----------------------------------------

    public static String salaryTwoAct(String print) {
       return print;
    }


    //TASK 10 ---------------------------------------------------------
     public static String testX(int x) {
        if (x < 0) {
            return "x is negative";
        } else {
            if (x > 0) {
                return "x is positive";
            } else {
                return "x is Zero";
            }
        }
     }



     //-------------------------- PART 2 -------------------------------------------

    //TASK 11
    public static String decimal(double decimalDigit) {
        int roundDecimal = (int) decimalDigit;
        long changeFromDecimal = Math.round((decimalDigit - roundDecimal) * 100);
        if (changeFromDecimal < 10) {

            return "" + roundDecimal + " uah " + "0" + changeFromDecimal + " kop";
        }

        return "" + roundDecimal + " uah " + changeFromDecimal + " kop";
    }


    //TASK 12
    public static String splitDecimal(double decimal) {
        int roundDecimal = (int) decimal;
        long changeFromDecimal = Math.round((decimal - roundDecimal));
        if (changeFromDecimal < 10) {

            return "" + roundDecimal + " kg " + "0" + changeFromDecimal + " g";
        }

        return "" + roundDecimal + " kg " + changeFromDecimal + " g";
    }










    public static void main(String[] args) {

        task();
        System.out.println("Add verifyEquals");

        //TASK 2 --------------------------------------------------------------------
        task();

        //TC2_1
        String expectedResultTC2_1 = "Friday";
        String actualResultTC2_1 = weekDay(5);

        verifyEquals(expectedResultTC2_1, actualResultTC2_1);

        testCaseNumber();
        printTestResult(verifyEquals(expectedResultTC2_1, actualResultTC2_1));

        //TC2_2
        String expectedResultTC2_2 = "There is no such day";
        String actualResultTC2_2 = weekDay(0);

        verifyEquals(expectedResultTC2_2, actualResultTC2_2);

        testCaseNumber();
        printTestResult(verifyEquals(expectedResultTC2_2, actualResultTC2_2));


        //TASK 3 --------------------------------------------------------------------
        task();

        //TC3_1
        int expectedResultTC3_1 = 40;
        int actualResultTC3_1 = averageAge(40, 20, 60);

        verifyEquals(expectedResultTC3_1, actualResultTC3_1);

        testCaseNumber();
        printTestResult(verifyEquals(expectedResultTC3_1, actualResultTC3_1));

        //TC3_2
        int expectedResultTC3_2 = 0;
        int actualResultTC3_2 = averageAge(0, -1, 151);

        verifyEquals(expectedResultTC3_2, actualResultTC3_2);

        testCaseNumber();
        printTestResult(verifyEquals(expectedResultTC3_2, actualResultTC3_2));


        //TC Negative
        int expectedResultTC3_3 = 0;
        int actualResultTC3_3 = averageAge(0, 20, 80);

        verifyEquals(expectedResultTC3_3, actualResultTC3_3);

        testCaseNumber();
        printTestResult(verifyEquals(expectedResultTC3_3, expectedResultTC3_3));

        //TC_6 Negative
        int expectedResultTC3_4 = 0;
        int actualResultTC3_4 = averageAge(1, -5, 68);

        verifyEquals(expectedResultTC3_4, actualResultTC3_4);

        testCaseNumber();
        printTestResult(verifyEquals(expectedResultTC3_4, actualResultTC3_4));


        //TASK 4 --------------------------------------------------------------------
        task();

        //TC_7
        int expectedResultTC4_1 = 3;
        int actualResultTC4_1 = findMinBeetwenTwo(3, 30);

        verifyEquals(expectedResultTC4_1, actualResultTC4_1);

        testCaseNumber();
        printTestResult(verifyEquals(expectedResultTC4_1, actualResultTC4_1));

        //TC_8
        int expectedResultTC4_2 = 0;
        int actualResultTC4_2 = findMinBeetwenTwo(0, 0);

        verifyEquals(expectedResultTC4_2, actualResultTC4_2);

        testCaseNumber();
        printTestResult(verifyEquals(expectedResultTC4_2, actualResultTC4_2));


        //TC_9
        int expectedResultTC4_3 = -1;
        int actualResultTC4_3 = findMinBeetwenThree(5, 20, -1);

        verifyEquals(expectedResultTC4_3, actualResultTC4_3);

        testCaseNumber();
        printTestResult(verifyEquals(expectedResultTC4_3, actualResultTC4_3));

        //TC_10
        int expectedResultTC4_4 = -5;
        int actualResultTC4_4 = findMinBeetwenThree(1, -5, 0);

        verifyEquals(expectedResultTC4_4, actualResultTC4_4);

        testCaseNumber();
        printTestResult(verifyEquals(expectedResultTC4_4, actualResultTC4_4));

        //TC_11
        int expectedResultTC4_5 = 3;
        int actualResultTC4_5 = findMinBeetwenFour(3, 30, 300, 3000);

        verifyEquals(expectedResultTC4_5, actualResultTC4_5);

        testCaseNumber();
        printTestResult(verifyEquals(expectedResultTC4_5, actualResultTC4_5));

        //TC_12
        int expectedResultTC4_6 = 5;
        int actualResultTC4_6 = findMinBeetwenFour(5, 5, 5, 5);

        verifyEquals(expectedResultTC4_6, actualResultTC4_6);

        testCaseNumber();
        printTestResult(verifyEquals(expectedResultTC4_6, actualResultTC4_6));


        //TASK 5 ------------------------------------------------------------
        task();

        //TC_13
        int expectedResultTC5_1 = 33;
        int actualResultTC5_1 = avgCatTemperature(25, 30, 45, 29, 40);

        verifyEquals(expectedResultTC5_1, actualResultTC5_1);

        testCaseNumber();
        printTestResult(verifyEquals(expectedResultTC5_1, actualResultTC5_1));


        //TC_14
        int expectedResultTC5_2 = -1;
        int actualResultTC5_2 = avgCatTemperature(25, 46, 45, 29, 40);

        verifyEquals(expectedResultTC5_2, actualResultTC5_2);

        testCaseNumber();
        printTestResult(verifyEquals(expectedResultTC5_2, actualResultTC5_2));

        //TC_15
        int expectedResultTC5_3 = 26;
        int actualResultTC5_3 = avgCatTemperature(26, 26, 26, 26, 26);

        verifyEquals(expectedResultTC5_3, actualResultTC5_3);

        testCaseNumber();
        printTestResult(verifyEquals(expectedResultTC5_3, actualResultTC5_3));


//TASK 6 ------------------------------------------------------------
        task();

        //TC_16
        int expectedResultTC6_1 = 1920;
        int actualResultTC6_1 = monthSalary(8, 12);

        verifyEquals(expectedResultTC6_1, actualResultTC6_1);

        testCaseNumber();
        printTestResult(verifyEquals(expectedResultTC6_1, actualResultTC6_1));


        //TC_17
        int expectedResultTC6_2 = -1;
        int actualResultTC6_2 = monthSalary(7, 11);

        verifyEquals(expectedResultTC6_2, actualResultTC6_2);

        testCaseNumber();
        printTestResult(verifyEquals(expectedResultTC6_2, actualResultTC6_2));


        // TASK 7-----------------------------------------------------------
        task();

        String expectedResultTC7_1 = "127 uah 50 kop";
        String actualResultTC7_1 = sumPurchase(25.5, 5);

        verifyEquals(expectedResultTC7_1, actualResultTC7_1);

        testCaseNumber();
        printTestResult(verifyEquals(expectedResultTC7_1, actualResultTC7_1));


        String expectedResultTC7_2 = "-1";
        String actualResultTC7_2 = sumPurchase(25.5, -1);

        verifyEquals(expectedResultTC7_2, actualResultTC7_2);

        testCaseNumber();
        printTestResult(verifyEquals(expectedResultTC7_2, actualResultTC7_2));


        String expectedResultTC7_3 = "-1";
        String actualResultTC7_3 = sumPurchase(0.01, 0);

        verifyEquals(expectedResultTC7_3, actualResultTC7_3);

        testCaseNumber();
        printTestResult(verifyEquals(expectedResultTC7_3, actualResultTC7_3));


        String expectedResultTC7_4 = "0 uah 6 kop";
        String actualResultTC7_4 = sumPurchase(0.01, 6);

        verifyEquals(expectedResultTC7_4, actualResultTC7_4);

        testCaseNumber();
        printTestResult(verifyEquals(expectedResultTC7_4, actualResultTC7_4));




        //TASK 8 ------------------------------------------------
        task();

        String expectedResultTC8_1 = "Смирнова Мария Ивановна\t\t70000 uah 55 kop";
        String actualResultTC8_1 = salaryAct("Смирнова", "Мария Ивановна", 70000.55);

        verifyEquals(expectedResultTC8_1, actualResultTC8_1);

        testCaseNumber();
        printTestResult(verifyEquals(expectedResultTC8_1, actualResultTC8_1));

        //TC8_2
        String expectedResultTC8_2 = "Смирнова Мария Ивановна\t\t120000 uah 00 kop";
        String actualResultTC8_2 = salaryAct("Смирнова", "Мария Ивановна", 120000);

        verifyEquals(expectedResultTC8_2, actualResultTC8_2);

        testCaseNumber();
        printTestResult(verifyEquals(expectedResultTC8_2, actualResultTC8_2));


        //TC8_3
        String expectedResultTC8_3 = "";
        String actualResultTC8_3 = salaryAct(null, "Мария Ивановна", 120000);

        verifyEquals(expectedResultTC8_3, actualResultTC8_3);

        testCaseNumber();
        printTestResult(verifyEquals(expectedResultTC8_3, actualResultTC8_3));


        //TC8_4
        String expectedResultTC8_4 = "";
        String actualResultTC8_4 = salaryAct("Смирнова", "Мария Ивановна", 0);

        verifyEquals(expectedResultTC8_3, actualResultTC8_3);

        testCaseNumber();
        printTestResult(verifyEquals(expectedResultTC8_3, actualResultTC8_3));


        //TASK 9 -------------------------------------------
        task();

        System.out.println(salaryTwoAct(salaryAct("Смирнова", "Мария Ивановна", 70000)));
        System.out.println(salaryTwoAct(salaryAct("Серебров", "Иван Петрович", 128059)));



        //TASK 10 -----------------------------------------------------------
        task();

        String expectedResultTC10_1 = "x is negative";
        String actualResultTC10_1 = testX(-1);

        verifyEquals(expectedResultTC10_1, actualResultTC10_1);

        testCaseNumber();
        printTestResult(verifyEquals(expectedResultTC10_1, actualResultTC10_1));

        //test
        String expectedResultTC10_2 = "x is positive";
        String actualResultTC10_2 = testX(1);

        verifyEquals(expectedResultTC10_2, actualResultTC10_2);

        testCaseNumber();
        printTestResult(verifyEquals(expectedResultTC10_2, actualResultTC10_2));

        //test
        String expectedResultTC10_3 = "x is Zero";
        String actualResultTC10_3 = testX(0);

        verifyEquals(expectedResultTC10_3, actualResultTC10_3);

        testCaseNumber();
        printTestResult(verifyEquals(expectedResultTC10_3, actualResultTC10_3));




        //TASK 11
        task();

        //test
        String expectedResultTC11_1 = "10 uah 75 kop";
        String actualResultTC11_1 = decimal(10.75);

        verifyEquals(expectedResultTC11_1, actualResultTC11_1);

        testCaseNumber();
        printTestResult(verifyEquals(expectedResultTC11_1, actualResultTC11_1));

        //test
        String expectedResultTC11_2 = "5 uah 00 kop";
        String actualResultTC11_2 = decimal(5);

        verifyEquals(expectedResultTC11_2, actualResultTC11_2);

        testCaseNumber();
        printTestResult(verifyEquals(expectedResultTC11_2, actualResultTC11_2));



        //TASK 11
        task();

        //test
        String expectedResultTC12_1 = "10 kg 75 g";
        String actualResultTC12_1 = decimal(10.075);

        verifyEquals(expectedResultTC12_1, actualResultTC12_1);

        testCaseNumber();
        printTestResult(verifyEquals(expectedResultTC12_1, actualResultTC12_1));

        System.out.println(actualResultTC12_1);
    }
}
