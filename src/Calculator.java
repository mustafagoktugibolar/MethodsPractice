import java.util.Scanner;

public class Calculator {
    private static void plus() {
        Scanner scan = new Scanner(System.in);
        int number, result = 0, i = 1;
        while (true) {
            System.out.print(i++ + ". sayi :");
            number = scan.nextInt();
            if (number == 0) {
                break;
            }
            result += number;
        }
        System.out.println("Sonuc : " + result);
    }

    private static void minus() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kac adet sayi gireceksiniz :");
        int counter = scan.nextInt();
        int number, result = 0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayi :");
            number = scan.nextInt();
            if (i == 1) {
                result += number;
                continue;
            }
            result -= number;
        }

        System.out.println("Sonuc : " + result);
    }

    private static void times() {
        Scanner scan = new Scanner(System.in);
        int number, result = 1, i = 1;

        while (true) {
            System.out.print(i++ + ". sayi :");
            number = scan.nextInt();

            if (number == 1)
                break;

            if (number == 0) {
                result = 0;
                break;
            }
            result *= number;
        }

        System.out.println("Sonuc : " + result);
    }

    private static void divided() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kac adet sayi gireceksiniz :");
        int counter = scan.nextInt();
        double number, result = 0.0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayi :");
            number = scan.nextDouble();
            if (i != 1 && number == 0) {
                System.out.println("Boleni 0 giremezsiniz.");
                continue;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }

        System.out.println("Sonuc : " + result);
    }

    private static void power() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban degeri giriniz :");
        int base = scan.nextInt();
        System.out.print("Us degeri giriniz :");
        int exponent = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println("Sonuc : " + result);
    }

    private static void factorial() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayi giriniz :");
        int n = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println("Sonuc : " + result);
    }

    private static void mod(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scan.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scan.nextInt();

        int result = num1 % num2;
        System.out.println("Result: " + result);

    }

    private static void rectangular(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first edge: ");
        int edge1 = scan.nextInt();
        System.out.print("Enter the second edge: ");
        int edge2 = scan.nextInt();

        System.out.println("Rectangular area is: " + edge1*edge2);
        System.out.println("Rectangular perimeter is: " + 2*(edge1+edge2));

    }

    public static void use(){
        Scanner scan = new Scanner(System.in);
        int select;
        String menu = "1- Addition\n"
                + "2- Extraction\n"
                + "3- Multiplicaiton\n"
                + "4- Division\n"
                + "5- Exponential Calculation\n"
                + "6- Factorial Calculation\n"
                + "7- Taking the Mod\n"
                + "8- Rectangular Perimeter and Area Calculation\n"
                + "0- Exit";

        do {
            System.out.println(menu);
            System.out.print("Please select an operation :");
            select = scan.nextInt();
            switch (select) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    rectangular();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Entered a wrong value! Please try again.");
            }
        } while (select != 0);

    }


}
