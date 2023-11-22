
import java.awt.*;    
import java.awt.event.*;    
  
// class which inherits the Frame class  
public class Solution extends Frame {    
// class constructor  
    Solution() {    

        Label l1 = new Label("Enter the Name:- ");
        l1.setBounds(100,50, 200, 100);

        TextField tf= new TextField();
        tf.setBounds(100, 150, 200, 50);

        Button b1 = new Button("Click me");
        b1 .setBounds(100,200,100,40);

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                tf.setText("Satyam Garg");
            }
        });
        
// adding WindowListener to the Frame  
// and using the windowClosing() method of WindowAdapter class  
        addWindowListener (new WindowAdapter() {    
            public void windowClosing (WindowEvent e) {    
                dispose();    
            }    
        });  
        add(l1); 
        add(tf);
        add(b1); 
// setting the size, layout and visibility of frame  
        setSize (400, 400);    
        setLayout (null);    
        setVisible (true);    
    }    
// main method  
    public static void main (String[] args) {    
        new Solution();    
    }  
}  