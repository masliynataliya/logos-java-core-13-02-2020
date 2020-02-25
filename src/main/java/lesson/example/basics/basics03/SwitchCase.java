package lesson.example.basics.basics03;

public class SwitchCase {

    public static void main(String[] args) {
        // text variable
        String season = "winter";

        // switch case
        switch (season) {
            case "winter":
                System.out.println("snow");
                break;
            case "spring" :
                System.out.println("rain");
                break;
            case "summer":
                System.out.println("sun");
                break;
            case "autumn":
                System.out.println("rain");
                break;
            default:
                System.out.println("enter season");
        }
    }
}
