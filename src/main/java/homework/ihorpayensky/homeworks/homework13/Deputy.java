package homework.ihorpayensky.homeworks.homework13;

class Deputy extends Human implements Comparable<Deputy>{
    private String firstName;
    private String lastName;
    private boolean briber;
    private int bribeSize;

    public Deputy() {}
    public Deputy(String firstName, String lastName, double weight, double height,  boolean briber) {
        super(weight, height);
        this.firstName = firstName;
        this.lastName = lastName;
        this.briber = briber;
        this.bribeSize = 0;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isBriber() {
        return briber;
    }

    public void setBriber(boolean briber) {
        this.briber = briber;
    }

    public int getBribeSize() {
        return bribeSize;
    }

    public void setBribeSize(int bribeSize) {
        this.bribeSize = bribeSize;
    }

    public void giveBribe(int bribe) {
        if (!this.briber)
            if (bribe >= 5000) {
                this.bribeSize += bribe; // занести до кількості хабару
                System.out.println("Дипутат " + this.lastName + " " + this.firstName + " взяв хабар!");
            } else if (bribe <=1000) {
                System.out.println("Не смішіть мої кишені, дайте більше!");
            } else {
                System.out.println("Тікай з села, поліція вже за тобою виїхала!");
            }
        else {
            System.out.println("Дипутат " + this.lastName + " " + this.firstName + " не бере хабарів!");
        }
    }

    @Override
    public int compareTo(Deputy o) {
        return this.getFirstName().compareTo(o.getFirstName());
    }


    @Override
    public String toString() {
        return this.getFirstName() + " " + this.getLastName();
    }
}
