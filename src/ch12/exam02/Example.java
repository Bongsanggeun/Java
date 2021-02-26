package ch12.exam02;

public class Example {

   public static void main(String[] args) {
      
      System.out.println("메인 스레드 시작");
      
      // 네트워크 작업을 하는 스레드 생성과 실행
      Thread thread1 = new NetworkTask();
      thread1.start();
      // 뮤직 작업을 하는 스레드 생성과 실행
      Thread thread2 = new MusicTask();
      thread2.start();
      
      // 채팅 작업을 하는 스레드 생성과 실행
      Thread thread3 = new Thread() {
         @Override
         public void run() {
            while(true) {
               
               System.out.println("채팅 작업을 합니다.");
               try {
                  Thread.sleep(1000);
               } catch (InterruptedException e) {
               }
            }
         }
      }; // interface는 생성자가 없는데 ()를 왜하징..
      // {}는...? Runnable 이라는 클래스는 선언하고 나서 이것을 객체로 만들겠따다. -> 클래스이름이 없네? 그래서 익명객체라고 부름.
      thread3.start();
      
      while(true){
         System.out.println("메인 작업을 합니다.");
         try {
            Thread.sleep(1000);
         } catch (InterruptedException e) {
         }
      }
      
   }

}