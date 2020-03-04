package homework.ihorpayensky.homeworks.homework03;

class Rectangle implements Figure {
    private double width;
    private double height;

    public Rectangle() {
        this.width = 4d;
        this.height = 5d;
    }
    public Rectangle(double w, double h) {
        this.width = w;
        this.height = h;
    }

    @Override
    public void calculateSquare () {
        System.out.println("Square:\t" + (this.width * this.height));
    }

    @Override
    public void calculatePerimeter () {
        System.out.println("Perimeter:\t" + ((this.width*2) + (this.height*2)));
    }

    @Override
    public void getInfo() {
        System.out.println("====== Rectangle ======\nWidth:\t" + this.width + "\nHeight:\t" + this.height);
    }
}
