public class Primenotable {

    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: java Primenotable <num1> <num2> <num3>");
            return;
        }

        for (int i = 0; i < 3; i++) {
            int num;
            try {
                num = Integer.parseInt(args[i]);
            } catch (Exception e) {
                System.out.println("Invalid number: " + args[i] + " is not a valid integer.");
                continue;
            }

            if (isPrime(num)) {
                printTable(num);
            } else {
                System.out.printf("Number %d is not prime. Divided by 10 = %.2f%n", num, num / 10.0);
            }
        }
    }

    static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void printTable(int n) {
        System.out.println("Multiplication table for " + n + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d%n", n, i, n * i);
        }
    }
}
