package Graphics147;

import javax.swing.*;
import java.awt.*;

public class Shapes extends JPanel {

    private int choice;

    public Shapes(int userChoice){
        choice = userChoice;
    }

    //desenho no canto superior esquerdo.
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        for(int i = 0; i < 10; i++){

            //seleciono a base de acordo com o usuario
            switch (choice){
                case 1: //desenha retangulos
                    g.drawRect(10+i*10, 10+i*10, 50+i*10, 50+i*10);
                    break;
                case 2: //desenha ovais
                    g.drawOval(10+i*10, 10+i*10, 50+i*10, 50+i*10);
                    break;
            }
        }
    }
}
