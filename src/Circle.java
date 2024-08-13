
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public class Circle{
static int SIZE=8;
int x,y;

    public Circle(int x,int y){
 this.x=x;
 this.y=y;
        }

    public void paint(Graphics g, Point mousePos){
        g.setColor(Color.GRAY);
        g.fillArc(x,y,SIZE,SIZE,0,360);
       g.drawArc(x,y,SIZE,SIZE,0,360);
      }
}