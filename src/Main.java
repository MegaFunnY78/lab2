import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введи начальное число: ");
        int x = scanner.nextInt();
        System.out.print("Введи конечное число: ");
        int y = scanner.nextInt();

        // Списки для четных и нечетных чисел
        List<Integer> num1 = new ArrayList<>();
        List<Integer> num2 = new ArrayList<>();

        for (int i = x; i <= y; i++) {
            if (i % 2 == 0) {
                num1.add(i);
            } else {
                num2.add(i);
            }
        }

        // Преобразуем списки в массивы
        Integer[] startArray = num1.toArray(new Integer[0]);
        Integer[] endArray = num2.toArray(new Integer[0]);

        // Вывод четных чисел с помощью foreach
        System.out.println("Чётные числа от " + x + " до " + y + ":");
        for (int num : startArray) {
            System.out.print(num + " ");
        }

        System.out.println();

        // Вывод нечетных чисел с помощью foreach
        System.out.println("Нечетные числа от " + x + " до " + y + ":");
        for (int num : endArray) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}