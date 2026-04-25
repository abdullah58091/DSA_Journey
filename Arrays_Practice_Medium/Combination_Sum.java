import java.util.*;
 
 public class Combination_Sum {


    public static List<List<Integer>> combinationSum(int[] candidates,int target){
        List<List<Integer>> ans = new ArrayList<>();  
        backtrack(0,candidates,target,new ArrayList<>(), ans);
        return ans;
      }

      public static void backtrack(int index,int[] arr,int target, List<Integer> temp, List<List<Integer>> ans){
        if (target == 0){
            ans.add(new ArrayList<>(temp));
            return;
        }

        if(index == arr.length) return;


        if(arr[index] <= target){
            temp.add(arr[index]);
            backtrack(index,arr,target-arr[index],temp,ans);
            temp.remove(temp.size() -1);
        }
        backtrack(index +1,arr,target,temp,ans);
      }


    public static void main(String[] args) {

            int [] arr = {2,3,6,7};
            int target = 7;

            List<List<Integer>> result = combinationSum(arr,target);
            System.out.println(result);
    }
}

