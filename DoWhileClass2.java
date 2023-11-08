package javahomeworkpakage;

public class DoWhileClass2 {
    public static void main(String[] args) {
        int number = 18;
        int multiplier = 1;

        System.out.println("Multiplication Table of 18:");

        do {
            int result = number * multiplier;
            System.out.println(number + " x " + multiplier + " = " + result);
            multiplier++;
        } while (multiplier <= 10);
    }
}

