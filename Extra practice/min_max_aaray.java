public class min_max_aaray {
    public static void main(String[] args) {
        int arr[]={1,2,3,0,4,5};
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(largest<arr[i]){ //-5<1==>largest=1...1<2==>largest=2
                largest=arr[i];
            }
            else if(smallest>arr[i]){//100>1==>smallest=1...1>2=>false...3>0 true so smallest =0...rest all false
                smallest=arr[i];
            }
        }
        System.out.println("Max number is: "+largest);
        System.out.println("Smallest number is "+smallest);
    }
}
