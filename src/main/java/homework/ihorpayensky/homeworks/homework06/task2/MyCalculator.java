package homework.ihorpayensky.homeworks.homework06.task2;

class MyCalculator implements Numerable {
    private double x1;
    private double x2;

    public MyCalculator() {}
    public MyCalculator(double x1, double x2) {
        this.x1 = x1;
        this.x2 = x2;
    }

    public double getX1() { return x1; }
    public void setX1(double x1) { this.x1 = x1; }
    public double getX2() { return x2; }
    public void setX2(double x2) { this.x2 = x2; }


    @Override
    public double divide() {
        return this.x1 / this.x2;
    }

    @Override
    public double subtract() {
        return this.x1 - this.x2;
    }

    @Override
    public double multiply() {
        return this.x1 * this.x2;
    }

    @Override
    public double add() {
        return this.x1 + this.x2;
    }
}
