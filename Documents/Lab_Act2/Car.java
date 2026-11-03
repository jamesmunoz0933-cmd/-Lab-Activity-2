public class Car extends Vehicle {
   private int numberOfDoors;
   
   public Car (
      String brand,
      String model,
      int year,
      int numberOfDoors
      ) 
      {
      super(brand, model, year);
      this.numberOfDoors = numberOfDoors;
      }
      
      @Override
      public void displayInfo() {
         super.displayInfo();
         System.out.println("Doors: " + numberOfDoors + " doors");
     }
     @Override
     public void moveForward() {
     System.out.println("A Car moves Forward.");
    }
     @Override 
     public void moveBackward() {
     System.out.println("A Car moves Backward.");
    }
     @Override 
     public void moveLeft() {
     System.out.println("A Car moves Left.");
    }
     @Override 
     public void moveRight() {
     System.out.println("A Car moves Right.");
    }

}