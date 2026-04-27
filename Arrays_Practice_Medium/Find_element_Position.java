public class Find_element_Position {
    public   int[]  searchRange(int [] nums ,int target){

        int first = -1;
        int last = -1;
        for(int i = 0 ;i< nums.length;i++){
            if(nums[i] == target){
                if(first == -1){
                    first = i;
                }
                last =i;
            }
        }
        return new int[]{first,last};
    }

    public static void main(String[] args) {

        int [] nums = {2,4,4,4,5,6};
        int target = 4;
    
        Find_element_Position obj = new Find_element_Position();
        int [] result = obj.searchRange(nums, target);  
        System.out.println("First Occurrence: " + result[0]);
        System.out.println("Last Occurrence: " + result[1]);
    }

 }