public class ChessMain {
   public static void main(String[] args) {

      // create players
      Player whitePlayer = new Player("Beth Harmon", "beth.harmon@gmail.com", true, 2000, 20);
      Player blackPlayer = new Player("Vasily Borgov", "vasily.borgov@gmail.com", false, 2500, 45);

      System.out.println(whitePlayer);
      System.out.println(blackPlayer);


   }
}
