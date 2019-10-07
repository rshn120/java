package suna;

public class Member {
   String id;
   String name;
   int reg;
   
   public Member (String id, String name, int reg) {
      this.id = id;
      this.name = name;
      this.reg = reg;
   }
   
   public String getId() {
      return id;
   }
   public void setId(String id) {
      this.id = id;
   }
   public String getName() {
      return name;
   }
   public void setName(String name) {
      this.name = name;
   }
   public int getReg() {
      return reg;
   }
   public void setReg(int reg) {
      this.reg = reg;
   }
   
}


