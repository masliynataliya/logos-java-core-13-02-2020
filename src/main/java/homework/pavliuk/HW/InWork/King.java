package homework.pavliuk.HW.InWork;

import homework.pavliuk.HW.InWork.ChessDesk;

public class King extends ChessDesk {

    public King(){
        setCoX(5);
        setCoY(0);
        setName("King");
        setQuantity(2);
    }

    public King(int coX,int coY,String color,int quantity){

        super(coX, coY, color, quantity);
        setName("King");
    }



    public void move(String name, int move, int where) {
                super.move(name, move, where);
                if ( move!=1){
                    System.out.println("King moves only for 1 step. Change MOVE to 1 ");}
                else if(where!=0 && where!=1){
                    System.out.println("King moves only X or Y, set WHERE 1 if you want move Y and 0 if X");
        }
                }
        }


