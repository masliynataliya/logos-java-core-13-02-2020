package homework.ihorpayensky.homework04.task1;

class Task1Main {
    public static void main(String[] args) {

        // Переіменував CoffeeRobot на RobotCoffee
        // для кращої структуризації

        Robot[] robots = new Robot[] {
                new Robot(),
                new RobotCoffee(),
                new RobotCooker(),
                new RobotCooker(),
                new RobotDancer(),
                new RobotDancer(),
                new Robot(),
                new RobotCoffee(),
                new RobotCooker()
        };

        for (Robot robot: robots) {
            robot.work();
        }




    }
}
