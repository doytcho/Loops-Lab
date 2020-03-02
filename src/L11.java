import java.util.Scanner;

public class L11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int years = Integer.parseInt(scan.nextLine());
        double price = Double.parseDouble(scan.nextLine());
        int toyPrice = Integer.parseInt(scan.nextLine());
        int sum = 0;
        int money = 10;
        int toysCount = 0;
        for (int i = 1; i <= years; i++) {
            if (i % 2 == 0) {
                sum = sum + money - 1;
                money += 10;
            } else {
                toysCount++;
            }
        }
        int totalMoney = sum + toyPrice * toysCount;
        if (totalMoney >= price) {
            System.out.printf("Yes! %.2f", totalMoney - price);
        } else {
            System.out.printf("No! %.2f", price - totalMoney);
        }
    }
}
