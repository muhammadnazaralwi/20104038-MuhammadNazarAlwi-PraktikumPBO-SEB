package modul2.tugas;

import java.util.Scanner;

public class ArithmeticOperations {
    public void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCaseCount;
        int[] a, b, c, result;

        testCaseCount = scanner.nextInt();
        a = new int[testCaseCount];
        b = new int[testCaseCount];
        c = new int[testCaseCount];
        result = new int[testCaseCount];

        for (int i = 0; i < testCaseCount; i++) {
            a[i] = scanner.nextInt();
            b[i] = scanner.nextInt();
            c[i] = scanner.nextInt();
            result[i] = a[i] + b[i] - c[i];
        }

        for (int i = 0; i < testCaseCount; i++) {
            System.out.println(result[i]);
        }
    }
}
