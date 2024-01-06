class Solution {
    public void rotate(int[][] matrix) {
        int row=matrix.length;
        int col=matrix[0].length;
        for(int i=0;i<row;i++){
            for(int j=i;j<col;j++){
                int temp1=matrix[i][j];
                int temp2=matrix[j][i];
                matrix[i][j]=temp2;
                matrix[j][i]=temp1;
            }
        }
        for(int i=0;i<row;i++){
            int end=col-1;
            for(int j=0;j<col/2;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[i][end-j];
                matrix[i][end-j]=temp;
                 
            }
        }
        
    }
}