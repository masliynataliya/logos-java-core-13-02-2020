package homework.denysyerchenko.lesson07;

public class BomberApplication {
    public static void main(String[] args) {
        B2Spirit b2spirit = new B2Spirit(40,60,72000, 3100, "grey");
        System.out.println(b2spirit.startEngine());
        System.out.println(b2spirit.moveUp());
        System.out.println(b2spirit.moveLeft());
        System.out.println(b2spirit.moveDown());
        System.out.println(b2spirit.moveRight());
        System.out.println(b2spirit.stealth());
        System.out.println(b2spirit.nuclearAttack());
        System.out.println(b2spirit.turboBoost());
        System.out.println(b2spirit.landing());
    }
}