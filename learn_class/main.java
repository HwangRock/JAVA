import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		char calcul;
		int num1,num2;
		Scanner sc=new Scanner(System.in);
		
		System.out.print("첫번째 정수를 입력:");
		num1=sc.nextInt();
		System.out.print("두번째 정수를 입력:");
		num2=sc.nextInt();
		System.out.print("연산자를 입력:");
		calcul=sc.next().charAt(0);
		calculate cal=new calculate();
		System.out.print("계산 결과:"+cal.calculator(num1, num2, calcul));
	}

}
