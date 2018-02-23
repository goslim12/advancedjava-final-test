package prob02;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );
		System.out.print( "두 정수와 연산자를 입력하시오 >> " );
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		String operation = scanner.next();
		int answer = 0;
		switch(operation) {
			case "+":
				answer = (new Add()).calculate(a, b);
				System.out.println(answer);
				break;
			case "*":
				answer =(new Mul()).calculate(a, b);
				System.out.println(answer);
				break;
			case "-":
				answer =(new Sub()).calculate(a, b);
				System.out.println(answer);
				break;
			case "/":
				answer = (new Div()).calculate(a, b);
				if(b!=0)
					System.out.println(answer);
				break;
		}
		
		/* operation에 따라 4칙 연산 객체를 생성하고 caculate 메서드를 호출합니다. */
	}
}
