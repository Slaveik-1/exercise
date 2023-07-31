import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        System.out.println("Введите число:");
        int number = Scan.nextInt();
        if (number>7) {
            System.out.println("Привет");
        } else
            System.out.println("Не подходит!");


    }
}