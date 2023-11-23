import java.util.LinkedList;
import java.util.Queue;

public class prcfirstrepeating {
    public static void repeating(String str){
        int freq[]=new int[26];
        Queue<Character> q = new LinkedList<>();
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            freq[ch-'a']++;
            q.add(ch);
        }

    }
}
