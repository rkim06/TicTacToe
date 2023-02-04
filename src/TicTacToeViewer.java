import javax.swing.*;
import java.awt.*;

public class TicTacToeViewer {
    private Square[][] squares;
    private Image[] XOimages;

    private int windowWidth;
    private int windowHeight;

    public TicTacToeViewer(int width, int height, Square[][] squares){
        windowWidth = width;
        windowHeight = height;
        this.squares = squares;
        XOimages = new Image[2];

        //gets the X and O images from the resources file
        //and adds them to the array of images "XOimages"
        Image xImg = new ImageIcon("Resources/X.png").getImage();
        Image oImg = new ImageIcon("Resources/O.png").getImage();
        XOimages[0] = xImg;
        XOimages[1] = oImg;
    }


    public void paint(Graphics g){
        g.setColor(Color.white);
        g.fillRect(0, 0, windowWidth, windowHeight);

        int x = 200;
        int y = 100;

        for(int i = 0; i<squares.length; i++){
            String num = i+"";
            g.drawString(num, x, y);
            x += 100;
        }

        x=200;
        for(int i = 0; i<squares.length; i++){
            String num = i+"";
            g.drawString(num, x, y);
            y += 100;
        }
        y = 100;

        for(int i = 0; i<squares.length; i++){
            for(int j = 0; j<squares[i].length; j++){
                if()
                squares[i][j].draw(XOimages[0], XOimages[1], x, y, g);

            }
        }

    }

}
