import java.util.Scanner;

public class L10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int sumOdd = 0;
        int sumEven = 0;
        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scan.nextLine());
            if (i % 2 == 0) {
                sumOdd += number;

            } else {
                sumEven += number;
            }
        }
        if (sumEven == sumOdd) {
            System.out.println("Yes");
            System.out.printf("Sum = %d", sumEven);
        } else {
            System.out.println("No");
            System.out.printf("Diff = %d", Math.abs(sumEven - sumOdd));
        }
    }
}
