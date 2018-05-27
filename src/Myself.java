import java.util.Scanner;

public class Myself {
	public static void main(String[] args) {

		int result = 4 * 1;
		System.out.println(result);
		
		result = 4 * 2;	// int result = 4 *2;이라고 하면 안 된다. 똑같은 변수를 한 번 더 선언하는 꼴이 된다.
		// 그냥 변수명만 입력하면 된다.
		System.out.println(result);
		
		result = 4 * 3;	
		System.out.println(result);
		
		result = 4 * 4;	
		System.out.println(result);
		
		result = 4 * 5;	
		System.out.println(result);
		
		result = 4 * 6;	
		System.out.println(result);
		
		result = 4 * 7;	
		System.out.println(result);
		
		result = 4 * 8;	
		System.out.println(result);
		
		result = 4 * 9;	
		System.out.println(result);
		
		System.out.println("출력한 단을 입력하시오: ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt(); 
		
		System.out.println(number+"단");
		System.out.println(number + " * 1 =" + number * 1);
		System.out.println(number + " * 2 =" + number * 2);
		System.out.println(number + " * 3 =" + number * 3);
		System.out.println(number + " * 4 =" + number * 4);
		System.out.println(number + " * 5 =" + number * 5);
		System.out.println(number + " * 6 =" + number * 6);
		System.out.println(number + " * 7 =" + number * 7);
		System.out.println(number + " * 8 =" + number * 8);
		System.out.println(number + " * 9 =" + number * 9);
	}
}
