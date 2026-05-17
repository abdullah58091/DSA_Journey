public class jump {


      public boolean canReach(int[] arr, int start) {
       
        boolean[] visited = new boolean[arr.length];

        return dfs(arr, start, visited);
    }

    public boolean dfs(int[] arr, int i, boolean[] visited) {

    
        if (i < 0 || i >= arr.length) {
            return false;
        }

        if (visited[i]) {
            return false;
        }
    
        if (arr[i] == 0) {
            return true;
        }

        visited[i] = true;

        return dfs(arr, i + arr[i], visited) || dfs(arr, i - arr[i], visited);
    }
     public static void main(String[] args) {
        int[] arr = {4, 2, 3, 0, 3, 1, 2};
        int start = 5;
        jump obj = new jump();
        System.out.println(obj.canReach(arr, start));
    }
}
    

