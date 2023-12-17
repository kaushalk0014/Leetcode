class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
        char[][] board = new char[n][n];
        solveRecBacktracking(res,board, 0);
        return res;

    }


    public void solveRecBacktracking(List<List<String>> res,char[][] board, int col)
    {
        //base condition
        if(col == board[0].length)
        {
            saveBoard(res,board);
            return;
        }

        for(int row =0; row < board.length; row ++)
        {
            if(isSafe(board, row, col))
            {
                board[row][col] = 'Q';
                solveRecBacktracking(res, board, col+1);
                board[row][col] = '.';
            }

        }

    }

    public boolean isSafe(char[][] board, int row, int col)
    {
        //horizontal
        for(int j =0; j < board[0].length; j++)
        {
            if(board[row][j] == 'Q')
            return false;
        }

                //vertical
        for(int i =0; i < board.length; i++)
        {
            if(board[i][col] == 'Q')
            return false;
        }

        //upper left
        for(int r =row, c = col; r >= 0 && c >= 0; r--,c--)
        {
            if(board[r][c] == 'Q')
            return false;
        }


        //upper right
        for(int r =row, c = col; r >= 0 && c < board[0].length; r--,c++)
        {
            if(board[r][c] == 'Q')
            return false;
        }

        //bottom left
        for(int r =row,  c = col; r < board.length && c >= 0; r++,c--)
        {
            if(board[r][c] == 'Q')
            return false;
        }

        //bottom right
        for(int r =row,  c = col; r < board.length && c < board[0].length; r++,c++)
        {
            if(board[r][c] == 'Q')
            return false;
        } 

        return true;
    }

    public void  saveBoard(List<List<String>>res, char[][] board)
    {
        List<String> l = new ArrayList<>();
        for(int i = 0; i< board.length; i++)
        {
            String str = "";
            for(int j = 0; j < board[0].length; j++)
            {
                if(board[i][j] == 'Q')
                {
                    str += "Q";
                }
                else
                {
                    str += ".";
                }
            }
            l.add(str);
        }
        res.add(l);
    }
}