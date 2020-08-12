package lesson.example.java.core.lesson15;

import java.util.*;

public class StudentMap {

    public static void main(String[] args) {

        Map<String, List<StudentUKU>> mapOfStudents = new HashMap<>();

        StudentUKU anna = new StudentUKU("Anna", 3, 21);
        StudentUKU david = new StudentUKU("David", 2, 20);
        StudentUKU matt = new StudentUKU("Matt", 4, 22);
        StudentUKU eva = new StudentUKU("Eva", 3, 20);
        StudentUKU rick = new StudentUKU("Rick", 2, 21);

        List<StudentUKU> historyList = new ArrayList<>();
        historyList.add(anna);
        historyList.add(eva);

        List<StudentUKU> mathList = new ArrayList<>();
        mathList.add(david);
        mathList.add(rick);

        List<StudentUKU> javaList = new ArrayList<>();
        javaList.add(anna);
        javaList.add(david);
        javaList.add(matt);
        javaList.add(eva);
        javaList.add(rick);

        mapOfStudents.put("History", historyList);
        mapOfStudents.put("Math", mathList);
        mapOfStudents.put("Java", javaList);

        Set<Map.Entry<String, List<StudentUKU>>> entries = mapOfStudents.entrySet();
        Iterator<Map.Entry<String, List<StudentUKU>>> iterator = entries.iterator();
        int commonSize = 0;
        while (iterator.hasNext()) {
            commonSize = commonSize + iterator.next().getValue().size();

//            Map.Entry<String, List<StudentUKU>> entry = iterator.next();
//            List<StudentUKU> value = entry.getValue();
//            commonSize = commonSize + value.size();
        }

        System.out.println(commonSize);

        Iterator<Map.Entry<String, List<StudentUKU>>> iterator2 = entries.iterator();
        Set<StudentUKU> set = new HashSet<>();
        while (iterator2.hasNext()) {
            Map.Entry<String, List<StudentUKU>> entry = iterator2.next();
            List<StudentUKU> value = entry.getValue();
            set.addAll(value);
        }

        System.out.println(set.size());
    }
}
