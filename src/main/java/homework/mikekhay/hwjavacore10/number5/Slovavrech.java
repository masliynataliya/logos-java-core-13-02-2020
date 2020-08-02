package homework.mikekhay.hwjavacore10.number5;

public class Slovavrech {
    public static void main(String[] args) {
        String s = " qwe, qwei, qwe qwert qwert wer wer wer . qwe rty rt qwe rty rty ";

        String[] m = s.split("\\W+");
        int[] k = new int[]{-1, 0};

        for(int i = 0; i < m.length; ++i) {
            if (!m[k[1]].equals(m[i]) || k[0] < 0) {
                int c = 1;

                for(int p = i + 1; p < m.length; ++p) {
                    if (m[i].equals(m[p])) {
                        ++c;
                    }
                }

                if (k[0] < c) {
                    k[0] = c;
                    k[1] = i;
                }
            }
        }
        System.out.println("Найбільш повторюване слово: " + m[k[1]] + " (зустрічається: " + k[0] + " раз).");
    }
}
