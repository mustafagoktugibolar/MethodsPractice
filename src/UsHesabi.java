public class UsHesabi {
    public static int find(int a, int b){
        if(b == 0){
            return 1;
        }
        return a * find(a, b-1);
    }

    public static void show(int a, int b){
        System.out.println(find(a, b));
    }
}
