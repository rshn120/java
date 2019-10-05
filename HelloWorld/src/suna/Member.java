package suna;

public class Member {
   String id;
   String name;
   String reg;
   
   public Member (String id, String name, String reg) {
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
   public String getReg() {
      return reg;
   }
   public void setReg(String reg) {
      this.reg = reg;
   }
   
}


