package homework.pavliuk.HW;

public class ChessDesk {

        protected int coX;
        protected int coY;
        protected boolean defeat=false;
        protected boolean win=true;

        public String getMove() {
                return move;
        }

        public void setMove(String move) {
                this.move = move;
        }

        protected String color;
        protected String move;
        protected int quantity;

        public void move(String move){
            System.out.println("How this move? " + move);

        }
}
