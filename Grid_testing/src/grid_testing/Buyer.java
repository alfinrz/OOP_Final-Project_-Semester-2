package grid_testing;
public abstract class Buyer {
    private String name;

    
    public Buyer(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

//    public String getAmount() {
//        return amount;
//    }

    public void setName(String name) {
        this.name = name;
    }

//    public void setAmount(String amount) {
//        this.amount = amount;
//    }
    
}
