public class Main {
    public static void main(String[] args) {
        int account = 100;
        int add = 1100;
        int sum = account + add;
        int bonus = sum / 100;
        if (add < 1000) {
            bonus = 0;
        }
        System.out.println(bonus);
    }
}