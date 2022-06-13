package grid_testing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.util.Scanner;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class Grid_testing implements ActionListener {
        private JFrame main_frame;
        private JLabel label; 
        private JButton button;
        private ImageIcon icon;
        private JPanel panel;
        private JTextField buyer_name;
        JPanel seat_booking = new JPanel();
        JLabel seat_label = new JLabel("Seats booked: ");

        public Grid_testing(){
    ArrayList<JButton> buttonlist = new ArrayList<JButton>();

        
        
        buyer_name = new JTextField(50);
        main_frame = new JFrame();
        label = new JLabel("TICKOF");
        panel = new JPanel();

//        button.addActionListener(this);
        
        Scanner read = new Scanner(System.in);
        
        System.out.println("please enter column lenght");
        int column_count = read.nextInt();
        System.out.println("please enter row width");
        int row_count = read.nextInt();
        
        panel.setBorder(BorderFactory.createMatteBorder(0,0,0,0, Color.black));
        panel.setLayout(new GridLayout(0,1));
        panel.add(label);
        panel.add(buyer_name);
        buyer_name.setBounds(100,20,300,25);
        seat_booking.add(seat_label);
        
        main_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        main_frame.setSize(1920,720);
        main_frame.setLayout(new GridLayout(column_count,row_count,0,0));
        main_frame.setTitle("TICKOF");

        main_frame.add(panel, BorderLayout.CENTER);
        
        System.out.println("Please enter amount of seats present");
        int seat_count = read.nextInt();
        int f = 0;
        for(int i = 0; i < seat_count ; i++){
            icon = new ImageIcon("C:\\Users\\alfin\\Desktop\\Icons\\rsz_seatavailable.png");
            JButton seat_button = new JButton(icon); 

            f++;
            String s = String.valueOf(f);
            label = new JLabel(s);
            icon = new ImageIcon("C:\\Users\\alfin\\Desktop\\Icons\\rsz_seatavailable.png");
            
            seat_button.addActionListener(this);
            seat_button.setActionCommand(s);
            buttonlist.add(seat_button);

            panel = new JPanel();
            panel.setBorder(BorderFactory.createLineBorder(Color.black));
            panel.add(seat_button);
            panel.add(label);
            main_frame.add(panel);
            main_frame.setVisible(true);
        }
            
}
    public static void main(String[] args) {
        new Grid_testing();


    }
//When a button is click this function shall run.
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.getActionCommand());
//        String s_i = String.valueOf(e);
        seat_label.setText("Seats booked: "+ e.getActionCommand());
        main_frame.add(seat_booking);
        
        
    }
    
}
