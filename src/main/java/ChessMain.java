import java.util.ArrayList;
import java.util.HashMap;


public class ChessMain {
   public static void main(String[] args) {
      // create main
      ChessMain main = new ChessMain();
      // create players
      ArrayList<Player> players = main.createPlayers();
      for (Player player : players) {
         System.out.println(player);
      }
      // create pieces
      HashMap<String, Piece> pieceHashMap = main.createPieces();
      System.out.println(pieceHashMap);

      // play
      main.play(players, pieceHashMap);

   }

   // create players
   public ArrayList<Player> createPlayers() {
      // create players
      Player whitePlayer = new Player("Beth Harmon", "beth.harmon@gmail.com", true, 2000, 20);
      Player blackPlayer = new Player("Vasily Borgov", "vasily.borgov@gmail.com", false, 2500, 45);

      ArrayList<Player> playerList = new ArrayList<>();
      playerList.add(whitePlayer);
      playerList.add(blackPlayer);

      return playerList;
   }

   // create pieces
   public HashMap<String, Piece>  createPieces(){
      King whiteKing = new King(new Spot("h", 7), "white_king", true);
      King blackKing = new King(new Spot("d", 8), "black_king", false);
      Rook whiteRook1 = new Rook(new Spot("a", 7), "white_rook1", true);
      Rook whiteRook2 = new Rook(new Spot("g", 7), "white_rook2", true);
      Knight blackKnight1 = new Knight(new Spot("d", 6), "black_knight1", false);

      HashMap<String, Piece> pieceHashMap = new HashMap<>();
      pieceHashMap.put(whiteKing.getId(),whiteKing);
      pieceHashMap.put(blackKing.getId(),blackKing);
      pieceHashMap.put(whiteRook1.getId(),whiteRook1);
      pieceHashMap.put(whiteRook2.getId(),whiteRook2);
      pieceHashMap.put(blackKnight1.getId(),blackKnight1);

      return pieceHashMap;
   }

   // movies
   public void play(ArrayList<Player> players, HashMap<String, Piece> hashMap){
      //move 1
      try {
         players.get(0).movePiece(hashMap.get("white_rook1"), new Spot("a", 8));
      } catch (IllegalArgumentException e) {
         System.out.println("The move is incorrect, please try again");
      }

      players.get(1).movePiece(hashMap.get("black_knight1"), new Spot("c", 8));
   }
}
