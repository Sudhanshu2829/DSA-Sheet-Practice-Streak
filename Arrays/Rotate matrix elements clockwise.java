class Solution {
    int[][] rotateMatrix(int M, int N, int Mat[][]) {
        // code here
        int row = 0, col = 0;
        int prev, curr;
      	while (row < M && col < N)
      	{
   
           if (row + 1 == M || col + 1 == N)
              break;
   
          
          prev = Mat[row + 1][col];
   
          // top wall
          for (int i = col; i < N; i++)
          {
              curr = Mat[row][i];
              Mat[row][i] = prev;
              prev = curr;
          }
          row++;
   
          // right wall
          for (int i = row; i < M; i++)
          {
              curr = Mat[i][N-1];
              Mat[i][N-1] = prev;
              prev = curr;
          }
          N--;
   
          
          if (row < M)
          {  //bottom wall
              for (int i = N-1; i >= col; i--)
              {
                  curr = Mat[M-1][i];
                  Mat[M-1][i] = prev;
                  prev = curr;
              }
          }
          M--;
   
          
          if (col < N)
          {  // left wall
              for (int i = M-1; i >= row; i--)
              {
                  curr = Mat[i][col];
                  Mat[i][col] = prev;
                  prev = curr;
              }
          }
          col++;
      }
      return Mat; 
    }
}