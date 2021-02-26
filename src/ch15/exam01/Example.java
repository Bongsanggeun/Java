package ch15.exam01;

import java.util.ArrayList;
import java.util.List;

public class Example {

	public static void main(String[] args) {
		
		List<Board> list = new ArrayList<Board>();
		
		//按眉 历厘
		list.add(new Board());
		list.add(new Board());
		list.add(new Board());
		System.out.println(list.size());
		
		//按眉 掘扁
		Board board1 = list.get(0);
		Board board2 = list.get(0);		
		Board board3 = list.get(0);
		
		//按眉 力芭
		list.remove(0);
		list.remove(0);
		System.out.println(list.size());
	}

}
