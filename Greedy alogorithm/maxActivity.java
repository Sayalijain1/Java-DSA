import java.util.ArrayList;

public class maxActivity{
    public static void main(String[] args) {
         
        
        int start[]={1,3,0,5,8,5};
        int end[]={2,4,6,7,9,9};
        //end time is sorted
        int maxAct=0;//to strore index of max activity
        ArrayList<Integer> ans =new ArrayList<>();
        // 1st activity
        maxAct=1;
        ans.add(0);
        int lastEnd = end[0];//ending time
        for (int i = 0; i < end.length; i++) {
           if (start[i]>=lastEnd) {
              //activity select
              maxAct++;
              ans.add(i);
              lastEnd=end[i];
           }
        } 
        System.out.println("max activities = "+maxAct);
        for (int i = 0; i < ans.size(); i++) {
            System.out.println("A"+ans.get(i));
        }

    }
}