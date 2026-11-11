 public class Truck extends Vehicle implements Serviceable {
   private int numberOfWheels;
   
   public Truck (String brand, String model, int year, int numberOfWheels) { 
      super(brand, model, year); // Inayos ko ang order para tumugma sa Vehicle
      this.numberOfWheels = numberOfWheels;
   }
         
   @Override
   public void displayInfo() { 
      super.displayInfo();
      System.out.println("Number of Wheels: " + numberOfWheels);
   }
   
   @Override
   public void moveForward() { System.out.println("A Truck moves Forward."); }
   @Override 
   public void moveBackward() { System.out.println("A Truck moves Backward."); }
   @Override 
   public void moveLeft() { System.out.println("A Truck moves Left."); }
   @Override 
   public void moveRight() { System.out.println("A Truck moves Right."); }

    
   @Override
   public void service() {
      System.out.println("Truck: inspect cargo brakes.");
   }
}