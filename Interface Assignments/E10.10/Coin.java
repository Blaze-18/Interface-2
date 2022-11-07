public class Coin implements Comparable<Coin> {

    private double value;
    
    private String name;
    
     
    
    /**
    
    * Constructs a coin.
    
    * 
    
    * @param aValue
    
    *            the monetary value of the coin
    
    * @param aName
    
    *            the name of the coin
    
    */
    
    public Coin(double aValue, String aName) {
    
    value = aValue;
    
    name = aName;
    
    }
    
     
    
    /**
    
    * Gets the coin value.
    
    * 
    
    * @return the value
    
    */
    
    public double getValue() {
    
    return value;
    
    }
    
     
    
    /**
    
    * Gets the coin name.
    
    * 
    
    * @return the name
    
    */
    
    public String getName() {
    
    return name;
    
    }
    
     
    
    //method of Comparable interface to define the comparing criteria.
    
    @Override
    
    public int compareTo(Coin arg0) {
    
    if(this.value > arg0.value) {
    
    return 1;
    
    } else if(this.value < arg0.value) {
    
    return -1;
    
    }
    
    return 0;
    
    }
    
    }