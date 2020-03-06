package homework.romanivanov.javacore.jc07hw;

public class PlaneControl {
    private int height;
    private int width;

    public int moveUp(){
        int up =(int) (20 + Math.random() * 80);
        height = height + up;
        System.out.println(height);
        return height;


    }
    public int moveDown(){
        int down =(int) (5 + Math.random() * 30);
        height = height - down;
        if (height<0){
            System.out.println("Літак не може опуститись нижче, наберість спочатку висоту");
        }
        else {
        System.out.println("Літак опускається на "+height+ " км над рівнем землі");
            return height;}
        return height = 1;

    }
    public int moveLeft(){
        int left =(int) (18 + Math.random() * 82);
        width = left - width;
        System.out.println("Літак летить ліворуч і опиняється на широті "+ width);
        return width;
        //логіка з - width що ширина по карті є мінус а є плюс тобто [-90;90]
    }
    public int moveRight(){
        int right =(int) (22 + Math.random() * 78);
        width = width + right;
        System.out.println("Літак летить праворуч і опиняється на широті "+ width);
        return width;
    }

}
