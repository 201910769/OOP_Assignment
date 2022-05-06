

public class Main {
    public static void main(String[] args) {
        CardDeck cd = new CardDeck();
        cd.print();
        cd.deal(0);
        cd.print();
        cd.deal(1);
        cd.print();
    }
}

class CardDeck{
    int Num = 3;
    String shape = "/\\\n"+"\t"+"\\/";
    int[] arr = new int[3];
    CardDeck(){
        arr[0] = (int)Math.floor(Math.random()*9)+2;
        arr[1] = (int)Math.floor(Math.random()*9)+2;
        arr[2] = (int)Math.floor(Math.random()*9)+2;
    }
    void print(){
        System.out.println("남아있는 카드의 수는:"+Num);
    }
    void deal(int i){
        System.out.println(arr[i]+"\t"+shape);
        Num--;
    }

}
