package homework.ihorpayensky.homeworks.homework03;

class Circle implements Figure {
    private double radius;
    private double diameter;

    public Circle() {
        this.radius = 4;
        this.diameter = this.radius*2;
    }
    public Circle(double radius) {
        this.radius = radius;
        this.diameter = this.radius*2;
    }

    @Override
    public void calculateSquare() {
        System.out.println("Square:\t" + (Math.PI*((this.diameter*this.diameter)/4)));
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("Perimeter:\t" + (2 * this.radius * Math.PI));
    }

    @Override
    public void getInfo() {
        System.out.println("====== Circle ======\nRadius:\t" + this.radius + "\nDiameter: " + this.diameter);
    }
}
