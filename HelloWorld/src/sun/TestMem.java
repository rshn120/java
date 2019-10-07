package sun;

import java.util.Scanner;

public class TestMem {
   static Member[] main = new Member[100];

   static Scanner sc = new Scanner(System.in);

   public static void main(String[] args) {
      boolean run = true;
      while (run) {
         System.out.println("------------------------------------------");
         System.out.println("1.회원등록 | 2.회원번호조회 | 3.등록그룹별 리스트 | 4.종료");
         System.out.println("------------------------------------------");
         System.out.print("선택 > ");

         int select = sc.nextInt();
         sc.nextLine();

         if (select == 1) {
            createSportsCenterMember();
         } else if (select == 2) {
            memcheck();
         } else if (select == 3) {
            listcheck();
         } else if (select == 4) {
            run = false;
         }
      }
      System.out.println("종료");
   }

   public static void createSportsCenterMember() {
      System.out.print("회원 번호 입력 : ");
      String id = sc.nextLine();
      sc.nextLine();
      System.out.print("이름 등록 : ");
      String name = sc.nextLine();
      System.out.print("과정을 적으세요 : 1.swim | 2.tannis | 3.badminturn : ");
      int reg = sc.nextInt();
      Member mem = new Member(id, name, reg);
      for (int i = 0; i < main.length; i++) {
         if (main[i] == null) {
            main[i] = mem;
            break;
         }
      }

   }

   public static void memcheck() {

      System.out.println("조회할 ID를 입력: ");
      String id = sc.nextLine();
      for(Member mem : main) {
    	  if(mem != null) 
    		  System.out.println("회원번호: "+mem.getId()+", 이름: "+ mem.getName() +", 수강과정: "+mem.getReg());
      }
   }

   public static void listcheck() {
      System.out.println("등록 그룹별 리스트");
      for (int i = 0; i < main.length; i++) {
         if (main[i].reg == sc.nextInt()) {
            System.out.println(main[i].id + ", " + main[i].name + ", " + main[i].reg);
         } else {
            System.out.println("정확한 그룹명을 넣으세요.");
         }
         
      }
   }
}