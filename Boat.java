   
    
public class boat extends Vehicle {                                     // Subclass boat - framwork from PC Vehicle
        

    public boat (String Brand) {                      
        super(Brand);
    }    
        @Override 
        public String doStuff(){
             return ("I'm " + this.getBrand() + " and I go glug glug! ");
    }        
}
