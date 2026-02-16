    import java.util.*;
     
    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
     
            int N = sc.nextInt();
            long[] A = new long[N];
     
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextLong();
            }
     
            HashMap<Long, Long> map = new HashMap<>();
     
            for (int i = 0; i < N; i++) {
                long key = A[i] - (i + 1);
                map.put(key, map.getOrDefault(key, 0L) + 1);
            }
     
            long result = 0;
     
            for (long freq : map.values()) {
                result += freq * (freq - 1); 
            }
     
            System.out.println(result);
     
            sc.close();
        }
    }
