package homework.didukhigor.homework.javacore3;

public class Circle {
    double radius;
    double diameter;
    double length;
    double area;


    Circle(){
        this.radius =10;
        this.diameter=20;
    }


    double Diameter(){
        return(radius*2);
    }
    double Area(){
        return ((Math.PI*diameter*diameter)/4);
    }
    double Length(){
       return (2*(Math.PI*radius));
    };
}
