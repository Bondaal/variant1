//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static int price;

    public static void main(String[] args) {
        int ticket = 13676;
        int bonusMiles = 20;

        int bonus;
        if (ticket > 20) {
            bonus = 1;
        } else {
            bonus = 0;
        }

        int balance = ticket / bonusMiles;

       
        System.out.println("Начисление мили:" + balance);

    }
}