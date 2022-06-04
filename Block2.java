import java.awt.*;

public class Block2 {
    private Rectangle[] rectangles = new Rectangle[4];
    Block2(Point p){
        rectangles[0] = new Rectangle(p);
        rectangles[1] = new Rectangle(new Point(p.x, p.y+Rectangle.HEIGHT));
        rectangles[2] = new Rectangle(new Point(p.x, p.y+2*Rectangle.HEIGHT));
        rectangles[3] = new Rectangle(new Point(p.x, p.y+3*Rectangle.HEIGHT));
    }
    Block2(int x, int y) {
        rectangles[0] = new Rectangle(new Point(x, y));
        rectangles[1] = new Rectangle(new Point(x, y + Rectangle.HEIGHT));
        rectangles[2] = new Rectangle(new Point(x, y + 2 * Rectangle.HEIGHT));
        rectangles[3] = new Rectangle(new Point(x, y + 3 * Rectangle.HEIGHT));
    }
    void translate(int x, int y){
        for(int i=0; i<4; i++){
            rectangles[i].translate(x, y);
        }
    }
    public String toString(){
        return rectangles[0].toString()+rectangles[1].toString()+rectangles[2].toString()+rectangles[3].toString();
    }
}
