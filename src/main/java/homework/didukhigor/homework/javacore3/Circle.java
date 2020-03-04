package homework.didukhigor.homework.javacore3;

public class Circle {
    double radius;
    double diameter;

    Circle(){
        this.radius =10;
        this.diameter=20;
    }


    double diameter(){
        return(radius*2);
    }

    double area(){
        return ((Math.PI*diameter*diameter)/4);
    }
    double length(){ return (2*(Math.PI*radius));
    };
}
