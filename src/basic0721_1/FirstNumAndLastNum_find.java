//first_number���� last_number���� ���鼭 key_number�� ������ ���ڰ� �� �� ������ ã�� �ڵ�.


package basic0721_1;

import java.util.Scanner;

public class FirstNumAndLastNum_find {

	static void find_number(int first_number,int last_number, int key_number) {
		int sum = 0, j = 0;
		String keyNumberString = Integer.toString(key_number);
		String s;
		
		if(first_number >=last_number)
			System.out.println("�ٽ� �Է��ϼ���.");
		
		for(int i = first_number ; i <= last_number; i++){
			s = Integer.toString(i);
			if(s.contains(keyNumberString)) {
				sum++;
				System.out.printf("%5s",s);
				j++;
				if(j%20==0)
					System.out.println();
			}
			Integer.valueOf(i);
		}
		
		System.out.printf("\n%d���� %d������ ������ ���� %d�� ������ ���ڴ� �� %d���Դϴ�.",
				first_number, last_number, key_number,sum);
	}
	
	public static void main(String[] args) {
		
		Scanner num_sc = new Scanner(System.in);
		System.out.println("ù ���ڸ� �Է��ϼ���.");
		int first_number = num_sc.nextInt();
		System.out.println("������ ���ڸ� �Է��ϼ���.");
		int last_number = num_sc.nextInt();
		System.out.println("ã�� ���ڸ� �Է��ϼ���.");
		int key_number = num_sc.nextInt();
		
		find_number(first_number, last_number, key_number);
	}
}
