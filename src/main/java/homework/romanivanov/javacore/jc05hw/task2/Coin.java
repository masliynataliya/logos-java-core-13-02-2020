package homework.romanivanov.javacore.jc05hw.task2;

public class Coin {
    private int z ;
    boolean Reshka = false;
    boolean Orel = false;

    public void chooseReshka(){
        System.out.println("Ви вибрали решку");
        System.out.println("Підкидується монета і випадає ...");
       Reshka = true;
       Orel = false;

    }
    public void chooseOrel(){
        System.out.println("Ви вибрали орла");
        System.out.println("Підкидується монета і випадає ...");
        Orel = true;
        Reshka = false;
    }




    public void tossCoin(){
       this.z =(int) (Math.random() * 2) ;
        if  (z==1){
            System.out.println("Решка");
            if (Reshka == true) {
                System.out.println("Вітаю, ви вгадали");
            }
                else {
                    System.out.println("Ви не вгадали");
                }
            }
        else{
            System.out.println("Орел");
            if (Orel == true){
                System.out.println("Вітаю ви вгадала");
            }
            else {
                System.out.println("\nВи не вгадали");
            }
        }

        }




    }



