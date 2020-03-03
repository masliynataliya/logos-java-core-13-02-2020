package homework.katerynakikidzhan.JC04.second;
// Створити клас Кермо, Колесо, Кузов - описати дані класи(getters, setters, toString).
// Всі поля повинні бути приватними.
// Додати методи які б виконували певні функції з полями, тобто збільшували розмір колеса у декілька разів, чи змінювали діаметр керма і т.д..
// Створити клас Машина, який матиме деякі свої поля та об’єкти класу Кермо, Кузов,Колесо - як поля класу.
// Додати методи, які би змінювали стан полів класу , для виконання певних функцій, описати даний клас(getters, setters, toString).
// Всі поля повинні бути параметрами в конструкторі.
// В мейн методі , створити об"єкт Машина, запустити всі його методи.
public class Body {
    private int size;
    private String colour;


    public Body() {
        this.colour = "turquoise";
        this.size = 100;
    }

    public Body(int size, String colour) {
        this.size = size;
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void changeSize() {
        size *= 3;
    }
}
