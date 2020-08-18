package homework.mikekhay.hwjavacore12.number1;

public class Car {

   private int horsePower;
   private int carRelease;
   private Engine engine;
   private Kermo kermo;

   public Car() {
      horsePower = 80 + (int) (Math.random() * 420);
      carRelease = 2000 + (int) (Math.random() * 20);
      this.engine = engine;
      this.kermo = kermo;
   }

   public int getHorsePower() {
      return horsePower;
   }

   public int getCarRelease() {
      return carRelease;
   }

   public Engine getEngine() {
      return engine;
   }

   public Kermo getKermo() {
      return kermo;
   }

   public void setHorsePower(int horsePower) {
      this.horsePower = horsePower;
   }

   public void setCarRelease(int carRelease) {
      this.carRelease = carRelease;
   }

   public void setEngine(Engine engine) {
      this.engine = engine;
   }

   public void setKermo(Kermo kermo) {
      this.kermo = kermo;
   }

   @Override
   public String toString() {
      return "\n" + "Car{" +
              "horsePower=" + horsePower +
              ", carRelease=" + carRelease +
              ", engine=" + engine +
              ", kermo=" + kermo +
              '}' + "\n";
   }
}
