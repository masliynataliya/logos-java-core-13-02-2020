package homework.ihorpayensky.homeworks.homework20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

class Runnable extends Thread {

    private int k;

    public Runnable(int k) {
        this.k = k;
    }

    @Override
    public synchronized void run() {
        try {
            List<Integer> j = new ArrayList<>();
            j.add(1);
            j.add(1);

            for (int i = 0; i < k-2; i++) {
                int temp = j.get(j.size()-1) + j.get(j.size()-2);
                j.add(temp);
            }

            Collections.reverse(j);

            Thread.sleep(1000);
            for (int i = 0; i < j.size()+1; i++) {
                showBar(i, j);
                Thread.sleep(1000);
            }


        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    private static void showBar(int current, List<Integer> list) {

        StringBuilder str = new StringBuilder(140);

        List<Integer> temp = list.subList(0, current);

        str
                .append(temp.size()==list.size() ? '\n' : "")
                .append("Run Runnable: ")
                .append(temp.toString());

        System.out.print(str);
    }
}
