public class GameOfLife {


    public static void modifyrecord(int[][] board,int currRow,int currColumn,int  row,int column){

        int currValue= board[currRow][currColumn];
        int countLiveCells=0;

        for(int i=currRow-1;i<=currRow+1;i++){


            if(i<0){
                continue;
            }

            if(i==row){
                break;
            }

            for(int j=currColumn-1;j<=currColumn+1;j++){

                if(i==currRow && j==currColumn)
                {
                    continue;
                }

                if(j<0){
                    continue;
                }
                if(j==column){
                    break;
                }


                if(board[i][j]==1 || board[i][j]==-1){
                    countLiveCells++;
                }


            }
        }

        if(countLiveCells<2 && currValue==1){
            board[currRow][currColumn]=-1;
        }
        else if(countLiveCells>3 && currValue==1){
            board[currRow][currColumn]=-1;
        }else if(currValue==0 && countLiveCells==3 ){
            board[currRow][currColumn]=-2;
        }




    }

    public static void gameOfLife(int[][] board) {

        int row=board.length;
        int column=board[0].length;

        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                modifyrecord(board,i,j,row,column);
            }
        }

        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                if(board[i][j]==-1){
                    board[i][j]=0;
                }else if(board[i][j]==-2){
                    board[i][j]=1;
                }
            }
        }

    }

    public static void main(String[] args){
        int[][] board={{0,1,0},{0,0,1},{1,1,1},{0,0,0}};
        gameOfLife(board);
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                System.out.print(board[i][j]);
            }
            System.out.print("\n");
        }


    }
}
