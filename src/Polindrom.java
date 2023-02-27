
public class Polindrom {
    public static void find(int number){
        int temporary = number, reversedNum = 0, lastNumber;

        while(temporary != 0){
            lastNumber = temporary % 10;
            reversedNum = (reversedNum * 10) + lastNumber;
            temporary /= 10;

        }
        if(reversedNum == number){
            System.out.println(number + "is a Polindromic number");
        }
        else{
            System.out.println(number + "is not a Polindromic number!");
        }
    }

    public static void findText(String text){
        String reverse = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            reverse += text.charAt(i);
        }

        if (text.equals(reverse))
            System.out.println("True");
        else
            System.out.println("False");
    }
}
