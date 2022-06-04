import java.awt.*;

public class Block1 {
    private Rectangle[] rectangles = new Rectangle[4];
    Block1(Point p){
        rectangles[0] = new Rectangle(p);
        rectangles[1] = new Rectangle(new Point(p.x+Rectangle.WIDTH, p.y));
        rectangles[2] = new Rectangle(new Point(p.x, p.y+Rectangle.HEIGHT));
        rectangles[3] = new Rectangle(new Point(p.x + Rectangle.WIDTH, p.y + Rectangle.HEIGHT));
    }
    Block1(int x, int y){
        rectangles[0] = new Rectangle(new Point(x, y));
        rectangles[1] = new Rectangle(new Point(x+Rectangle.WIDTH, y));
        rectangles[2] = new Rectangle(new Point(x, y+Rectangle.HEIGHT));
        rectangles[3] = new Rectangle(new Point(x+Rectangle.WIDTH, y+Rectangle.HEIGHT));
    }
    void translate(int x, int y){
        for(int i = 0; i<4; i++){
            rectangles[i].translate(x, y);
        }
    }
    public String toString(){
        return rectangles[0].toString()+rectangles[1].toString()+rectangles[2].toString()+rectangles[3].toString();
    }
}
