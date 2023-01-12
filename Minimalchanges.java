package lesson.demo;

import java.util.*;

class Minimalchanges{
  

static int minOperations(String s)
{
    
    Integer freq[] = new Integer[26];
    Arrays.fill(freq, 0);
    int n = s.length();
  
   
    for (int i = 0; i < n; i++) {
        freq[s.charAt(i) - 'A']++;
    }
  
    
    Arrays.sort(freq, Collections.reverseOrder());
  
    
    int answer = n;
  
   
    for (int i = 1; i <= 26; i++) {
        if (n % i == 0) {
            int x = n / i;
            int y = 0;
            for (int j = 0; j < i; j++) {
                y += Math.min(freq[j], x);
            }
            answer = Math.min(answer, n - y);
        }
    }
    return answer;
}
  

public static void main(String[] args)
{
    String s = "BBBX";
    System.out.print("Minimal Changes:" + minOperations(s));
  
}
}