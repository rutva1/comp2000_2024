import java.awt.Graphics;

public class Cell {
static int SIZE=35;
public int x,y;

public Cell(int x,int y){
this.x=x;
this.y=y;
}
public void paint(Graphics g){
    g.drawRect(x,y,SIZE,SIZE);
}
}



