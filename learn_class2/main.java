package learn_class2;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		make obj1=new make();
		make obj2=new make();
		String a;
		double b, density1,density2,gap;
		
		
		System.out.print("첫번째 물체 하나의 이름을 입력:");
		a=scan.next();
		obj1.setName(a);
		
		System.out.print("두번째 물체 하나의 이름을 입력:");
		a=scan.next();
		obj2.setName(a);
		
		System.out.print("첫번째 물체 부피를 입력:");
		b=scan.nextInt();
		obj1.setVolume(b);
		
		System.out.print("두번째 물체 부피를 입력:");
		b=scan.nextInt();
		obj2.setVolume(b);
		
		System.out.print("첫번째 물체 질량을 입력:");
		b=scan.nextInt();
		obj1.setWeight(b);
		
		System.out.print("두번째 물체 질량을 입력:");
		b=scan.nextInt();
		obj2.setWeight(b);
		
		density1=obj1.density();
		density2=obj2.density();
		gap=density1-density2;
		
		if(density1>density2) {
			System.out.print(obj1.name+"의 밀도가 "+density1+"이고, "+Math.abs(gap)+"만큼 차이난다.");
		}
		
		else if(density1<density2) {
			System.out.print(obj2.name+"의 밀도가 "+density2+"이고, "+Math.abs(gap)+"만큼 차이난다.");
		}
		else if(density1==density2) {
			System.out.print("밀도가 "+density1+"으로 서로 같다.");
		}
	}
}
