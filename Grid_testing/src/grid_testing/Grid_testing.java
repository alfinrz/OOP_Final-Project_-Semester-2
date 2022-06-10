package grid_testing;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.util.Scanner;
public class Grid_testing {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        System.out.println("please enter column lenght");
        int column_count = read.nextInt();
        System.out.println("please enter row width");
        int row_count = read.nextInt();
        
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(new GridLayout(column_count,row_count,0,0));
        
        System.out.println("Please enter amount of seats present");
        int seat_count = read.nextInt();
        
        for(int i = 0; i < seat_count ; i++){
            int f = 0;
            frame.add(new JButton(f++));}
        
        
        frame.setVisible(true);
    }
    
}
