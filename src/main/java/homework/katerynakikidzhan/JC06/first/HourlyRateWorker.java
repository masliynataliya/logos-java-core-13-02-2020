package homework.katerynakikidzhan.JC06.first;
// Створити interface Зарплата, в якому передбачити метод зарплата().
// Створити клас Працівник з погодинною зарплатою, та Працівник з фіксованою місячною зарплатою.
// Реалізувати методи інтерфейсу в класах:
// Працівник з погодинною зарплатою, та працівник з фіксованою місячною зарплатою.
// Формула розрахунку зарплати працівника є довільною.
// Вивести на екран, скільки заробляють перший і другий працівники.
public class HourlyRateWorker implements Salary {

    private int hourlyRate;

    public HourlyRateWorker(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public HourlyRateWorker() {
        this.hourlyRate = 100;
    }

    public int getSalary() {
        return hourlyRate * 160;
    }
}
