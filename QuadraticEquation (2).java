import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("a를 입력하세요: ");
        int a=sc.nextInt();
        System.out.println("a: "+a);
        System.out.println("b를 입력하세요: ");
        int b=sc.nextInt();
        System.out.println("b: "+b);
        System.out.println("c를 입력하세요: ");
        int c=sc.nextInt();
        System.out.println("c: "+c);
        double x1, x2;
        x1 = (-b+Math.sqrt(b*b-4*a*c))/2*a;
        x2 = (-b-Math.sqrt(b*b-4*a*c))/2*a;

        System.out.printf("x1 = %f\n",x1);
        System.out.printf("x2 = %f\n",x2);


    }

}
