package LAB2;

import java.util.Scanner;

public class BasiclnputData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();

        System.out.print("The number is"+num);
    }
}
