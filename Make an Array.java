import java.io.*;
import java.util.*;

public class Main {

    public static void solve(Scanner sc) {
        int N = sc.nextInt();
        long[] A = new long[N];
        long sum = 0;

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextLong();
            sum += A[i];
        }

        // Special case: N = 1
        if (N == 1) {
            if (A[0] == 0) {
                System.out.println(0);
            } else {
                System.out.println(-1);
            }
            return;
        }

        // Check divisibility
        if (sum % (N - 1) != 0) {
            System.out.println(-1);
            return;
        }

        long k = sum / (N - 1);

        // Check feasibility
        for (int i = 0; i < N; i++) {
            if (A[i] > k) {
                System.out.println(-1);
                return;
            }
        }

        System.out.println(k);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            solve(sc);
        }

        sc.close();
    }
}
