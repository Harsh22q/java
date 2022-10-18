import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.Timer;
import java.awt.event.ActionListener;


public class quest1 extends JFrame implements ActionListener
{
   private JLabel l1 ;
 void quest2()
    {
    
       setTitle("Frames");
         l1=new JLabel(" Hello World ");
         l1.setHorizontalAlignment(JLabel.CENTER);
         l1.setVerticalAlignment(JLabel.CENTER);
         add(l1);
        l1.setForeground(Color.magenta);
        l1.setFont(new Font("Arial", 0, 25));
        add(l1, BorderLayout.CENTER);
        
        
    }
    void time ()
    {
        quest2();
        Timer a1=new Timer(400,(java.awt.event.ActionListener) this);
        a1.start();
        setSize(500,400);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e)
     {
        
        String oldText = l1.getText();
        String newText= oldText.substring(1)+ oldText.substring(0,1);
        l1.setText(newText);
    }
    
    public static void main(String[] args) 
    { 
        // new quest1();
        quest1 a2=new quest1();
        a2.time();
    }

   
}