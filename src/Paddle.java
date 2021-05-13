import java.awt.*;

public class Paddle {

    private int x, y;
    private final int WIDTH = 20, HEIGHT = 100;
    Game game;
    Board board;

    public Paddle(Game game, Board board){

        this.game = game;
        this.board = board;
    }

    public void setPosition(int inputX, int inputY){

        x = inputX - WIDTH/2;
        y = inputY - HEIGHT/2;
    }

    public void move(){

        if(game.isUpPressed()){

           if(y > 0){

               y -= 5;
           }
        }

        if(game.isDownPressed()){

            if(y + HEIGHT < board.getHeight()) {

                y += 5;
            }
        }
    }

    public void paint(Graphics g){

        g.setColor(Color.WHITE);
        g.fillRect(x, y, WIDTH, HEIGHT);
    }

}
