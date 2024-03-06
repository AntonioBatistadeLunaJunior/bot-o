
package loucura;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ButtonFrame extends JFrame {
    
    
    private JButton plainButton;
    private JButton fancyButton;
    
    public ButtonFrame(){
        super("Testando botões alheios");
        setLayout( new FlowLayout() );
        
        
        plainButton = new JButton ("Botão plain");
        add ( plainButton);
        
        Icon bug1 = new ImageIcon ( getClass().getResource("jóia.jpg"));
        Icon bug2 = new ImageIcon ( getClass().getResource( "crumb-cat.gif"));
        fancyButton = new JButton( "botão fancy", bug1);
        fancyButton.setRolloverIcon (bug2);
        add (fancyButton);
        
        ButtonHandler handler = new ButtonHandler();
        fancyButton.addActionListener(handler);
        plainButton.addActionListener(handler);
    }
    private class ButtonHandler implements ActionListener{
    
        public void actionPerformed (ActionEvent event){
        
            JOptionPane.showMessageDialog(ButtonFrame.this,String.format("Voce pressionou %S", event.getActionCommand()));
        }
    }
}

    
