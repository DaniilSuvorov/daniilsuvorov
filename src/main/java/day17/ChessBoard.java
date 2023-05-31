package day17;

public class ChessBoard {
    private ChessPiece[][] configuration;
    public ChessBoard(ChessPiece[][] configuration){
        this.configuration = configuration;
    }
    public static void print(ChessBoard chessBoard){
        for( int i = 0; i < chessBoard.configuration.length; i++){
            for (int j = 0; j < chessBoard.configuration[i].length; j++){
                System.out.print(chessBoard.configuration[i][j]);
            }
            System.out.println();
        }
    }
}
