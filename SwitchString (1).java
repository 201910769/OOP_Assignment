import java.util.Scanner;

public class SwitchString {
    public static void main(String[] args){
        String s = "Let's meet in my office at 10";
        System.out.println("다음 문장에서 문자열을 바꾸는 프로그램입니다.");
        System.out.println("원본 문장: "+s);
        System.out.println("문장에서 바꾸고 싶은 문자열을 입력하세요");
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        System.out.println("새로운 문자열을 입력하세요:");
        String b = sc.nextLine();
        String newString = s.replace(a, b);
        System.out.println("새로운 문장:"+newString);




    }
}
