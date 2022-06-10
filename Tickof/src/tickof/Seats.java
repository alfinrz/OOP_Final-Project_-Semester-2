package tickof;

import java.util.ArrayList;

public class Seats extends Buyer {
    private ArrayList<String> seating_left = new ArrayList<>();
    private ArrayList<String> seating_booked = new ArrayList<>();
    
    public Seats(String name, String amount){
        super(name, amount);
    }
    
    public void addSeating(String seating_left){
        this.seating_left.add(seating_left);
    }

    public ArrayList<String> getSeating_left() {
        return seating_left;
    }

    public ArrayList<String> getSeating_booked() {
        return seating_booked;
    }
    
    public boolean bookSeating(String seating_book){
        if(seating_left.contains(seating_book)){
            this.seating_booked.add(seating_book);
            this.seating_left.remove(seating_book);
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
        return "Seats{" + "seating_left=" + seating_left + ", seating_booked=" + seating_booked + '}';
    }
    
    
}
