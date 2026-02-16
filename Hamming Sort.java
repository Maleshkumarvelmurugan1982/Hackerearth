import java.util.*;

public class Main {

    static class Pair {
        int value;
        int distance;

        Pair(int value, int distance) {
            this.value = value;
            this.distance = distance;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();
            int K = sc.nextInt();

            Pair[] arr = new Pair[N];

            for (int i = 0; i < N; i++) {
                int num = sc.nextInt();
                int dist = Integer.bitCount(num ^ K);
                arr[i] = new Pair(num, dist);
            }

            Arrays.sort(arr, (a, b) -> {
                if (a.distance == b.distance) {
                    return a.value - b.value;
                }
                return a.distance - b.distance;
            });

            for (Pair p : arr) {
                System.out.print(p.value + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
