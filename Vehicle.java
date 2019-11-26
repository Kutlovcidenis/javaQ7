public abstract class Vehicle {
    
     
    private String Brand;                                               // Attributes
    private int Kilometers;
    
    
    public Vehicle (String Brand) {                                     // Constructor 1 allows to set Brand
        this.Brand = Brand;
        this.Kilometers = 20000;
    }
    public void setBrand(String Brand) {                                // Setter Brand
        this.Brand = Brand; 
    }
    public void setKilometers(int Kilometers) {                         // Setter Kilometers
        this.Kilometers = Kilometers;
    }
    public String getBrand() {                                          // Getter Brand
        return this.Brand;
    }
    public int getKilometers() {                                        // Getter Kilometers
        return this.Kilometers;
    }
    
    public abstract String doStuff();                                   // abstract method
}    
