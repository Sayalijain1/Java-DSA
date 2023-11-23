package Array;

// public class array_pairs {
//     public static void pairs(int array[]){
//         int start=0, end=array.length-1;
//         int i=0;
//         while(start<end){
//             System.out.println(array[i]+" "+array[i+1]);
//             i++;
//             start++;
//         }
       
//     }
//     public static void main(String[] args) {
//         int array[]={2,3,4,5};
//         pairs(array);
//     }
// }
// tried to solve it, i am soo happy
public class array_pairs {
        public static void pairs(int array[]){
            // int start=0, end=array.length-1;
            for(int i =0;i<array.length;i++){
                int current=array[i];
                for(int j=i+1;j<array.length;j++){
                    System.out.print("("+current+","+array[j]+")");
                }
                System.out.println();
            }
             
           
        }
        public static void main(String[] args) {
            int array[]={2,3,4,5,6};
            int size = array.length;
            int total=(size*(size-1))/2;
            pairs(array);
            System.out.println("Total pairs are: "+total);
        }
    }