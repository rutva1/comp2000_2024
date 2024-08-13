import java.awt.Graphics;

import java.awt.Point;


public class Trail {
    
    int[] xpos = new int[100];
    int[] ypos = new int[100];

    

    public Trail(){
        
    }
    
    public void paint(Graphics g,Point mousePos) {
        for (int i = 0; i < xpos.length-1; i ++ ) {

            xpos[i] = xpos[i+1];
            ypos[i] = ypos[i+1];
          }
        xpos[xpos.length-1] = mousePos.x; // Update the last spot in the array with the mouse location.
  ypos[ypos.length-1] = mousePos.y;
  for (int i = 0; i < xpos.length; i ++ ) {
        Circle circle = new Circle(xpos[i],ypos[i]);
  
                
      circle.paint(g, mousePos);
        
    }
}
}
