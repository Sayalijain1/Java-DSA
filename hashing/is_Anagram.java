import java.util.HashMap;

public class is_Anagram {
    public static boolean isAnagram(String s,String t){
        if (s.length()!=t.length()) {
            return false;
        }
        HashMap<Character,Integer> map = new HashMap<>();
        //inserting keys from s into map
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        for (int i = 0; i < t.length(); i++)
         {
            char ch = t.charAt(i);
            if (map.get(ch)!=null) {//agar map me given character hai to
                if (map.get(ch)==1) {//if given character ki freq 1 hai to remove  kardo
                    map.remove(ch);
                }else{//agar freq 1 se jyada hai to reduce kardo 1 se
                    map.put(ch, map.get(ch)-1); //map.get(ch) matlab ch is stored frequency ,value for key ch
                }
            }
            else{
                return false;//agar map me character hi nhi hai to vo anagram hi nhi hai so return false
            }
        }
        return map.isEmpty();
    }
    public static void main(String[] args) {
        String s = "r";
        String t = "ra";
        System.out.println(isAnagram(s, t));
    }
}
