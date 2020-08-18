package homework.romanivanov.javacore.jc16hw;

public  class CatExample {
    private int age;
    private String name;

    public CatExample() {
    }

    public CatExample(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public CatExample setAge(int age) {
        this.age = age;
        return this;
    }

    public String getName() {
        return name;
    }

    public CatExample setName(String name) {
        this.name = name;
        return this;
    }
    public void meow(){
        System.out.println("Кіт муркає");
    }
    private void eat(){
        System.out.println("Кіт їсть");
    }

    @Override
    public String toString() {
        return "CatExample{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

}
