import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Polygon;

import javax.swing.JPanel;
 
public class MyPanelClass extends JPanel {
            /**
	 * 
	 */
	private static final long serialVersionUID = 7057541440811488699L;

			public void paintComponent(Graphics g) {
                        super.paintComponent(g);
 
                        //Compute interior coordinates
                        Insets myInsets = this.getInsets();
                        int x1 = myInsets.left;
                        int y1 = myInsets.top;
                        int x2 = getWidth() - myInsets.right - 1;
                        int y2 = getHeight() - myInsets.bottom - 1;
                        int width = x2 - x1;
                        int height = y2 - y1;
 
                        //Paint the background
                        g.setColor(Color.RED);
                        g.fillRect(x1, y1, width +1, height +1);
                        
                        g.setColor(Color.WHITE);           
                        g.fillRect(x1 , y1 + height/5 , width+1, height);
              
                        g.setColor(Color.RED);           
                        g.fillRect(x1 , y1 + height/5 + height/5 , width+1, height);
                        
                        g.setColor(Color.WHITE);           
                        g.fillRect(x1 , y1 + height/5 + height/5 + height/5 , width+1, height);
                        
                        g.setColor(Color.RED);           
                        g.fillRect(x1 , y1 + height/5 + height/5 + height/5 + height/5 , width+1, height);
                        
                        g.setColor(Color.BLUE);
                        g.drawLine(x1, y1, width/2, height/2);
                        
                        g.setColor(Color.BLUE);
                        g.drawLine(x1, y2, width/2, height/2); 
                        
                        Polygon p3 = new Polygon ();
                        p3.addPoint(x1, y1);
                        p3.addPoint(x1, y2); 
                        p3.addPoint(x1 + width/2, y1 + height/2);
                        g.setColor(Color.blue);
                        g.fillPolygon(p3);
                                              
                        
                        
                        Polygon p2 = new Polygon();
                        
                       
                        
                       p2.addPoint(x1 + 65, y1 + 113);
                        p2.addPoint(x1 + 81, y1 + 113);
                        p2.addPoint(x1 + 87, y1 + 98);
                        p2.addPoint(x1 + 93, y1 + 113);
                        p2.addPoint(x1 + 109, y1 + 113);
                        p2.addPoint(x1 + 96, y1 + 123);
                        p2.addPoint(x1 + 101, y1 + 138);
                        p2.addPoint(x1 + 87, y1 + 128);
                        p2.addPoint(x1 + 74, y1 + 138);
                        p2.addPoint(x1 + 78, y1 + 123); 
                        g.setColor(Color.WHITE);
                        g.fillPolygon(p2);
                                              
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
                        
			}
}