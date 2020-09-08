package homework.romanivanov.javacore.jc18hw;

import java.util.ArrayList;
import java.util.List;

public class ArrayListIntegerExample {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        addToList(list);
//        System.out.println(list.get(1));
        System.out.println(getNumber("jepa123"));

//        list.add(Integer.valueOf("06"));
//        list.add(Integer.valueOf("bb")); //з цифрами так спрацює, а з іншими даними буде викидатись помилка
    }

    public static void addToList(List list) {
        list.add("0067");
        list.add("bb");
        list.add(true); //під час виконання методу, універсальність ліста стирається і в нього можна добавити
        //любий силочний тип
    }
    public static int getNumber(String number) {
        int result = 0;
        for (int i = 0; i < number.length(); i++) {
            result = result * 10 + number.charAt(i) - '0';
            System.out.println(number.charAt(i) - '0');
        }
        return result;
    }
}
