// public class string_palindrome {
//     public static boolean palindrome(String s){
//         for (int i = 0; i < s.length()/2; i++) {
//             int n=s.length();
//             if(s.charAt(i)!= s.charAt(n-1-i)){
//                 return false;
//             }
            
//         }
//         return true;
//     }
//     public static void main(String[] args) {
//           String say = "sayali";
//         //   palindrome(say);
//           System.out.println(palindrome(say));


//         }
   
//     }
public class string_palindrome{
    public static boolean ispalindrome(String s){
            for (int i = 0; i < s.length(); i++) {
                 int n = s.length()-1;
                 if(s.charAt(i)!=s.charAt(n-i)){
                    return false;
                 }
            }
            return true;
    }
    public static void main(String[] args) {
        String say = "noon";
        System.out.println("is the string palindron? "+ispalindrome(say));
      
    }
}
