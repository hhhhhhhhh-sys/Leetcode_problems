public class trapping_rainwater {
    public static int trappedWater(int height[]){
        int n=height.length;
        //calculate left max array
        int leftMax[]=new int[height.length];
        leftMax[0]=height[0];
        for(int i=1;i<height.length;i++){
            leftMax[i]=Math.max(height[i], leftMax[i-1]);
        }
        //calculate right max array
        int rightmax[]=new int[height.length];
        rightmax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            rightmax[i]=Math.max(height[i], rightmax[i+1]);
        }
        int trappedWater=0;
        //loop
        for(int i=0;i<n;i++){
            //waterlevel=min(leftmax,rightmax)
            int  waterlevel=Math.min(leftMax[i], rightmax[i]);
            //trapped =waterlevel-height[i]
            trappedWater+=waterlevel-height[i];
            
        }return trappedWater;
        
        

    }
    public static void main(String[] args) {
        int height[]={4,2,0,6,3,2,5};
        System.out.println(trappedWater(height));
    }
}
