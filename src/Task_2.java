
// Задача 2. Вывести все простые числа от 1 до 1000

import java.util.Scanner;

public class Task_2 {
    private static String s;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print(s);
        int top = scan.nextInt();
        for (int i = 2; i < top; i++) {
            if (checkSimple(i))
                System.out.println(i);
        }
    }

    public static boolean checkSimple(int i) {
        if (i <= 1)
            return false;
        else if (i <= 3)
            return true;
        else if (i % 2 == 0 || i % 3 == 0)
            return false;
        int n = 5;
        while (n * n <= i) {
            if (i % n == 0 || i % (n + 2) == 0)
                return false;
            n = n + 6;
        }
        return true;
    }

}
