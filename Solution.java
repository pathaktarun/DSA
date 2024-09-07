import java.util.ArrayList;
import java.util.List;

public  class Solution {
    public static List<Integer> spiralOrder(int[][] matrix) {

        int row=matrix.length;
        int column=matrix[0].length;
        int totalelements=row*column;

        boolean moveup=false;
        boolean movedown=false;
        boolean moveleft=false;
        boolean moveright=true;

        boolean isElementLeft=true;

        List<Integer> ans=new ArrayList<>();

        int i=0;
        int j=0;

        while(totalelements>0)
        {

            while(moveright && matrix[i][j]!=-101){
                ans.add(matrix[i][j]);
                matrix[i][j]=-101;
                totalelements--;

                if(j==column-1 || matrix[i][j+1]==-101){
                    moveright=false;
                    movedown=true;
                    i++;
                    break;

                }
                j++;
            }
            while(movedown && i<row && matrix[i][j]!=-101){
                ans.add(matrix[i][j]);
                matrix[i][j]=-101;
                totalelements--;
                if(i==row-1 || matrix[i+1][j]==-101 ){
                    moveleft=true;
                    movedown=false;
                    j--;
                    break;

                }
                i++;


            }
            while(moveleft && j>=0 && matrix[i][j]!=-101) {
                ans.add(matrix[i][j]);
                matrix[i][j] = -101;
                totalelements--;
                if (j == 0 || matrix[i][j-1]==-101) {
                    moveup = true;
                    moveleft = false;
                    i--;
                    break;

                }
                j--;
            }
            while(moveup && i>=0 && matrix[i][j]!=-101){
                    ans.add(matrix[i][j]);
                    matrix[i][j]=-101;
                    totalelements--;
                    if(i==0 || matrix[i-1][j]==-101){
                        moveup=false;
                        moveright=true;
                        j++;
                        break;

                    }
                    i--;
                }

        }

        return ans;

        }

    public static void main(String[] args){
        int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};
        List<Integer> ans=spiralOrder(matrix);

        for(int x: ans){
            System.out.print(x+" ");
        }
    }
}