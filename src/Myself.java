import java.util.Scanner;

public class Myself {
	public static void main(String[] args) {
		System.out.println("구구단 중 출력할 단은? ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		
		if(number < 2) {
			System.out.println("2와 9사이의 값을 입력하시오");			
		} else if (number > 9) {
			System.out.println("2와 9사이의 값을 입력하시오");
		} else {
			System.out.println(number + "단");
			for(int i = 1; i < 10; i++) {
				System.out.println(number + " * " + i +" = " + number * i);				
			}
		}
	}
}
