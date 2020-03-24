package homework.didukhigor.homework.javacore7;
//Створити класи Су-27,
//    Переходимо до класу Су-27. Необхідно реалізувати звязок між даними класами таким чином, щоб Су-27 мав можливість працювати з полями і методами інших класів.
//    Тобто наслідуваня, композиція, делегування.
//o Необхідно перевизначити методи інтерфейсу в класі Су-27 , щоб ТурбоПрискорення виводив на екран швидкіть яка буде випадково генеруватись і
// повинна бути більшою за максимальну швидкість літака Су-27.
//o Метод  ТехнологіяСтелс виводить на екран , що літака не видно напротяці випадково згенерованого числа.
//o Метод ЯдернийУдар виводить на екран виподкову кількість ядерних боєоловок яку буде скинуто, але не більше 10.
//o Описати поля максимальна швидкість, колір, які передати в конструктор з параметрами.
// Створити клас Мейн, де створити мейн метод, створити в ньому обєкт Су-27.
//І тепер імітуємо політ літака.


import java.util.Random;

public class Su27 extends Airplane implements Accessibility{

    Random random = new Random();

    AirplaneControl a = new AirplaneControl(10000,10000,50000,50000);
    double maxSpeed = 2500;
    String color = "Yellow-Blue";

    void motionUp(){a.motionUp();}
    void movingDown(){a.movingDown();}
    void movingForward(){a.movingForward();}
    void movingBackwards(){a.movingBackwards();}

    public Su27(double length, double width, int weight) {
        super(length, width, weight);
    }

    @Override
    public void turboAcceleration() {
        int turboSpeed = 2550+random.nextInt(3500-2550);
        System.out.println("Turbo speed activated "+turboSpeed+" k/h.");
    }

    @Override
    public void stealthTechnology() {
        int timeOfInvisibility = 5+random.nextInt(60-30);//поставив часові рамки, бо генерувало якусь нісенітницю!
        System.out.println("The airplane is not visible for a "+timeOfInvisibility+"m.");
    }

    @Override
    public void nuclearStrike() {
        int toDampGifts = random.nextInt(11);
        System.out.println("I'm over Moscow, dump "+toDampGifts+" warhead.");

    }
}
