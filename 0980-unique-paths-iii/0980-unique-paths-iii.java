class Solution {
        int res = 0; int n; int m; int eCount = 1;
    public int uniquePathsIII(int[][] grid) {
         n = grid.length;
         m = grid[0].length;
        int X = 0;
        int Y = 0;
        
        for(int i =0; i < n; i++)
        {
            for(int j = 0; j < m; j++)
            {
                if(grid[i][j] == 0)
                    eCount++;
                else if(grid[i][j] == 1)
                    {
                        X = i;
                        Y = j;
                    }
            }
        }

        DFS(grid, X,Y, 0);

        return res;
    }

  public void DFS( int[][] grid,int i, int j, int count)
    {
        if(i < 0 || j < 0 || i >= n || j >=m || grid[i][j] == -1)
            return;

         if(grid[i][j] == 2)
         {
             if(count == eCount)
             {
                 res = res + 1;
             }
             return;
         }  

         grid[i][j] = -1;  

         count++;

         DFS(grid,i+1, j, count);
         DFS(grid,i, j+1, count);
         DFS(grid,i-1, j, count);
         DFS(grid,i, j-1, count);
         grid[i][j]=0;
    }
    
}