package homework.pavloponchko.basics04;

public class fifthClass {
    public static void main(String[] args) {
        int [] Array ={8,18,29,84,0,-5,98,103,3,11};
        int max =Array[0];
        int min =Array[0];
        for (int d=0;d<Array.length;d++){
            if(max<Array[d])
                max=Array[d];
            if(min>Array[d])
                min=Array[d];
        }
        System.out.println("min =" + min);
        System.out.println("max =" + max);
        int array[];
    }
}
