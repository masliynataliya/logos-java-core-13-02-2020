package homework.romanivanov.javacore.jc07hw;

public class App {
    public static void main(String[] args) throws InterruptedException {
        Su27 test1 = new Su27(10,10,10,"grey",20);
        test1.startEngine();
        test1.takeoff();
        test1.moveUP();
        test1.moveDOWN();
//        test1.moveDOWN();
//        test1.moveDOWN();
//        test1.moveDOWN();
//        test1.moveDOWN(); це для провірки що воно видасть помилку, і попросить піднятись у висоті
        test1.moveRIGHT();
        test1.moveLEFT();
        test1.stealthMode();
        test1.nuclear();
        test1.turboMode();
        test1.landing();

















    }
}
