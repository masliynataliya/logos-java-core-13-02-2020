package homework.didukhigor.homework.basics4;

public class Four {
    public static void main(String[] args) {
        double n=8.5;
        double m=11.45;
        int a=10;
        double b=Math.abs(a-n);
        double c=Math.abs(a-m);
        if(b==c){
            System.out.println("Числа  " +n+ "  та  " +m+ "  рівновіддалені від  " +a );
        }
        if (b>c){
            System.out.println("  Число  " +m+ "  ближче до  " +a);
        }
        if (b<c){
            System.out.println("  Число  " +n+ "  ближче  " +a);
        }
    }
}
