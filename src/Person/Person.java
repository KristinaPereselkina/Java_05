package Person;

public class Person {
    public static void main(String[] args) {
        int yob = 1990;

        System.out.println("Если человек родился в " + yob +
                " году, то его возраст - разница между 2022 и " + yob);

        yob = 2000;

        System.out.println("Если человек родился в " + yob + " году," +
                " то его возраст 2 года назад - разница между 2022 и " + yob);

    }
}
