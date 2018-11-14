public class Board {

    private int xDimension;
    private int yDimension;
    private Mark[][] board;

    public Board(int xDimension, int yDimension){
        board = new Mark[xDimension][yDimension];
        for (int i =0; i<xDimension; i++){
            for (int j=0; j<yDimension; j++){
                board[i][j] = Mark.EMPTY;
            }
        }

        this.xDimension = xDimension;
        this.yDimension = yDimension;
    }

    public int getxDimension() {
        return xDimension;
    }

    public int getyDimension() {
        return yDimension;
    }
    //makemove
    public void makeMove(int x, int y, Mark mark){
        board[x][y] = mark;
    }



    public Mark[][] getBoard() {
        return board;
    }
    @Override
    public String toString(){
        String boardString = "";
        for(int i =0; i<3; i++){
            for(int j =0; j<3; j++){
                switch (board[i][j]){
                    case O:
                        boardString += 'O';
                        System.out.println('O');
                        break;
                    case X:
                        boardString += 'X';
                        break;
                    case EMPTY:
                        boardString += ' ';
                        break;
                }
            }
            boardString += '\n';
        }
        return boardString;
    }


            //???
    public GameState getGameState(){
        if (board[0][0]== Mark.X && board[0][1] == Mark.X && board[0][2] == Mark.X ) {
            return GameState.PLAYER_X_WIN;
        }else if (board[1][0]== Mark.X && board[1][1] == Mark.X && board[1][2] == Mark.X ) {
            return GameState.PLAYER_X_WIN;
        }else if (board[2][0]== Mark.X && board[2][1] == Mark.X && board[2][2] == Mark.X ) {
            return GameState.PLAYER_X_WIN;
        }else if (board[0][0]== Mark.X && board[1][0] == Mark.X && board[2][0] == Mark.X ) {
            return GameState.PLAYER_X_WIN;
        }else if (board[0][1]== Mark.X && board[1][1] == Mark.X && board[2][1] == Mark.X ) {
            return GameState.PLAYER_X_WIN;
        }else if (board[0][2]== Mark.X && board[1][2] == Mark.X && board[2][2] == Mark.X ) {
            return GameState.PLAYER_X_WIN;
        }else if (board[0][0]== Mark.X && board[1][1] == Mark.X && board[2][2] == Mark.X ) {
            return GameState.PLAYER_X_WIN;
        }else if (board[2][0]== Mark.X && board[1][1] == Mark.X && board[0][2] == Mark.X ) {
            return GameState.PLAYER_X_WIN;
        }
        else if (board[0][0]== Mark.O && board[0][1] == Mark.O && board[0][2] == Mark.O ) {
            return GameState.PLAYER_O_WIN;
        }else if (board[1][0]== Mark.O && board[1][1] == Mark.O && board[1][2] == Mark.O ) {
            return GameState.PLAYER_O_WIN;
        }else if (board[2][0]== Mark.O && board[2][1] == Mark.O && board[2][2] == Mark.O ) {
            return GameState.PLAYER_O_WIN;
        }else if (board[0][0]== Mark.O && board[1][0] == Mark.O && board[2][0] == Mark.O ) {
            return GameState.PLAYER_O_WIN;
        }else if (board[0][1]== Mark.O && board[1][1] == Mark.O && board[2][1] == Mark.O ) {
            return GameState.PLAYER_O_WIN;
        }else if (board[0][2]== Mark.O && board[1][2] == Mark.O && board[2][2] == Mark.O ) {
            return GameState.PLAYER_O_WIN;
        }else if (board[0][0]== Mark.O && board[1][1] == Mark.O && board[2][2] == Mark.O ) {
            return GameState.PLAYER_O_WIN;
        }else if (board[2][0]== Mark.O && board[1][1] == Mark.O && board[0][2] == Mark.O ) {
            return GameState.PLAYER_O_WIN;
        }
        else{
            return GameState.IN_PROGRESS;
        }

    }
}
