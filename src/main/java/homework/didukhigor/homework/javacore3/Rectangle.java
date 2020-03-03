
package homework.didukhigor.homework.javacore3;

import java.security.PublicKey;

public class Rectangle {

        double length;
        double width;

        public Rectangle(double length, double width){
            this.length = length;
            this.width = width;
        }

        public Rectangle(){
            this.length = 18;
            this.width = 20;
        }

        double perimeter(){
            return (length*2)+(width*2);
        }
        double area(){
            return length*width;
        }


    }

