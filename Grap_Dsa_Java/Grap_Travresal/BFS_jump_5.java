import java.util.LinkedList;
import java.util.Queue;
public class BFS_jump_5 {
    
     public boolean canReach(String s, int minJump, int maxJump) {
        Queue<Integer> q = new LinkedList<>();

        int n = s.length();

        boolean[] visited = new boolean[n];

        q.offer(0);

        visited[0] = true;

        int farthest = 0;

        while (!q.isEmpty()) {

            int i = q.poll();

            int start = Math.max(i + minJump, farthest + 1);

            
            int end = Math.min(i + maxJump, n - 1);

            for (int j = start; j <= end; j++) {

               
                if (s.charAt(j) == '0' && !visited[j]) {

                 
                    if (j == n - 1) {
                        return true;
                    }

                    visited[j] = true;

                    q.offer(j);
                }
            }

        
            farthest = end;
        }

        return n == 1;
    }
    public static void main(String[] args) {
        BFS_jump_5 call = new BFS_jump_5();
        String s = "011010";
        int minJump = 2;
        int maxJump = 3;
        System.out.println(call.canReach(s, minJump, maxJump));
    }
}

