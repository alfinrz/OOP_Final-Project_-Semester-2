package grid_testing;

import java.util.ArrayList;
import javax.swing.JButton;

public class Seats extends Buyer {
    ArrayList<JButton> buttonlist = new ArrayList<JButton>();
    private ArrayList<String> seating_booked = new ArrayList<>();
    
    public Seats(String name){
        super(name);
    }
    


    public ArrayList<String> getSeating_left() {
        return seating_left;
    }

    public ArrayList<String> getSeating_booked() {
        return seating_booked;
    }
    
    public boolean bookSeating(String seating_book){
        if(buttonlist.contains(seating_book)){
            this.seating_booked.add(seating_book);
            this.buttonlist.remove(seating_book);
            System.out.println(seating_booked + " These are the seats that has been booked");
            return true;
        }if(seating_booked.contains(seating_book)){
            System.out.println("These seat has been booked");
            return false;
        }else{
            System.out.println("input is invalid");
            return false;
        }
    }

    @Override
    public String toString() {
        return "Seats{" + "seating_left=" + buttonlist + ", seating_booked=" + seating_booked + '}';
    }
    
    
}
