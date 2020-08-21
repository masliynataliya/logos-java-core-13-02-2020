package lesson.example.java.core.lesson21.droid;

public class Droid {

    @Fielder("Droid name")
    private String name;
    private int health;
    private int impact;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getImpact() {
        return impact;
    }

    public void setImpact(int impact) {
        this.impact = impact;
    }
}
