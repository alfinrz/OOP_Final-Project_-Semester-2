package grid_testing;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Grid_creator {
    ArrayList<JButton> buttonlist = new ArrayList<JButton>();
    ArrayList<String> seating_booked = new ArrayList<>();
    
    
    
    int f = 0;
    for(int i = 0; i < seat_count ; i++){
        buttonlist.add(button);
        f++;
        String s = String.valueOf(f);
        label = new JLabel(s);
            
        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(50,0,0,10));
        panel.add(button);
        panel.add(label);
        frame.add(panel);
            
            }
}

//        int f = 0;
//        for(int i = 0; i < seat_count ; i++){
//            buttonlist.add(button);
//            f++;
//            String s = String.valueOf(f);
//            label = new JLabel(s);
//            
//            panel = new JPanel();
//            panel.setBorder(BorderFactory.createEmptyBorder(50,0,0,10));
//            panel.add(button);
//            panel.add(label);
//            frame.add(panel);
//            
//            }
//        frame.setLayout(new FlowLayout(0,0,0,0));    
//        frame.add(panel, BorderLayout.CENTER);

//        for(int i = 0; i < seat_count ; i++){
//            icon = new ImageIcon("C:\\Users\\alfin\\Desktop\\Icons\\rsz_seatavailable.png");
//            button = new JButton(icon);
//            buttonlist.add(button);
//            f++;
//            String s = String.valueOf(f);
//            seat_label = new JLabel(s);
//            
//            frame.add(new JButton(icon), new JLabel(s));
//            
//            }
        
        //            for(int i = 0; i < seat_count ; i++){
//            f++;
//            String s = String.valueOf(f);
//            icon = new ImageIcon("C:\\Users\\alfin\\Desktop\\Icons\\rsz_seatavailable.png");
//            button = new JButton(icon + s);
//            buttonlist.add(button);
//            seat_label = new JLabel(s);
//
//            
//            frame.add(button);
//            
//            }