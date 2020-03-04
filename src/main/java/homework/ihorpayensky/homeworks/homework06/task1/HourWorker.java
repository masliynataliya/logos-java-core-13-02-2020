package homework.ihorpayensky.homeworks.homework06.task1;

class HourWorker implements Salary {
    private String name;
    private int time;
    private static final double SALARY_OF_HOUR = 325.22;

    public HourWorker(String name, int time) {
        this.name = name;
        this.time = time;
    }

    @Override
    public double getSalary() {
        return time * SALARY_OF_HOUR;
    }

    public void getInfo() {
        System.out.printf("%s has %s $ from %s hours.\n", this.name, this.getSalary(), this.time);
    }

}
