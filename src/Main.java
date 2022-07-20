import java.util.ArrayList;
import java.util.List;

public class Main {
    public static class Ball {
    }

    public static class Board {
        private List balls;

/* Static initialization block is used for static initialization of a class.
This code inside the static block is executed only once: the first time the class is loaded into memory.
 */
        static  {}
        public Board(){
           //Not  List balls = new ArrayList<>(); as we have already declared a variable "balls"
            balls = new ArrayList<>();
            balls.add(new Ball());
            balls.add(new Ball());
            balls.add(new Ball());
            balls.add(new Ball());
        }

        public int count() {
            return balls.size();
        }
    }

    public static void main(String[] args) throws NullPointerException{
        Board board = new Board();
        System.out.println(board.count());
    }
}