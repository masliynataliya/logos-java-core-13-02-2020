
package homework.didukhigor.homework.javacore3;

public class Rectangle {

        double length;
        double width;

        Rectangle(double length,double width){
            this.length = length;
            this.width = width;
        }

        Rectangle(){
            this.length = 18;
            this.width = 20;
        }

        double Perimeter(){
            return (length*2)+(width*2);
        }
        double Area(){
            return length*width;
        }



    }

