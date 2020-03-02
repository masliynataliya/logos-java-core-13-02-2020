package homework.katerynakikidzhan.JC03.additional;

public class Dog {
    //    2. Створити клас Dog з параметрами ім’я, розмір, порода.
//    Не створювати конструктор!
//    Створити геттери та сеттери для кожного поля.
//    Створити обєкт класу Dog, а потім проініціалізувати всі поля за допомогою сеттерів.
//    Після цього вивести у консоль інформацію про ім’я, розмір і породу собаки, обов’язково використавши геттери. 
    private String name;
    private String size;
    private String breed;

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public String getBreed() {
        return breed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", size='" + size + '\'' +
                ", breed='" + breed + '\'' +
                '}';
    }
}
