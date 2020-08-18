package homework.markoTolochko.lesson13Rada;

public class Deputy {
    private String lastName;
    private String name;
    private int age;
    private boolean grafter;
    private int grafterSize;

    public void giveAgraft(){
        if (grafter == false){
            System.out.println("this deputy is clean))");
        }
        else if (grafter == true){
            System.out.println("graftSize :" + grafterSize);
            if (grafterSize <= 5000){
                System.out.println("People will kick you) ");
            }
            else if (grafterSize < 5000){
                this.grafterSize = grafterSize;
            }
        }
    }

    public Deputy(String lastName, String name, int age, boolean grafter) {
        this.lastName = lastName;
        this.name = name;
        this.age = age;
        this.grafter = grafter;
    }

    @Override
    public String toString() {
        return "Deputy{" +
                "lastName='" + lastName + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", grafter=" + grafter +
                ", grafterSize=" + grafterSize +
                '}';
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGrafter() {
        return grafter;
    }

    public void setGrafter(boolean grafter) {
        this.grafter = grafter;
    }

    public int getGrafterSize() {
        return grafterSize;
    }

    public void setGrafterSize(int grafterSize) {
        this.grafterSize = grafterSize;
    }


}
