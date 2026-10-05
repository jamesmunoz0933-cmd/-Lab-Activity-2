public class Main
{
   public static void main(String[] args)
   {
      Vehicle v1 = new Vehicle("Isuzu", "VehiCROSS", 1997);
      Vehicle v2 = new Vehicle("Daihatsu", "Copen", 2004);
      Vehicle v3 = new Vehicle("Suzuki", "Cappuccino", 1995);

      Vehicle[] vehicles = { v1, v2, v3 };

      System.out.println("=== Original methods on all vehicles ===");
      for (Vehicle v : vehicles) {
         v.displayInfo();
         System.out.println("Age: " + v.calculateAge());
         System.out.println("Vintage: " + v.isVintage());
         System.out.println();
      }

      System.out.println("=== Getters ===");
      for (Vehicle v : vehicles) {
         System.out.println("Brand: " + v.getBrand()
               + ", Model: " + v.getModel()
               + ", Year: " + v.getYear());
      }
      System.out.println();

      System.out.println("=== setYear tests on vehicle 1 ===");
      System.out.println("setYear(2000) -> " + v1.setYear(2000)
            + "; year is " + v1.getYear()
            + "; age " + v1.calculateAge()
            + "; vintage " + v1.isVintage());

      System.out.println("setYear(1885) -> " + v1.setYear(1885)
            + "; year remains " + v1.getYear());

      System.out.println("setYear(2027) -> " + v1.setYear(2027)
            + "; year remains " + v1.getYear());
      System.out.println();

      System.out.println("=== Constructor invalid year tests ===");
      Vehicle bad1 = new Vehicle("Test", "OldInvalid", 1885);
      System.out.println("New vehicle with year 1885 -> initial year is " + bad1.getYear());

      Vehicle bad2 = new Vehicle("Test", "NewInvalid", 2027);
      System.out.println("New vehicle with year 2027 -> initial year is " + bad2.getYear());
   }
}