
import java.util.ArrayList;
import java.util.List;

public class Tree_visualization {


   // Backtracking in RecursionJava
    //Print all Permutations


    public static  void printPermutation(String str,String prem , int index){

        if (str.length() == 0){
            System.out.println(prem);
            return;
        }
        for (int i =0; i<str.length();i++){
            char current = str.charAt(i);
            String newstr = str.substring(0,i)+str.substring(i+1);
            printPermutation(newstr,  prem+current, index+1);
        }
    }

    public static void   findSubset (int  i, int [] nums, List<Integer> current1, List<List<Integer>> result ) {

        // base case

        if( i == nums.length) {
            result.add(new ArrayList<>(current1));
            return;
        }

            // Include elements
             current1.add(nums[i]);
            findSubset(i + 1, nums, current1, result);


            // backtrack
            current1.remove(current1.size() - 1);

            // exclude elements

            findSubset( i +1,nums,current1,result);

    }

    public static void main(String[] args) {
        System.out.println("tree visualization step recursion");
        String str = "ABC";
        printPermutation(str, "", 0);  // Time complexity - O(n*n!)

        int[] nums = {1, 2, 3};
        List<List<Integer>> result = new ArrayList<>();

        findSubset(0, nums, new ArrayList<>(), result);

        System.out.println("Backtracking for array");

        System.out.println(result); //⭐ Time Complexity  👉 O(2ⁿ)  Because har element ke 2 choices  ⭐ Space Complexity👉 O(n) recursion stack


    }
}
