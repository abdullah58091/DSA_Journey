public class TwoPointer_MaxWater {
    public static  int maxWater(int height []){

        int left =0;
        int right = height.length - 1;
        int  maxWater =0;
        while( left <right){
            int width = right - left ;
            int h = Math.min(height[left], height[right]);
            int area = width * h;
            maxWater =Math.max(maxWater,area);
            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxWater;
    }

    public static void main(String[] args) {
        int height[] = {2,3,4,5,18,17,6};
        int result = maxWater(height);
        System.out.println(result);
    }
    
}
