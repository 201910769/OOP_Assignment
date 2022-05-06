import java.util.Scanner;

public class Assigment07 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        switch (s){
            case "CJ ONE 삼성카드":
                System.out.printf("%d ", CardType.CJONE_SAMSUNG.a);
                System.out.printf("%d", CardType.CJONE_SAMSUNG.b);
                break;
            case "CJ ONE 신한카드":
                System.out.printf("%d ", CardType.CJONE_SHINHAN.a);
                System.out.printf("%d", CardType.CJONE_SHINHAN.b);
                break;
            case "The CJ":
                System.out.printf("%d ", CardType.THE_CJ.a);
                System.out.printf("%d", CardType.THE_CJ.b);
                break;
            case "삼성 6 V4":
                System.out.printf("%d ", CardType.SAMSUNG_6_V4.a);
                System.out.printf("%d", CardType.SAMSUNG_6_V4.b);
                break;
            case "신한 Lady":
                System.out.printf("%d ", CardType.SHINHAN_LADY.a);
                System.out.printf("%d", CardType.SHINHAN_LADY.b);
                break;
            case "KB Star":
                System.out.printf("%d ", CardType.KB_STAR.a);
                System.out.printf("%d", CardType.KB_STAR.b);
                break;
            case "이마트 KB":
                System.out.printf("%d ", CardType.EMART_KB.a);
                System.out.printf("%d", CardType.EMART_KB.b);
                break;
        }

    }
}

enum CardType{CJONE_SAMSUNG(30, 1), CJONE_SHINHAN(30, 1), THE_CJ(20, 2), SAMSUNG_6_V4(20, 0),
    SHINHAN_LADY(20, 0), KB_STAR(20, 0), EMART_KB(15, 0);

    int a;
    int b;
    CardType(int a, int b) {
        this.a = a;
        this.b = b;
    }
}
