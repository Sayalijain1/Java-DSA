public class Sorting123{
    public static void sorts123(int[] arr){
        int high=arr.length-1;
        int low=0;
        int mid = 0;
        int temp = 0;

    // this algorithm is very very simple in case of 0 we have to exchange low and  mid pointer and increement them in case of 1 we just have to increase mid pointer ,in case of 2 we have to swap mid and high poniter and reduce high we have to keep doing this unless mid is <= less than equal to high
        while (mid<=high) {
            switch (arr[mid]) {
                case 0://swap low and mid and increce low and mid
                    temp = arr[low];
                    arr[low]=arr[mid];
                    arr[mid]=temp;
                    low++;
                    mid++;
                    break;
                case 1://just increase the mid
                
                    mid++;
                    break;
                case 2:
                    temp = arr[mid];
                    arr[mid]=arr[high];
                    arr[high]=temp;
                    high--;
                    break;
            }
        }

    }
    public static void main(String[] args) {
        int arr[]={0,2,1,0,1,2,2};
        sorts123(arr);
        for (int i = 0; i < arr.length; i++) {
             System.out.println(arr[i]+" ");
        }
    }
}