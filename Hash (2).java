import java.util.Scanner;
public class Hash {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("문자 다섯 개을 한 줄에 한 개씩 입력하세요\n");
        double[] hash=new double[5];
        double hashSum=0;

        char[] s=new char[5];
        for(int i=0;i<5;i++){
            s[i]=sc.next().charAt(0);
            for(int a=0; a<5; a++){
                hash[a]=s[a]*Math.pow(31,4-a);
            }

        }
        for(int b=0;b<5;b++){
            hashSum+=hash[b];
        }

        System.out.printf("문자열 %c%c%c%c%c의 해시 값은 %.2f입니다.\n",s[0], s[1], s[2], s[3], s[4], hashSum);



        }

    }

