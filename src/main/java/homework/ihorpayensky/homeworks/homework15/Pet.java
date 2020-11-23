package homework.ihorpayensky.homeworks.homework15;

class Pet {

    private String petType;
    private String name;
    private int id;
    private static int maxId = 0;

    public int getId() {
        return id;
    }

    public Pet(String petType, String name) {
        this.id = maxId;
        maxId++;
        this.petType = petType;
        this.name = name;
    }

    public Pet() { }

    public String getPetType() {
        return petType;
    }

    public void setPetType(String petType) {
        this.petType = petType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "petType='" + petType + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
