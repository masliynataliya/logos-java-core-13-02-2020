package homework.romanivanov.javacore.jc10hw;

import java.util.Objects;

public class Count {


    private String word;
    private int countWord;
    private Count() {
    }

    public static Count createDefault() {
        return new Count().setCountWord(0);
    }

    @Override
    public int hashCode() {
        return Objects.hash(word, countWord);
    }

    public String getWord() {
        return word;
    }

    public Count setWord(String word) {
        this.word = word;
        return this;
    }

    public int getCountWord() {
        return countWord;
    }

    public Count setCountWord(int countWord) {
        this.countWord = countWord;
        return this;
    }

    @Override
    public String toString() {
        return "Class{" +
                "word='" + word + '\'' +
                ", countWord=" + countWord +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Count count = (Count) o;
        return countWord == count.countWord &&
                word.equals(count.word);
    }


}

