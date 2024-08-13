import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public class Circle{
static int SIZE=22;
int x,y;

    public Circle(int x,int y){
 this.x=x;
 this.y=y;
        }

    public void paint(Graphics g, Point mousePos){
        g.setColor(Color.GRAY);
        
       g.drawArc(x,y,SIZE,SIZE,0,360);
      }
}