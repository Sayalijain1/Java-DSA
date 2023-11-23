public class uppercase {
    public static String touppercase(String str){
        StringBuilder sb = new StringBuilder("");
        char ch =Character.toUpperCase(str.charAt(0));
        sb.append(str);
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)==' ' && i<str.length()-1){
                sb.append(str.charAt(i));
            }
        }
        return str;
    }
}
