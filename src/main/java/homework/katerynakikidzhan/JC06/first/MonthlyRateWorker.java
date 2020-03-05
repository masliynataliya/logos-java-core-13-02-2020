package homework.katerynakikidzhan.JC06.first;

public class MonthlyRateWorker implements Salary {

    private int monthlyRate;

    public MonthlyRateWorker(int monthlyRate) {
        this.monthlyRate = monthlyRate;
    }

    public MonthlyRateWorker() {
        this.monthlyRate = 15000;
    }

    public int getSalary() {
        return monthlyRate;
    }
}
