package homework.denysyerchenko.lesson15.zooclub;

public class Animal {
    private String animalType;
    private String animalName;

    public Animal() {
    }

    public Animal(String animalType, String animalName) {
        this.animalType = animalType;
        this.animalName = animalName;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "animalType='" + animalType + '\'' +
                ", animalName='" + animalName + '\'' +
                '}';
    }
}
