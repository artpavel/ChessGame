public abstract class Piece {
   private String name;
   private Spot spot;
   private String id;
   private boolean isWhite;
   private boolean isKill;

   public Piece(String name, Spot spot, String id, boolean isWhite) {
      this.name = name;
      this.spot = spot;
      this.id = id;
      this.isWhite = isWhite;
   }

   public String getName() {
      return name;
   }

   public Spot getSpot() {
      return spot;
   }

   public String getId() {
      return id;
   }

   public boolean isWhite() {
      return isWhite;
   }

   public boolean isKill() {
      return isKill;
   }

   public void setSpot(Spot spot) {
      this.spot = spot;
   }

   public void setKill(boolean kill) {
      isKill = kill;
   }

   @Override
   public String toString() {
      return "Piece {" +
          "name='" + name + '\'' +
          ", spot=" + spot +
          ", id='" + id + '\'' +
          ", isWhite=" + isWhite +
          ", isKill=" + isKill +
          '}';
   }
}
