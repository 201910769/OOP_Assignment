import java.awt.*;

public class Rectangle {
    public static final int WIDTH = 50;
    public static final int HEIGHT = 50;
    private Point upperLeft = new Point(0,0);
    private Point lowerRight = new Point(0,0);
    Rectangle(Point uL){
        this.upperLeft = uL;
        this.lowerRight.x = uL.x + WIDTH;
        this.lowerRight.y = uL.y + HEIGHT;
    }
    Rectangle(Point ul, Point lR){
        this.upperLeft = ul;
        this.lowerRight = lR;
    }
    public void translate(int x, int y){
        upperLeft.translate(x, y);
        lowerRight.translate(x, y);
    }
    public String toString(){
        return "UL: " + upperLeft + ", LR: " + lowerRight + "\n";
    }
}
