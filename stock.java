// nahi samjha mujhe ye

public class stock {
    public static void main(int[]stocks){
        int buyprice=Integer.MAX_VALUE;
        int maxprofit=0;
        for (int i = 0; i < stocks.length; i++) {
            if(buyprice<stocks[i]){
                maxprofit=buyprice-stocks[i];
            }
        }

    }
    public static void main(String[] args) {
        int[] stocks={7,1,5,3,6,4};

    }
}
