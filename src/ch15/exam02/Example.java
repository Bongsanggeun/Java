package ch15.exam02;

import java.util.ArrayList;
import java.util.List;

public class Example {

   public static void main(String[] args) {
      
      List<Board> list = new ArrayList<>(); // 앞으로는 이렇게 사용안한다.. / 뒤에 부분은 생략가능
      // ArrayList
      // 객체 저장
      list.add(new Board(1, "제목1"));
      list.add(new Board(2, "제목2")); // 이건 값이지만 저장이 될 때는 auto boxing이 되어서 객체로 저장됨.
      list.add(new Board(3, "제목3"));// 
      System.out.println(list.size());
      
      // 객체 얻기
      Board board1 = list.get(0); // 
      System.out.println(board1.getBno() + ":" + board1.getTitle());
      Board board2 = list.get(1);
      Board board3 = list.get(2); // 
      // 반복 처리
      for(int i=0; i<list.size() ;i++) {
         Board board = list.get(i);
         System.out.println(board.getBno() + ":" + board.getTitle());
      }
      
      for(Board board : list) {
         System.out.println(board.getBno() + ":" + board.getTitle());
      }
      
      // 객체 제거
      list.remove(0);
      list.remove(0); // 자동으로 앞으로 땡겨짐
      System.out.println(list.size());
   }

}
