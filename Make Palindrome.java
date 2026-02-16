import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        while (T-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            
            int[] freq = new int[26];
            
            for (char ch : s.toCharArray()) {
                freq[ch - 'a']++;
            }
            
            int oddCount = 0;
            
            for (int i = 0; i < 26; i++) {
                if (freq[i] % 2 != 0) {
                    oddCount++;
                }
            }
            
            int cost = Math.max(0, oddCount - 1);
            System.out.println(cost);
        }
        
        sc.close();
    }
}
