import java.util.Scanner;

public class task_07 {
    public static void main(String[] args) {
        System.out.println("Задание: #7");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число N: ");
        int N = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int i = scanner.nextInt();

        int mask = 1 << i; // создаем маску для получения i-го бита
        int bit = (N & mask)!= 0? 1 : 0; // получаем значение i-го бита

        System.out.println("Результат в <<Двоичном виде>>: " + Integer.toBinaryString(bit)); // выводим результат в двоичном виде
    }
}
