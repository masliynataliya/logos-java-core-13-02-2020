package homework.pavliuk.HW.InWork;

public class ChessDesk {

        protected int coX;
        protected int coY;
        protected String color;
        protected int move;
        protected int quantity;
        protected String name;
        protected int where;


        public ChessDesk(){
                coX=0;
                coY=0;
                color="Default";
                quantity=0;
                move=0;
                name="Default";

        }

        public ChessDesk(int coX,int coY,String color,int quantity){
                this.coX=coX;
                this.coY=coY;
                this.color=color;
                this.quantity=quantity;

                System.out.println();
        }

        public void setWhere(int where) {
                this.where = where;
        }

        public void setName(String name) {
                this.name = name;
        }

        public void setCoX(int coX) {
                this.coX = coX;
        }

        public void setCoY(int coY) {
                this.coY = coY;
        }

        public void setColor(String color) {
                this.color = color;
        }

        public void setQuantity(int quantity) {
                this.quantity = quantity;
        }
        public void setMove(int move){
                this.move=move;
        }

        public int getCoX() {
                return coX;
        }

        public int getCoY() {
                return coY;
        }

        public int getQuantity() {
                return quantity;
        }

        public String getColor() {
                return color;
        }

        public int getMove() {
                return move;
        }

        public String getName() {
                return name;
        }

        public int getWhere() {
                return where;
        }

        public void move(String name, int move,int where){
                if (where==1 & move==1){

                System.out.println("One of " + quantity +" "+color+" " + name +" moves forward for "
                        +move + " step in the way of Y"+ ". New X = " + coX + " , New Y = "+(coY+move) );
        }
                if (where==0 & move==1){
                        System.out.println("One of " + quantity +" "+color+" " + name +
                                " moves forward for "+move + " step in the way of X"+ ". New X = " +(coX+move) + " , New Y = "+coY );}

                }

        public void defaul(){
                System.out.println("Default info about "+name+". Quantity = "+quantity +". Color is " + color +
                        ". Position X= "+coX+". Position Y = "+coY+". Move - stay in position");
        }

}
