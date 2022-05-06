import java.util.Scanner;

public class Assinment06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("총 횟수:");
        int n = sc.nextInt();
        DiceProbability dicepro = new DiceProbability(n);

    }
}

class Dice{
   int roll(){
        return (int)Math.floor(Math.random()*6 + 1);
    }
}

class DiceProbability {
    int[] arr;
    double[] pby = new double[6];
    int dice1 = 0, dice2 = 0, dice3 = 0, dice4 = 0, dice5 = 0, dice6 = 0;

    DiceProbability(int n) {
        arr = new int[n];
        Dice d = new Dice();
        for (int i = 0; i < n; i++) {
            arr[i] = d.roll();
        }
        calcProbability(n);
        printProbability(dice1, dice2, dice3, dice4, dice5, dice6);
        init();
    }
    void calcProbability(int n){
        for(int i =0; i<n; i++){
            if (arr[i] == 1) {
                dice1++;
            } else if (arr[i] == 2) {
                dice2++;
            } else if (arr[i] == 3) {
                dice3++;
            } else if (arr[i] == 4) {
                dice4++;
            } else if (arr[i] == 5) {
                dice5++;
            } else{
                dice6++;
            }
        }
        pby[0] = dice1 / (double)n;
        pby[1] = dice2 / (double)n;
        pby[2] = dice3 / (double)n;
        pby[3] = dice4 / (double)n;
        pby[4] = dice5 / (double)n;
        pby[5] = dice6 / (double)n;

    }
    void printProbability(int dice1, int dice2, int dice3, int dice4, int dice5, int dice6){
        System.out.println("주사위 1: " + dice1 + " 비율: " + pby[0]);
        System.out.println("주사위 2: " + dice2 + " 비율: " + pby[1]);
        System.out.println("주사위 3: " + dice3 + " 비율: " + pby[2]);
        System.out.println("주사위 4: " + dice4 + " 비율: " + pby[3]);
        System.out.println("주사위 5: " + dice5 + " 비율: " + pby[4]);
        System.out.println("주사위 6: " + dice6 + " 비율: " + pby[5]);
    }
    void init(){
        int[] arr;
        double[] pby = new double[6];
        int dice1 = 0, dice2 = 0, dice3 = 0, dice4 = 0, dice5 = 0, dice6 = 0;
    }
}
