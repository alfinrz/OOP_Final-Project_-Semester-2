package tickof;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class Tickof implements ActionListener {
    
    private int count = 0;
    private JFrame frame;
    private JButton button;
    private JLabel label;
    private JPanel panel;
    private JTextField buyer_Name;
    
    public Tickof(){
    frame = new JFrame();
    button = new JButton("Click me");
    button.addActionListener(this);
    label = new JLabel("Number of clicks: 0");
    buyer_Name = new JTextField(20);
    
    panel = new JPanel();
    panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
    panel.setLayout(new GridLayout(0,1));
    panel.add(button);
    panel.add(label);
    panel.add(buyer_Name);
    buyer_Name.setBounds(100,20,300,25);
    
    
    frame.add(panel, BorderLayout.CENTER);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setTitle("Our GUI");
    frame.pack();
    frame.setVisible(true);
    frame.setSize(1280,720);

//    frame = new JFrame("Tickof App Login");
//    frame.setSize(350,200);
//    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//    
//    panel = new JPanel();
//    frame.add(panel);
//    placeComponents(panel);
//    frame.setVisible(true);
    
    }
//    private static void placeComponents(JPanel panel){
//        panel.setLayout(null);
//        
//        JLabel userLabel = new JLabel("User");
//        userLabel.setBounds(10,20,80,25);
//        panel.add(userLabel);
//    }
    
    
    
    
    public static void main(String[] args) {
        
        new Tickof();
        
        Seats as1 = new Seats("Admin", "50");
        as1.addSeating("R1");
        as1.addSeating("R2");
        as1.addSeating("R3");
        as1.addSeating("R4");
        as1.addSeating("R5");
        as1.addSeating("R6");
        as1.addSeating("R7");
        as1.addSeating("R8");
        as1.addSeating("R9");
        as1.addSeating("F1");
        as1.addSeating("F2");
        as1.addSeating("F3");
        as1.addSeating("F4");
        
        as1.bookSeating("F4");
        as1.bookSeating("F4");

        as1.getSeating_left();
        System.out.println(as1.toString());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        label.setText("Number of clicks: "+ count);
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
