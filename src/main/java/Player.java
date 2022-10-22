
public class Player {

   private String name;
   private String email;
   private boolean isWhite;
   private int rank;
   private int age;

   // constructor
   public Player(String name, String email, boolean isWhite, int rank, int age) {
      if (name == null || name.isEmpty() || name.isBlank()) {
         throw new IllegalArgumentException("The name should not be empty");
      } else {
         this.name = name;
      }

      if (email == null || email.isEmpty() || email.isBlank()) {
         throw new IllegalArgumentException("The email should not be empty");
      } 
      
      if (!email.contains("@") || !email.contains(".")) {
         throw new IllegalArgumentException("The email should contain '@' and '.'");
      }else{
         this.email = email;
      }

      if(age < 10 || age > 70){
         throw new IllegalArgumentException("The age should be > 0 or < 70. Also it's should be ");
      }else{
         this.age = age;
      }
      
      this.isWhite = isWhite;
      this.rank = rank;
   }

   // setter and getters
   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getEmail() {
      return email;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   public boolean isWhite() {
      return isWhite;
   }

   public void setWhite(boolean white) {
      isWhite = white;
   }

   public int getRank() {
      return rank;
   }

   public void setRank(int rank) {
      if (rank < 100 || rank > 3000) {
         throw new IllegalArgumentException("The rank should be in range of 100 and 3000");
      }

      this.rank = rank;
   }

   public int getAge() {
      return age;
   }

   public void setAge(int age) {
      this.age = age;
   }

   // toString
   @Override
   public String toString() {
      return "Player {"
              + "name='" + name + '\''
              + ", email='" + email + '\''
              + ", isWhite=" + isWhite
              + ", rank=" + rank
              + ", age=" + age
              + '}';
   }
}
