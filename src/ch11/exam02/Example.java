package ch11.exam02;

import java.util.Date;

public class Example {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      Object var1 = new Object();
      System.out.println(var1.toString());

      
      Date var2 = new Date();
      System.out.println(var2.toString());
      
      String var3 = "abc";
      System.out.println(var3.toString());
      
      // 셋의 결과가 다른 이유 : 재정의를 했기 때문
      
      Member var4 = new Member("winter", "늦겨울");
      System.out.println(var4.toString());
      System.out.println(var4); // println을 썼을 경우 자동적으로 
      
      String result = var4 + " => spring: 봄";
      System.out.println(result);
   }

}