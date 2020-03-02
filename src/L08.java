import java.util.Scanner;

public class L08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int maxNumber = Integer.MIN_VALUE;
        int minNumber = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scan.nextLine());
            if (number < minNumber) {
                minNumber = number;
            }
            if (number > maxNumber) {
                maxNumber = number;
            }
        }
        System.out.printf("Max number: %d%n", maxNumber);
        System.out.printf("Min number: %d", minNumber);
    }
}
