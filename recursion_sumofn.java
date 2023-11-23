public class recursion_sumofn {
    public static int sum(int n){
        if(n==1){
            return 1;
        }
        int snm1=sum(n-1);
        int sn = n+snm1;
        return sn;
    }
    public static int fibbonaci(int n) {
        if(n==0||n==1){
            return n;
        }
        // fnm1 -> f of n minus 1
          //general formula fn=fn-1+fn-2
        int fnm1 = fibbonaci(n-1);//calculates first part of formula
        int fnm2 = fibbonaci(n-2);//calculates second part of formula
        int fn = fnm1+fnm2;
        return fn;

    }
    public static void main(String[] args) {
        System.out.println(sum(5));
        System.out.println(fibbonaci(5));
    }
}

