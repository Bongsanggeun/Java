package ch15.exam03;

import java.util.HashSet;
import java.util.Set;

public class Example2 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      
      Set<User> set = new HashSet<>();

      User user1 = new User("Winter", "�Ѱܿ�");
      User user2 = new User("Winter", "�Ѱܿ�");
      set.add(user1);
      set.add(user2);
      System.out.println(user1.hashCode() == user2.hashCode());
      System.out.println(user1.equals(user2));     
      
      // �ᱹ �� ���� �ٸ� ��ü��. ������ id�� ���ٰ� �ϸ� ��� ��ü�� �ٸ����� ���� ��ü�� �ǵ��� ���� �ϳ��� ������ �ǵ��� �ϰ��ʹ�.
      System.out.println(set.size());
      
      
   }

}