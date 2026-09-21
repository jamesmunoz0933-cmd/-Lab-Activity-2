public class Main
{
   public static void main(String[] args)
   {
      Vehicle v1 = new Vehicle();
      v1.brand = "Isuzu";
      v1.model = "VehiCROSS";
      v1.year = 1997;
      
      v1.displayInfo();
      System.out.println("Age: " + v1.calculateAge());
      System.out.println("Vintage: " + v1.isVintage());
      System.out.println();

      Vehicle v2 = new Vehicle();
      v2.brand = "Daihatsu";
      v2.model = "Copen";
      v2.year = 2004;
      
      v2.displayInfo();
      System.out.println("Age: " + v2.calculateAge());
      System.out.println("Vintage: " + v2.isVintage());
      System.out.println();

      Vehicle v3 = new Vehicle();
      v3.brand = "Suzuki";
      v3.model = "Cappuccino";
      v3.year = 1995;
      
      v3.displayInfo();
      System.out.println("Age: " + v3.calculateAge());
      System.out.println("Vintage: " + v3.isVintage());
      System.out.println();
   }
}