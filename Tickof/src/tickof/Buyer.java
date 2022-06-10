package tickof;
public abstract class Buyer {
    private String name;
    private String amount;
    
    public Buyer(String name, String amount){
        this.name = name;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public String getAmount() {
        return amount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }
    
}
