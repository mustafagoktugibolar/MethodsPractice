public class Desen {
    private static void desen(int number) {
        System.out.print(number + " ");
        if (number <= 0) {
            return;
        }

        desen(number-5);
        System.out.print(number + " ");
    }


    public static void show(int number){
        desen(number);
    }
}
