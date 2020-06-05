package homework.ihorpayensky.homeworks.homework10.maxplan;

import java.util.List;

class Main {
    public static void main(String[] args) {
        String article = "Замініть всі голосні букви в тексті на тире через тире і Тире буде тИре";
        String text = "Шлях в тисячу миль, як кажуть люди, починається з першого кроку, так і успіх " +
                "починається з перших кроків. Важко передбачити ким ти будеш у майбутньому, бо життя  " +
                "постійно змінюється, змінюються умови життя, люди, країни. Ще є питання про твоє " +
                "призначення чи про твою місію в житті: яку отримав задачу перед народженням? які діла ти " +
                "повинен зробити? щоб розвивати себе і мир? для чого ти народився? яке твоє покликання? " +
                "Ці всі питання часто запитують у себе люди,бо розуміють, що, якщо рухатися по своєму " +
                "шляху, то ти будеш мати щастя, успіх, а ось рухатися по нав’язаному шляху нічого " +
                "доброго не принесе, хоча, можливо, людина буде мати достаток, а ось радість і щастя ні";
        // текст із якогось есе


        // # 3
        System.out.println("\n # 3");
        System.out.println("Кількість слів у реченні: " + countWords(article));

        // # 4
        System.out.println("\n # 4");
        System.out.println("Кількість речень у тексті: " + countSentences(article));
        System.out.println("Кількість речень у тексті: " + countSentences(text));
        System.out.println("Кількість речень у тексті: " + countSentences("в.а.п.в"));  // 4

        // # 5
        System.out.println("\n # 5");

        String[] str = findWord(article);
        System.out.println("Слово '" + str[0] + "' попадається у реченні " + str[1] + " рази" );

        // # 6
        System.out.println("\n # 6");

        String text2 = text.replace("\\.","")
                .replace(",","")
                .replace("?","")
                .replace(":","")
                .replace("’","");

        String[] str2 = findWord(text2);
        System.out.println("Слово '" + str2[0] + "' попадається у тексті " + str2[1] + " рази");
    }

    private static int countWords(String s) {
        return s.split(" ").length;
    }

    private static int countSentences(String s) {
        s = s.replace("?", "\\.");
        return s.split("\\.").length;
    }

    private static String[] findWord(String s) {
        String[] temp = s.toLowerCase().split(" ");

        int count = 0;
        String res = null;
        for (int i = 0; i < temp.length; i++) {
            int maxCount = 0;
            String t = null;
            for (int j = 0; j < temp.length; j++) {
                if (temp[i].equals(temp[j])) {
                    maxCount++;
                    t = temp[i];
                }
            }
            if (count < maxCount){
                count = maxCount;
                res = t;
            }
        }
        return new String[] { res, Integer.toString(count) };
    }
}
