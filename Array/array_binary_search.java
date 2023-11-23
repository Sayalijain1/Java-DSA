package Array;

import java.util.Scanner;

public class array_binary_search {

     public static int binar_search(int array[],int key){
        int start = 0;
        int end = array.length-1;
        int mid=(start+end)/2;
        while(start<=end){

            if(array[mid]==key){
                return array[mid];
            }     
            if(array[mid]<key){
                start=mid+1;
            }
            else{
                start=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];
        System.out.println("enter number from 1-10");
        for(int i=0; i<10; i++){
            array[i]=sc.nextInt();
        }
        System.out.println("Key found at : "+ binar_search(array, 5));
    sc.close();
}

}
