public class maxsubaaraysum {
    public static int max_subarraysum(int arr[]){
        // solution to this is very simple using kadans algorithm
        //we just have to initialize two variable sum and max 
        //we would traverse through array and keep adding elements to sum and we would check if sum is -ve if its -ve then we would update it to zero ,then we would check if sum is greater than max and will update max with sum if sum is greater
        //at the end we would return max

        int sum = 0;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
            if (sum>max) max=sum;
            if(sum<0) sum =0;
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[]={-2,-3,4,-1,-2,1,5,-3};
        System.out.println(max_subarraysum(arr));

    }
}
