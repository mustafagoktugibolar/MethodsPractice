import java.util.Scanner;

public class Fibonacci {
    private static int fib(int number) {
        if (number > 0) {
            if (number == 1 || number == 2) {
                return 1;
            }
            return fib(number - 1) + fib(number - 2);
        }
        else{
            return 0;
        }
    }

    public static void find(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the step : ");
        int step = sc.nextInt();

        System.out.println(fib(step));
    }
}
