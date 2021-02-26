package ch15.exam03;

import java.util.HashSet;
import java.util.Set;

public class Example2 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      
      Set<User> set = new HashSet<>();

      User user1 = new User("Winter", "한겨울");
      User user2 = new User("Winter", "한겨울");
      set.add(user1);
      set.add(user2);
      System.out.println(user1.hashCode() == user2.hashCode());
      System.out.println(user1.equals(user2));     
      
      // 결국 이 둘은 다른 객체야. 앞으로 id가 같다고 하면 비록 객체가 다르더라도 동등 객체가 되도록 만들어서 하나만 저장이 되도록 하고싶다.
      System.out.println(set.size());
      
      
   }

}