import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        while (T-- > 0) {
            String s = sc.next();
            
            int[] freq = new int[26];
            
            // Count frequency
            for (char ch : s.toCharArray()) {
                freq[ch - 'a']++;
            }
            
            int count = 0;
            
            // Count pairs
            for (int i = 0; i < 26; i++) {
                count += freq[i] / 2;
            }
            
            System.out.println(count);
        }
        
        sc.close();
    }
}
