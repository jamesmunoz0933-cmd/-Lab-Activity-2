 public abstract class Vehicle {
    
   protected String brand;
   protected String model;
   protected int year;
   
   public Vehicle(String brand, String model, int year) {
      this.brand = brand;
      this.model = model;
      this.year = year;
   }
   
   protected void displayInfo() {
      System.out.println("Brand: " + brand + "\nModel: " + model + "\nYear: " + year);   
   }
   
   
   public abstract void moveForward();
   public abstract void moveBackward();
   public abstract void moveLeft();
   public abstract void moveRight();
}