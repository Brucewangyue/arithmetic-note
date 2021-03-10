package rookie;

/**
 * 阶乘
 * <p>
 * 计算: 1!+2!+3!+....+n!
 */
public class C02_factorial {
    // A同学算法
    static void fA(int n) {
        int result = 0;
        for (int i = 1; i < n + 1; i++) {

            int factorial = 1;
            for (int j = 1; j <= i; j++) {
                factorial *= j;
            }

            result += factorial;
        }

        System.out.println(result);
    }

    // B同学算法
    static void fB(int n) {
        int result = 0;
        int factorial = 1;

        // 1 +
        // 1x2 +
        // 1x2x3 +
        // 1x2x3x4 +
        // 1x2x3x4x...x n +
        for (int i = 1; i <= n; i++) {
            factorial *= i;
            result += factorial;
        }

        System.out.println(result);
    }

    public static void main(String[] args) {
        fA(5);
        fB(5);
    }
}
