import java.awt.Color;
import java.awt.Font;
import static java.awt.Font.BOLD;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author ccs
 */
public class zoom extends JPanel{  
  
    
    private static final int[] arr = null;


   public void paint(Graphics gp)
    {
        super.paint(gp);
        
      
        
        Graphics2D g2d= (Graphics2D) gp;
        g2d.setColor(Color.RED);
        g2d.setFont(new Font("BOLD", BOLD, 35));
             
        g2d.drawString("H", arr[0], 150);
        g2d.drawString("A", 220, arr[1]);
        g2d.drawString("P", arr[2], 150);
        g2d.drawString("P", 280, arr[3]);
        g2d.drawString("Y", arr[4], 150);
        
        
        

        try {
            
            Thread.sleep(100);
            
            if(arr[0]<190 && arr[2]>250 && arr[4]<310 && arr[2]<150 &&arr[3]>15 )
            {
            arr[0]+=5;
            arr[1]+=5;           
            arr[2]-=5;
            arr[3]-=5;
            arr[4]+=5;
            
            }
            else
            {
            arr[0]=190;
            arr[1]=150;
            arr[2]=250;
            arr[3]=150;
            arr[4]=310; 
            }
            
            
        } catch (Exception e) {
        }
            
        repaint();
    
       
        
    }
    
    
    public static void main(String[] args) {
      int arr[]=new int []{40,0,400,300,160};
      
        JFrame jf = new JFrame();
        jf.setSize(500, 500);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.add(new zoom());
        jf.setLocationRelativeTo(null);
        jf.setVisible(true);
    }
    
     
    
}