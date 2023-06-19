package amogus;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/* @author -Carl Vincent Bragais- */
public class Amogus extends JFrame implements ActionListener   
{ 
    static JTextField jTF, jTF2;
    static JTextArea jTA;
    static JLabel jLA, jLCB, jL, jL2;
    static JButton jB, jB2;
    static JFrame jF;
    static JComboBox jDcb;
    
Amogus()
{}
public static void main(String[] args) {
    
    String Diseases[]={"Learning disability", "Intellectual disability", "Hearing impairment"
,"Autistic Spectrum Disorders", "Multiple disabilities", "Deafblindness", "Visual impairment"
,"Developmental delay", "Physical disability", "Traumatic brain injury", "Cerebral palsy"
,"Language disorder", "Dyslexia", "Orthopedic impairment", "Behavioral Disorders", "Blindness"
,"Health", "Attention deficit hyperactivity disorder", "Deafness", "Mental disorder"
,"Dyscalculia", "Dysgraphia", "Muscular dystrophy", "Specific language impairment"};
    
Amogus te = new Amogus(); 
//Component Instantiation
      jF = new JFrame("PWD Profiling");
      //TFields
      jTF = new JTextField("Type here...",20);
      jTF2 = new JTextField("Type here...",20);
      jTA = new JTextArea( "Type here...",10, 20);
      //Labels
      jL = new JLabel("Valid ID:"); 
      jL2 = new JLabel("ID Number:"); 
      jLCB = new JLabel("Type Of Disability:"); 
      jLA = new JLabel("Other Medical Conditions: "); 
      //Buttons
      jB = new JButton("Submit");    
      jB2 = new JButton("Clear");
      JPanel jP = new JPanel();       
      //DropDown
      jDcb = new JComboBox(Diseases); 
      
      //Action Listener
      jB.addActionListener(te);
      jB2.addActionListener(te);
      //Fonts
      Font fo = new Font("Serif", Font.BOLD , 12);
      jTA.setFont(fo); jTF.setFont(fo); jTF2.setFont(fo); jLCB.setFont(fo);
      jL.setFont(fo); jL2.setFont(fo); jLA.setFont(fo); jDcb.setFont(fo);
      
      //Frame Properties
      jF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      jF.setSize(450, 590);
      jF.setVisible(true); 
      //Panel Properties
      jP.setBackground(Color.LIGHT_GRAY);
      jP.setSize(450, 590);
      jP.setLayout(null);
      jF.add(jP);
      
      //Text to Panel
      jP.add(jTA); jP.add(jTF); jP.add(jTF2); 
      //Labels to Panel
      jP.add(jLA); jP.add(jLCB); jP.add(jL); jP.add(jL2); 
      //Buttons to Panel
      jP.add(jB); jP.add(jB2);
      //Dropdown to Panel
      jP.add(jDcb);
      
                     //Bounds&Sizes
      //Labels
      jL.setBounds(40, 75, 200, 25);
      jL2.setBounds(40, 125, 200, 25);
      jLCB.setBounds(40, 175, 200, 25); 
      jLA.setBounds(40, 250, 200, 25);
      //TextFields
      jTF.setBounds(155, 75,225, 25);  
      jTF2.setBounds(155, 125,225 , 25);
      jDcb.setBounds(155, 175,225 , 25);
      jTA.setBounds(155, 300,225 , 100);
      //Buttons
      jB.setBounds(100, 450,75 , 25);
      jB2.setBounds(251, 450,75 , 25);    
}

    @Override
    public void actionPerformed(ActionEvent e) {
String s = e.getActionCommand();
       if (s.equals("Submit")) 
       {
            jTF.setText(" ");
            jTF2.setText(" ");
            jTA.setText(" ");
            JOptionPane.showMessageDialog(null,"Your Response has been Recorded!"); 
       }
       else if (s.equals("Clear")) 
       {
            jTF.setText(" ");
            jTF2.setText(" ");
            jTA.setText(" ");    
       JOptionPane.showMessageDialog(null,"Cleared!");
       }
    
}
}
