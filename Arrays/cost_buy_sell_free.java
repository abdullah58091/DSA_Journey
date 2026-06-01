 import java.util.Arrays;
public class cost_buy_sell_free {
   

    public int minimumCost(int[] cost) {
            
  Arrays.sort(cost);
    int ans = 0;
     int count = 0;
                                            
       for(int i = cost.length - 1; i >= 0; i--){
         if(count  != 2){
          ans += cost[i];           
       }

        count = (count + 1) % 3;
      }
     return ans ;           
     
    }
    public static void main(String[] args) {
        cost_buy_sell_free obj = new cost_buy_sell_free();
        int[] cost = {1,2,3};
        System.out.println(obj.minimumCost(cost));
    }
}
