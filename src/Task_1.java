import java.io.IOException;
import java.util.Scanner;

// Задача 1. Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

public class Task_1 {
    public static void triangular(int start, int n) {
        if (start > n) return;
        int triangular = (start * (start + 1)) / 2;
        System.out.println(triangular);
        triangular(start + 1, n);
    }


    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число (больше или равную 1): ");
        int n = in.nextInt();
        triangular(1, n);
    }
}