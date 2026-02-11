//Angie Alvarez
// 2-9-2026
// Hotdog class for my Hotdog object

public class Hotdog { 

    //data variables
    private String type;
    private int toppings;
    private String meat;

    // Constructors
    public Hotdog() {            // default constructor
        type = "Unknown";
        toppings = 1;
        meat = "Combination";
    }

    public Hotdog(String type, int toppings, String meat) { // parameterized constructor
        this.type = type;
        this.toppings = toppings;
        this.meat = meat;
    }

    public String getType() { 
        return type; 
    }

    public void setType(String type) { 
        this.type = type; 
    }

    public int getToppings() { 
        return toppings; 
    }
    public void setToppings(int toppings) { 
        // simple guard (optional)
        if (toppings >= 0) 
            this.toppings = toppings;
    }

    public String getMeat() { 
        return meat; 
    }
    public void setMeat(String meat) { 
        this.meat = meat; 
    }  

    @Override
    public String toString() {
        return "Hotdog{type='" + type + "', toppings=" + toppings + ", meat='" + meat + "'}";
    }

}// end Hotdog class