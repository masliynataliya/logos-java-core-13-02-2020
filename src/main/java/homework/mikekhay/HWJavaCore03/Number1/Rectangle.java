package homework.mikekhay.HWJavaCore03.Number1;

import homework.mikekhay.HWJavaCore03.Number1.Figure;

public abstract class Rectangle implements Figure {
    protected double dovguna;
    protected double shyryna;

    public Rectangle(){
        this.dovguna = 7;
        this.shyryna = 10;
    }
    public Rectangle(double j, double k){
        this.dovguna = j;
        this.shyryna = k;}


        @Override
        public void calPlos() {
            System.out.println(" Ploscha = " + (this.shyryna * this.dovguna) + " Perumetr = " + ((this.dovguna + this.shyryna)*2));
        }
        @Override
        public void calPer() {
        System.out.println(" Ploscha = " + (this.shyryna * this.dovguna) + " Perumetr = " + ((this.dovguna + this.shyryna)*2));
    }
    }