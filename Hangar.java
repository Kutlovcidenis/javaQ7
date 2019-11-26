
public class Hangar {                                                   // Class with main method inside
    public static void main(String[] args) {
    
    car Clio = new car("Clio");                                         // Declares new object of car
        System.out.println(Clio.doStuff());                             // Prints out our abstract method
        System.out.println("");                                         // Break between Clio & QE
        
    boat QE = new boat ("Queen Elizabeth");
        System.out.println (QE.doStuff());
    	
    }
}    
