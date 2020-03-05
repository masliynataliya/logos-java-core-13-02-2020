package homework.katerynakikidzhan.JC06.first;

public class App {
    public static void main(String[] args) {
        HourlyRateWorker h1 = new HourlyRateWorker();
        MonthlyRateWorker m1 = new MonthlyRateWorker();

        System.out.println("Wage1: " + h1.getSalary());
        System.out.println("Wage2: " + m1.getSalary());
    }
}
