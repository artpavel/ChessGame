import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.HashMap;

public class PlayerTest {

   private static ArrayList<Player> players;
   private static HashMap<String, Piece> pieceHashMap;

   @BeforeAll
   public static void setUp() {
      ChessMain main = new ChessMain();
      players = main.createPlayers();
      pieceHashMap = main.createPieces();
   }

   @BeforeEach
   public void beforeEachTest(){
      System.out.println("Running before each");
   }

   @AfterEach
   public void afterEachTest(){
      System.out.println("Running after each");
   }

   @AfterAll
   public static void tearDown(){
      System.out.println("Running after all the tests");
   }

   @Test
   public void validMoveTest(){
      players.get(0).movePiece(pieceHashMap.get("white_king"), new Spot("h", 8));
      Assertions.assertEquals(8, pieceHashMap.get("white_king").getSpot().getY());
   }
}
