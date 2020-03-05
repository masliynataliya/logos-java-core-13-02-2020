package lesson.example.java.core.lesson07.ocp.bad;

public class Concierge {

    private String personality;

    public Concierge(String personality) {
        this.personality = personality;
    }

    public  void greet() {
        if (personality.equals("ceo")) {
            System.out.println("Good day, sir");
        } else if (personality.equals("friend")) {
            System.out.println("Hi, bro!");
        } else if (personality.equals("family")) {
            System.out.println("How are you, darling");
        }
    }
}
