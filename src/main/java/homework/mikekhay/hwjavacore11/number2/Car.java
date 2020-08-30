package homework.mikekhay.hwjavacore11.number2;

public class Car {

   private int horsePower;
   private int carRelease;

   private Engine engine;
   private Kermo kermo;

   public Car(Engine engine, Kermo kermo) {
      horsePower = 80 + (int) (Math.random() * 420);
      carRelease = 2000 + (int) (Math.random() * 20);
      this.engine = engine;
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
