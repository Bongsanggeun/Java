package ch15.exam01;

import java.util.ArrayList;
import java.util.List;

public class Example {

	public static void main(String[] args) {
		
		List<Board> list = new ArrayList<Board>();
		
		//��ü ����
		list.add(new Board());
		list.add(new Board());
		list.add(new Board());
		System.out.println(list.size());
		
		//��ü ���
		Board board1 = list.get(0);
		Board board2 = list.get(0);		
		Board board3 = list.get(0);
		
		//��ü ����
		list.remove(0);
		list.remove(0);
		System.out.println(list.size());
	}

}
