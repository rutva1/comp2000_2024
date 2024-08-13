import java.awt.Graphics;

import java.awt.Point;


public class Trail {
    Circle[] circles=new Circle[100];
    


    public Trail(){
        
    }
    
    public void paint(Graphics g,Point mousePos) {
        
            for(int i=0; i<circles.length; i++){
    
                circles[i]=new Circle(i+mousePos.x,i+mousePos.y);
                
                
      circles[i].paint(g, mousePos);
        }
    }
}
