import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Board extends JPanel implements ActionListener {

    Ball ball = new Ball(this);
    Paddle paddleP;
    Paddle paddleC;

    Timer timer;

    public Board(Game game){

        setPreferredSize(new Dimension(800,600));
        setBackground(Color.BLACK);
        ball = new Ball(this);
        paddleP = new Paddle(game, this);
        paddleC = new Paddle(game, this);
    }

    public void GameStart(){

        ball.setPosition(getWidth()/2,getHeight()/2);
        paddleP.setPosition(20, getHeight()/2);
        paddleC.setPosition(getWidth() - 20, getHeight()/2);
        timer = new Timer(1000/60,this);
        timer.start();
    }

    public void actionPerformed(ActionEvent e){
        //Ball Moves
        ball.move();
        paddleP.move();
        repaint();
    }

    public void paintComponent(Graphics g){

        super.paintComponent(g);
        ball.paint(g);
        paddleP.paint(g);
        paddleC.paint(g);
    }


}
