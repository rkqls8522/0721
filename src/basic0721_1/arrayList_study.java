package basic0721_1;

import java.util.ArrayList;
import java.util.Scanner;

public class arrayList_study {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		list.add("가");
		list.add("나");
		list.add("다");
		System.out.println(list);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("추가할 문자열을 입력하세요");
		String arr_add = sc.nextLine();
		System.out.println(arr_add + " 을(를) 입력하셨네요.");
		list.add(arr_add);
		System.out.println(list);
		
		
	}
}
