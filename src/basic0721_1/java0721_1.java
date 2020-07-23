package basic0721_1;

import java.util.Scanner;

public class java0721_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        String str;
        
        System.out.println("입력하고 싶은 문자열을 입력하세요.");
        str = scanner.nextLine();
        
        System.out.println("[입력한 문자열]");
        System.out.println(str);  
	}
}
