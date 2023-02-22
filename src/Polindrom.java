
public class Polindrom {
    public static void find(int number){
        int temporary = number, reversedNum = 0, lastNumber;

        while(temporary != 0){
            lastNumber = temporary % 10;
            reversedNum = (reversedNum * 10) + lastNumber;
            temporary /= 10;

        }
        if(reversedNum == number){
            System.out.println("It's a Polindromic number");
        }
        else{
            System.out.println("It's not a Polindromic number!");
        }
    }
}
