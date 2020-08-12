package lesson.example.java.core.lesson15;

import java.util.Objects;

public class Worker implements Comparable<Worker>{

    private String name;
    private int wage;
    private int age;

    public Worker(String name, int wage, int age) {
        this.name = name;
        this.wage = wage;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Worker worker = (Worker) o;
        return wage == worker.wage &&
            age == worker.age &&
            Objects.equals(name, worker.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, wage, age);
    }

    @Override
    public String toString() {
        return "Worker{" +
            "name='" + name + '\'' +
            ", wage=" + wage +
            ", age=" + age +
            '}';
    }

    public String getName() {
        return name;
    }

    public int getWage() {
        return wage;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Worker otherWorker) {
        if( this.getAge() > otherWorker.getAge()) {
            return 1;
        } else if (this.getAge() < otherWorker.getAge()) {
            return -1;
        } else {
            return 0;
        }
    }
}

