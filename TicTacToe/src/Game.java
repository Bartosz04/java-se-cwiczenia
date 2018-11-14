
public class Game {

    private ConsoleReader consoleReader;
    private GameState gameState;
    private Board board;
    private Player playerX;
    private Player playerO;
    private Player activePlayer;


    public Game(){
        gameState = GameState.IN_PROGRESS;
        board =new Board(3,3);
        consoleReader = new ConsoleReader();
    }

    public void play(){
        initPlayers();
        activePlayer = playerX;
        while (gameState == GameState.IN_PROGRESS){
            System.out.println("Podaj wspolrzedne gracza: "+activePlayer.toString());

            int coorrdinateX = consoleReader.readCoordinate();
            int coorrdinateY = consoleReader.readCoordinate();

            board.makeMove(coorrdinateX, coorrdinateY, activePlayer.getMark());
            System.out.println(board.toString());

            gameState = board.getGameState();

            activePlayer = (activePlayer == playerO) ? playerX : playerO;
        }
        printGameRsult();
    }

    private void printGameRsult(){
        switch (gameState){
            case DRAW:
                System.out.println("Remis.");
                break;
            case PLAYER_O_WIN:
            case PLAYER_X_WIN:

        }
    }



    private void initPlayers(){
        System.out.println("Podaj imie gracza X: ");
        String playerXName = consoleReader.readName();
        playerX = new Player(playerXName, Mark.X);

        System.out.println("Podaj imie gracza O: ");
        String playerOName = consoleReader.readName();
        playerO = new Player(playerOName, Mark.O);


    }



}
