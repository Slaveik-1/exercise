import java.util.Scanner;

public class Main    {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int length = scanner.nextInt();
        int[] third = new int[length];
        System.out.println("Пожалуйста, введите элементы массива");
        for (int i = 0; i < length; i++) {
            third[i] = scanner.nextInt();
        }
        for (int required : third) {
            if (required % 3 == 0) {
                System.out.println("Элемента массива " + required + " Кратен 3");
            }
        }


    }
}
