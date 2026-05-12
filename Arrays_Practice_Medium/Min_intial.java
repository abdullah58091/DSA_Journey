import java.util.Arrays;

public class Min_intial {
    public int minimumEffort(int[][] tasks) {
        
        Arrays.sort(tasks , ( a, b) -> (b[1] - b[0] ) -(a[1] - a[0]));

        int energy = 0;
        int answer = 0 ;

        for(int [] task : tasks ){
            int actual = task[0];
            int minimum  = task[1];

            if(energy < minimum) {
                int need = minimum - energy ;
                answer +=  need;
                energy += need;
            }
            energy -=  actual;
        }
        return answer;
    }
    
    public static void main(String[] args) {
        int [][] tasks = {{1,2},{3,4},{5,6}};
        Min_intial solution = new Min_intial();
        int min = solution.minimumEffort(tasks);
        System.out.println(min);
    }
}
