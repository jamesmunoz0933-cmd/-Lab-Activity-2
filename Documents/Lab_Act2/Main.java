public class Main {
   public static void printDetails(Vehicle vehicle) {
   vehicle.displayInfo();
   }
      public static void printAction (Vehicle vehicle) {
         vehicle.moveForward();
         vehicle.moveBackward();
         vehicle.moveLeft();
         vehicle.moveRight();
      }
      
   public static void main(String[] args) {
   
   Vehicle vehicle = new Car("Isuzu", "VehiCROSS", 2024, 4);
      System.out.println();
      vehicle.displayInfo();
  
   vehicle = new Motorcycle("Daihatsu", "Copen", 2024, "Manual");
      System.out.println();
      vehicle.displayInfo();
        
   vehicle = new Truck("Suzuki", "Cappuccino", 2024, 4);
      System.out.println();
      vehicle.displayInfo();
     
     System.out.println("\n=== 2. Method Parameter ===");
      Car car = new Car("Mazda", "MX-5 Miata", 2026, 4);
      Motorcycle motor = new Motorcycle("Yamaha", "MT-07", 2026, "Manual");
      Truck truck = new Truck("Chevrolet", "Silverado 1500", 2026, 4);
      
      printDetails(car);
      System.out.println();
      printDetails(motor);
      System.out.println();
      printDetails(truck);
      
      System.out.println("\n=== 3. Polymorphic Array ===");
      
      Vehicle[] vehicles = {
         new Car("Mazda", "MX-5 Miata", 2026, 4),
         new Motorcycle("Yamaha", "MT-07", 2026, "Manual"),
         new Truck("Chevrolet", "Silverado 1500", 2026, 4)
      };
      
      for(Vehicle currentVehicle : vehicles) {
         printDetails(currentVehicle);
         printAction(currentVehicle);
         System.out.println();
      }
   }


}