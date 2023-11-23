import java.util.Stack;
public class StckSpan {
    public static void stocksSpan(int stocks[],int spans[]){
        Stack<Integer> s = new Stack<>();
        spans[0]=1;
        s.push(0);
        for (int i = 1; i < stocks.length; i++) {
            int cuuprice = stocks[i];
            while (!s.isEmpty() && cuuprice> stocks[s.peek()]) {
                s.pop();
            }
            if(s.isEmpty()){
                spans[i]=i+1;
            }else{
                int prevHigh = s.peek();
                spans[i]=i-prevHigh;
            }
            s.push(i);
        }
    }
    public static void main(String[] args) {
        int stocks[]={100,80,60,70,60,65,85,100};
        int spans[]=new int [stocks.length];
        stocksSpan(stocks,spans);
        for (int i = 0; i < spans.length; i++) {
            System.out.println(spans[i]+"");
        }
    }
}
