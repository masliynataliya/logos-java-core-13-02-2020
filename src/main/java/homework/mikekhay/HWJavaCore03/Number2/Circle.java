package homework.mikekhay.HWJavaCore03.Number2;

import homework.mikekhay.HWJavaCore03.Number1.Figure;

public class Circle implements Figuree {
    protected double rad;
    protected double diam;

    public Circle() {
        this.rad = 4;
        this.diam = this.rad * 2;
    }

    public Circle(double rad) {
        this.rad = rad;
        this.diam = this.rad * 2;
    }

    @Override
    public void calPlosch() {
        System.out.println("Ploscha kola = " + ( Math.PI * ( this.rad * this.rad ) ) + " Dovguna kola = " + (2*(Math.PI * ( rad ) )));

    }

    @Override
    public void calDov() {
        System.out.println("Ploscha kola = " + ( Math.PI * ( this.rad * this.rad ) ) + " Dovguna kola = " + ( 2*(Math.PI * ( rad ) )));
    }
}

