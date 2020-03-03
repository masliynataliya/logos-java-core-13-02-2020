package homework.pavliuk.HW.InWork;

public class Application {
    public static void main(String[] args) {
    King king=new King();
    king.defaul();
    King king1=new King(10,10,"white",2);
    king1.move("King",2,1);
    King king2=new King(10,11,"white",2);
    king2.move("King",0,1);
    }
}
