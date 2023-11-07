import java.util.Scanner;
public class task_04 {
    public static void main(String[] args) {
        System.out.println("Задание: #4");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число N: ");
        int N = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int i = scanner.nextInt();

        int mask = 1 << i; // создаем маску для инвертирования i-го бита
        N ^= mask; // инвертируем i-й бит

        System.out.println("Результат в <<Двоичном виде>>: " + Integer.toBinaryString(N) ); // выводим результат в двоичном виде
    }
}
