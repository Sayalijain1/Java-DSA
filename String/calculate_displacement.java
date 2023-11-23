public class calculate_displacement {
    public static float displacement(String s){
        int x = 0;
        int y = 0;
        for (int i = 0; i < s.length(); i++) {
            char dir = s.charAt(i);
            if(dir=='N'){
                y++;
            }
            else if(dir=='S'){
                y--;
            }
            else if (dir=='W'){
                x--;
            }
            else{
                x++;
            }
         
        }
        int x2 = x*x;
         int y2 = y*y;
         return (float)Math.sqrt(x2+y2);
    }
    public static void main(String[] args) {
        String s = "WNEENESENNN";
        System.out.println("The displacement is : "+displacement(s));
    }
}
