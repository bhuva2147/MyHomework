package javahomeworkpakage;

public class DoWhileLoopClass1 {
    public static void main(String[] args) {
        int count = 1;
        System.out.println("10 even numbers and 10 odd numbers:");

        do {
            if (count % 2 == 0) {
                System.out.println("Even: " + count);
            } else {
                System.out.println("Odd: " + count);
            }
            count++;
        } while (count <= 10);
    }
}

