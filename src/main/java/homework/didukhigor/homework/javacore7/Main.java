package homework.didukhigor.homework.javacore7;
//А) Запускаємо двигуни літака
//Б) Проводимо взліт літака
//В) Рухаємось вверх ,вліво, вниз, вправо
//Г) Включаємо технологію стелс
//Д) Проводимо ядерний удар
//Е) Включаємо турбоприскорення і тікаємо
//Є) Проводимо посадку літака
public class Main {
    public static void main(String[] args) {
        Su27 su27 = new Su27(18.5,12.7,18000);
        su27.startingEngines();
        su27.flightRangeAirplane();
        su27.motionUp();
        su27.movingDown();
        su27.movingForward();
        su27.movingBackwards();
        su27.stealthTechnology();
        su27.nuclearStrike();
        su27.turboAcceleration();
        su27.thePlaneLands();

    }
}
