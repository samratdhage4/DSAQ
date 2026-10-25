/*79. Word Search
Given an m x n grid of characters board and a string word, return true if word exists in the grid.
The word can be constructed from letters of sequentially adjacent cells, where adjacent cells
are horizontally or vertically neighboring. The same letter cell may not be used more than once.

Example 1:
Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCCED"
Output: true

Example 2:
Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "SEE"
Output: true

Example 3:
Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCB"
Output: false */

public class wordSeach {

    static boolean isthere(char[][] board,char[] word,int i,int j,int idx)
    {
        if(idx==word.length)
        {
            return  true;
        }

        if(i<0 || i>=board.length || j<0 || j>=board[0].length || board[i][j]!=word[idx])
        {
            return false;
        }

        char c=board[i][j];
        board[i][j]='*';
        boolean res= isthere(board, word, i+1, j, idx+1)||
                     isthere(board, word, i-1, j, idx+1)||
                     isthere(board, word, i, j+1, idx+1)||
                     isthere(board, word, i, j-1, idx+1);
        board[i][j]=c;

        return res;
    }

    public static boolean exist(char[][] board, String word)
    {

        char[] w= word.toCharArray();

        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++)
            {
                if(isthere(board,w,i,j,0))
                {
                    return true;
                }
            }
        }

        return false;
    }


    public static void main(String[] args) {
        
        char[][] board ={{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        String word = "ABCCED";
        System.out.println(exist(board,word));
    }

    
}
