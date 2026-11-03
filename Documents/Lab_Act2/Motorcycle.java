public class Motorcycle extends Vehicle {
   private String typeOfEngine;
      
      public Motorcycle (
         String brand,
         String model,
         int year,
         String typeOfEngine
         ) { 
            super(brand, model, year);
            this.typeOfEngine = typeOfEngine;
         }
         
     @Override
     public void displayInfo() {
      super.displayInfo();
      System.out.println("Type of Engine: " + typeOfEngine);
      }
      
     @Override
     public void moveForward() {
     System.out.println("A Motorcycle moves Forward.");
    }
     @Override 
     public void moveBackward() {
     System.out.println("A Motorcycle moves Backward.");
    }
     @Override 
     public void moveLeft() {
     System.out.println("A Motorcycle moves Left.");
    }
     @Override 
     public void moveRight() {
     System.out.println("A Motorycle moves Right.");
    }
    
}
  