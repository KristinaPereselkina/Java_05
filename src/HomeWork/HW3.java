package HomeWork;

public class HW3 {
    public static int num = 1;

    public static void line() {
        System.out.println();
        System.out.println();
    }

    //TASK
    public static void task() {
        System.out.println();
        String taskN = "TASK";
        System.out.println("--------------------------------------" + taskN + " " + num + "--------------------------------");
        System.out.println();
        num++;
    }


    public static void main(String[] args) {

        String line1 = "-----------------------------------------------------------------";
        String tab = "\t";
        String tab1 = "\t\t\t\t\t";
        String tab2 = "\t\t";
        String pipe = "|";
        task();


        //TASK 2
        task();

        Byte a = new Byte(Byte.MIN_VALUE);
        Byte b = new Byte(Byte.MAX_VALUE);

        System.out.println(a);
        System.out.println(b);
        line();


        //TASK 3
        task();

        short s = -32768;
        short t = 27232;

        System.out.println(s);
        System.out.println(t);
        line();


        //TASK 4
        task();

        int i = Integer.MIN_VALUE;

        System.out.println(line1);
        System.out.println(pipe + " int min" + tab1 + pipe + " " + i + tab1 + pipe);

        i = Integer.MAX_VALUE;
        System.out.println(line1);
        System.out.println(pipe + " int max" + tab1 + pipe + " " + i + tab1 + pipe);
        System.out.println(line1);
        line();


        //TASK 5
        task();

        long phoneNumber = 18009998877L;

        System.out.println(phoneNumber);
        line();


        //TASK 6
        task();

        float f = 100.101101F;
        double d = 100.101101;

        System.out.println(line1);
        System.out.println(pipe + " float f = 100.101101" + tab1 + pipe + f + tab1 + pipe);
        System.out.println(line1);
        System.out.println(pipe + " double d = 100.101101" + tab1 + pipe + d + tab1 + pipe);
        System.out.println(line1);
        line();


        //TASK 7
        task();

        Double dd = new Double(10.09999 + 20.099999);
        Float ff = new Float(10.09999F + 20.099999F);

        System.out.println(dd);
        System.out.println(ff);
        line();


        //TASK 8
        task();

         ff = Float.valueOf(10 / 3);
         dd = Double.valueOf(10 / 3);

        System.out.println(ff);
        System.out.println(ff);
        line();


        //TASK 9
        task();

        Float floatSum = new Float(f + ff);
        Float floatSub = new Float(f - ff);
        Float floatProduct = new Float(f * ff);
        Float floatQuotient = new Float(f / ff);
        Float floatRemainder = new Float(f % ff);

        System.out.println("floatSum = " + floatSum);
        System.out.println("floatSub = " + floatSub);
        System.out.println("floatProduct = " + floatProduct);
        System.out.println("floatQuotient = " + floatQuotient);
        System.out.println("floatRemainder = " + floatRemainder);
        line();


        //TASK 10
        task();

        Double doubleSum = new Double(d + dd);
        Double doubleSub = new Double(d - dd);
        Double doubleProduct = new Double(d * dd);
        Double doubleQuotient = new Double(d / dd);
        Double doubleRemainder = new Double(d % dd);

        System.out.println("doubleSum = " + doubleSum);
        System.out.println("doubleSub = " + doubleSub);
        System.out.println("doubleProduct = " + doubleProduct);
        System.out.println("doubleQuotient = " + doubleQuotient);
        System.out.println("doubleRemainder = " + doubleRemainder);
        line();



        //TASK 11
        task();

        System.out.println(line1 + "---------------------------------------------------------------------------");
        System.out.println(pipe + " f = " + f + tab1 + pipe + " ff = " + ff + tab1 + pipe + " d = " + d + tab1 + pipe + " dd = " + d + tab1 + tab + pipe);
        System.out.println(line1 + "---------------------------------------------------------------------------");
        System.out.println(pipe + " floatSum = " + floatSum + tab1 + tab1 + tab + pipe + "doubleSum = " + doubleSum + tab1 + tab1 + tab2 + tab2 + pipe);
        System.out.println(pipe + " floatSub = " + floatSub + tab1 + tab1 + tab + pipe + "doubleSub = " + doubleSub + tab1 + tab1 + tab2 + tab2 + pipe);
        System.out.println(pipe + " floatProduct = " + floatProduct + tab1 + tab1 + pipe + "doubleProduct = " + doubleProduct + tab1 + tab1 + tab2 + tab + pipe);
        System.out.println(pipe + " floatQuotient = " + floatQuotient + tab1 + tab1 + pipe + "doubleQuotient = " + doubleQuotient + tab1 + tab1 + pipe);
        System.out.println(pipe + " floatRemainder = " + floatRemainder  + tab1 + tab2 + tab2 + pipe + "doubleRemainder = " + doubleRemainder + tab1 + tab1 + pipe);
        System.out.println(line1 + "---------------------------------------------------------------------------");
        line();



        //TASK 12
        String h = "*";
        String spase = "  ";
        String oneSpace = " ";

        System.out.println(h + spase + spase + spase + oneSpace + h + spase + h + h + h + h);
        System.out.println(h + spase + spase + spase + oneSpace + h + spase + h);
        System.out.println(h + oneSpace + h + oneSpace + h + oneSpace + h + h + spase + h + h + h + h);
        System.out.println(h + spase + spase + spase + h + spase + h);
        System.out.println(h + spase + spase + spase + h + spase + h + h + h);



        //TASK 13

        Float fff = new Float(234.9999F);
        System.out.println(fff.intValue());




















    }
}
