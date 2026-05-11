
import java.util.*;
public class DigitQuestions {
    
    public static void main(String[] args) {
        // Main method implementation
        int [] nums = {34,52,81};

        ArrayList<Integer> list = new ArrayList<>();

        for(int num : nums){

            ArrayList<Integer> ans = new ArrayList<>();

            while(num > 0){
                int rem = num % 10;
                ans.add(rem);
                num /= 10;
            }
            for(int i = ans.size() - 1; i >= 0; i--){
                list.add(ans.get(i));
            }
        }
        System.out.println(list);

    }
}
