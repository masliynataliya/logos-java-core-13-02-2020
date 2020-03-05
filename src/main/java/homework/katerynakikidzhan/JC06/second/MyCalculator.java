package homework.katerynakikidzhan.JC06.second;
// Створіть інтерфейс Plus, з методoм : додати; Minus, з методoм : відняти;
// Multiply з методoм : помножити; Devide з методoм : поділити;
// створіть інтерфейс Numerable, який наслідуватиметься від інтерфейсів Plus,
// Minus, Multiply, Devide в пакеті com.lgs.lab.interface1.
// Створіть пакет com.lgs.lab.interface2 в якому створіть клас MyCalculator
// і заімплементіть даному класу інтерфейс Numerable та задайте реалізацію
// всім методам даного інтерфейсу. Створіть метод мейн та створіть об’єкт класу MyCalculator,
// до якоо викличте всі його методи . Результати арифметичних операцій виведіть на консоль.
public class MyCalculator implements Numerable {

    private double term1;
    private double term2;
    private double term3;
    private double term4;
    private double factor1;
    private double factor2;
    private double dividend;
    private double divisor;

    public MyCalculator(double term1, double term2, double term3, double term4, double factor1, double factor2, double dividend, double divisor) {
        this.term1 = term1;
        this.term2 = term2;
        this.term3 = term3;
        this.term4 = term4;
        this.factor1 = factor1;
        this.factor2 = factor2;
        this.dividend = dividend;
        this.divisor = divisor;
    }

    public MyCalculator() {
        this.term1 = 1;
        this.term2 = 2;
        this.term3 = 3;
        this.term4 = 4;
        this.factor1 = 1;
        this.factor2 = 2;
        this.dividend = 10;
        this.divisor = 5;
    }

    @Override
    public double getQuotient() {
        return term1 + term2;
    }

    @Override
    public double getDifference() {
        return term3 - term4;
    }

    @Override
    public double getProduct() {
        return factor1 * factor2;
    }

    @Override
    public double getSum() {
        return dividend / divisor;
    }
}
