import java.util.ArrayList;
import java.util.Collections;

public class JobSequencing {
    static class job{
        int deadline;
        int profit;
        int id;
        public Job(int i, int d, int p){
            id=i;deadline=d;
            profit=p;
        }
    }
    public static void main(String[] args) {
        int jobInfo[][]={{4,20},{1,10},{1,40},{1,30}};
        //we would define our jobinfo in form of object of class job
        ArrayList <job> jobs= new job[jobInfo.length];
        for (int i = 0; i < jobs.length; i++) {
            jobs.add(new job(i, jobInfo[i][0],jobInfo[i][1]));
        }
        Collections.sort(jobs, null);   
    }   
}
