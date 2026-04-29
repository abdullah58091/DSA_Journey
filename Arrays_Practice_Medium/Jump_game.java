//    question  You are given an integer array nums. You are initially positioned at the array's first index, and each element in the array represents your maximum jump length at that position.


public class Jump_game {

    public boolean canJump(int[] nums){
        int maxReach = 0;

        for (int i = 0 ; i <nums.length; i++){
            if(i > maxReach){
                return false;
            }

            maxReach = Math.max(maxReach, i + nums[i]);

        }
        return true;
        
    }

     public static void main(String[] args) {
        int[] nums = {2,3,1,1,4};
        Jump_game result = new Jump_game();
        System.out.println(result.canJump(nums));
    }
}
