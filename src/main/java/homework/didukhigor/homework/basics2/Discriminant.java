package homework.didukhigor.homework.basics2;

public class Discriminant {
    public static void main(String[] args) {
        int a = 1;
        int b = 12;
        int c = 36;
        double d=(b*b)-(4*a*c);
        int e=0;
        int f=0;
        if(d==0){
            e=-1*(b/(2*a));
            System.out.println("Рівняння має один корінь квадратний: "+e);
        }
        else {
            if(d>0){
                e=((-1*b)+(int)Math.sqrt(d))/(2*a);
                f=((-1*b)-(int)Math.sqrt(d))/(2*a);
                System.out.println("Рівняння має 2 корені квадратних: "+e+" та " +f);
            }
            else {
                System.out.println("Рівняння не має коренів квадратних.");
            }
        }
    }
    }

