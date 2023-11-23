public class trapedwaterprb {
    public static int trappedwater( int []height){
        int h = height.length;
    //find left max boundary-->(auxillary array)
        // jitni height(poles) honge utne bar hume left max nikalna hai isliye hum iss array ki length aise define karenge

        int leftmax[]=new int[h];
        leftmax[0]=height[0];
        //kyoki first pole ke pehle kuch hai hi nahi so uski left boundary 0 hogi
        for (int i = 1; i < leftmax.length; i++) {
          //i=1 bc 0 i=0 ki height 0 hai
          leftmax[i]=Math.max(height[i], leftmax[i-1]);
          // is formula mein humne leftmax calculate kiya
          // by comparing current pole ki height aur uske ek pole pehle ki height
          //aur unka max liya
       }

    //find right max boundary->(auxullary array)
        int rightmax[]=new int[h];
        //rightmax hum right se calculate karnge aur rightmax element ki value uski hi value hogi
        rightmax[h-1]=height[h-1];
        for (int i = h-2; i >=0; i--) {
            rightmax[i]=Math.min(height[i], rightmax[i+1]);
        }


    //loop se find karenge water level
    int trappedwater=0;
        for (int i = 0; i < h; i++) {
             //waterlevel = min(left boundary,right boundary)
            int waterlevel= Math.min(leftmax[i], rightmax[i]);

            //phir calculate karenge trapped water
            trappedwater+=waterlevel-height[i];
            //+= isliye kyoki hume total trapped water find karna hai

        }
    return -(trappedwater);
}
   public static void main(String[] args) {
    int []height={4,2,0,6,3,2,5};
    int ans = trappedwater(height);
    System.out.println("The total level of water trapped is :"+ans);
   }
}
