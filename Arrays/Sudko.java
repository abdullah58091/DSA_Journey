import java.util.HashSet;
public class Sudko {

    public boolean isValidSudoku(char[][] board) {
        
        HashSet<String> set = new HashSet<>();

        for(int i =0 ; i< 9; i++){
            for(int j =0 ; j<9;j++){
                char num = board[i][j];
                if(num == '.') continue;
            
            String row = num + "row" + i;
            String col = num + "col" + j;
            String box = num + "box" + (i/3) + (j/3);

        if(set.contains(row) || 
           set.contains(col) || 
          set.contains(box)) {

            return false;
          } 
        set.add(row);
        set.add(col);
        set.add(box);
            }
        }

        return true ;
    }
    
        public static void main(String[] args) {
            char[][] board = {
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
            };
            Sudko obj = new Sudko();
            System.out.println(obj.isValidSudoku(board));
        }
    }

