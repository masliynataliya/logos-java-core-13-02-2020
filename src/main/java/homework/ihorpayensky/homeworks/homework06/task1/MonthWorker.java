package homework.ihorpayensky.homeworks.homework06.task1;

class MonthWorker implements Salary {
    private String name;
    private int time;
    private static final double SALARY_OF_MONTH = 18325.98;

    public MonthWorker() {}
    public MonthWorker(String name, int time) {
        this.name = name;
        this.time = time;
    }

    @Override
    public double getSalary() {
        return time * SALARY_OF_MONTH;
    }

    public void getInfo() {
        System.out.printf("%s has %s $ from %s months.\n", this.name, this.getSalary(), this.time);
    }

}
