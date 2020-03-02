package homework.katerynakikidzhan.JC03;

//Написати клас Rectangle , в якому буде описано поля : довжина, ширина.
// Описати дані поля в конструкторі. Створити конструктор з параметрами і без параметрів.
// В конструкторі без параметрів описати свої дані.
// Тобто створюючи об’єкт, за вибору даного конструктору, ви отримаєте прямокутник даного розміру.
// Написати методи, які будуть розраховувати площу та периметр.
// В Main класі продемонструвати створення об’єктів використовуючи два конструктори.
// Вивести на консоль площу і периметр прямокутника.
// Вивід на консолі повинен мати наступний вигляд: «Площа прямокутника = тут буде площа»,
// «Периметр прямокутника = тут буде периметр» .

public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle() {
        this.length = 5;
        this.width = 4;
    }

    public double area() {
        return length * width;
    }

    public double perimeter() {
        return 2 * (length + width);
    }

}
