package basic0721_1;

import java.util.ArrayList;
import java.util.Scanner;

public class arrayList_study {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		list.add("��");
		list.add("��");
		list.add("��");
		System.out.println(list);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�߰��� ���ڿ��� �Է��ϼ���");
		String arr_add = sc.nextLine();
		System.out.println(arr_add + " ��(��) �Է��ϼ̳׿�.");
		list.add(arr_add);
		System.out.println(list);
		
		
	}
}
