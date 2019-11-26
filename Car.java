  
public class car extends Vehicle {                                      // Subclass Car - framework from PC Vehicle
    
    public car (String Brand){                                          // Constructor + super (takes from PC)
        super(Brand);
       
    }
        @Override                                                       //Abstr. method declared in PC, defined here 
        public String doStuff(){
            return ("I'm " + this.getBrand() + " and I go zoom zoom zoom! ");
    }        
}    
    
    
    
