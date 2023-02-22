import java.util.Scanner;

public class Asal {
    private static boolean isPrime(int number, int i){
        if(i == 1){
            return true;
        }
        else{
            if(number % i == 0){
                return false;
            }
            else{
                return isPrime(number, i-1);
            }
        }
    }
    public static void show(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int number = sc.nextInt();

        if(isPrime(number, number / 2) == true){
            System.out.println(number + " is a prime number!");
        }
        else{
            System.out.println(number + " is not a prime number!");
        }
    }
}
