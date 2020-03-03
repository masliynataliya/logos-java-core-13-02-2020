package homework.romanivanov.javacore.jc03.additional;

public class Dog {
    private String nickname;
    private String breed;
    private double size;

    public void setName(String newName){
        this.nickname = newName;

    }


    public void setBreed(String newBreed){
        this.breed = newBreed;
    }


    public void setSize(double newSize){
        this.size = newSize;

    }

    public String getBreed(){
        return breed;
    }


    public String getName(){
        return nickname;
    }


    public double getSize(){
        return size;

    }




}

