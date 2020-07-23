//first_number부터 last_number까지 돌면서 key_number를 포함한 숫자가 총 몇 개인지 찾는 코드.


package basic0721_1;

import java.util.Scanner;

public class FirstNumAndLastNum_find {

	static void find_number(int first_number,int last_number, int key_number) {
		int sum = 0, j = 0;
		String keyNumberString = Integer.toString(key_number);
		String s;
		
		if(first_number >=last_number)
			System.out.println("다시 입력하세요.");
		
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
		
		System.out.printf("\n%d부터 %d사이의 숫자중 숫자 %d를 포함한 숫자는 총 %d개입니다.",
				first_number, last_number, key_number,sum);
	}
	
	public static void main(String[] args) {
		
		Scanner num_sc = new Scanner(System.in);
		System.out.println("첫 숫자를 입력하세요.");
		int first_number = num_sc.nextInt();
		System.out.println("마지막 숫자를 입력하세요.");
		int last_number = num_sc.nextInt();
		System.out.println("찾을 숫자를 입력하세요.");
		int key_number = num_sc.nextInt();
		
		find_number(first_number, last_number, key_number);
	}
}
