public class sorting_practice {
  public static boolean ispalindrome(String s){
    for (int i = 0; i < s.length()-1; i++) {
        int n = s.length()-1;
        if(s.charAt(i)!=s.charAt(n-i)){
            return false;
        }
    }
    return true;
  }
  public static void main(String[] args) {
    String s = "noon";
    System.out.println("Ans: "+ispalindrome(s));
  }
}
