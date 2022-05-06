import java.util.Scanner;

public class VolumeOfTruncatedCone {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("R1을 입력하세요: ");
        double R1=sc.nextDouble();
        System.out.println("R2를 입력하세요: ");
        double R2=sc.nextDouble();
        System.out.println("Height를 입력하세요: ");
        double H=sc.nextDouble();

        double V;
        System.out.printf("원뿔대의 부피는:%f",3.14/3*(R1*R1+R1*R2+R2*R2)*H);

    }
}
