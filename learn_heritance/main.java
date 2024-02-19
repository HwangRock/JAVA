package learn_heritance;

import java.util.Scanner;


public class main {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("구하고자하는게 원입니까?(맞으면 1을 입력, 아니면 1이 아닌 수를 입력)");
        int want=scan.nextInt();
        if(want==1){
            System.out.print("원의 반지름의 길이는?");
            int how=scan.nextInt();
            Circle c=new Circle();
            c.getRadius(how);
            System.out.print("해당 원의 넓이: "+Math.round(c.getArea())+"\n");
            System.out.print("해당 원의 둘레: "+c.getperiphery());
        }
        else{
            System.out.print("몇각형을 구하고자 합니까?");
            int how=scan.nextInt();
            Regular_polygon p=new Regular_polygon();
            p.getN(how);
            System.out.print("다각형의 한 변의 길이는?");
            int l=scan.nextInt();
            p.length=l;
            System.out.print("해당 도형의 넓이: "+Math.round(p.getArea())+"\n");
            System.out.print("해당 도형의 둘레: "+p.getperiphery());
        }
    }
}
