

class Solution
{
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
    {
        ArrayList<Integer> spiralMat=new ArrayList<Integer> ();
        int startRow=0;
        int endRow=r-1;
        int startColumn=0;
        int endColumn=c-1;
        while(startRow<=endRow && startRow<=endColumn){
            // from starting row
            for(int i=startColumn;i<=endColumn;i++){
                spiralMat.add(matrix[startRow][i]);
            }
            startRow++;
               for(int i=startRow;i<=endRow;i++){
                spiralMat.add(matrix[i][endColumn]);
            }
            endColumn--;
            if(startRow<=endRow){
                for(int i=endColumn;i>=startColumn;i--){
                    spiralMat.add(matrix[endRow][i]);
                }
                endRow--;
            }
            
            if(startColumn<=endColumn){
                for(int i=endRow;i>=startRow;i--){
                    spiralMat.add(matrix[i][startColumn]);
                }
                startColumn++;
            }
        }
        return spiralMat;
            
        }
}