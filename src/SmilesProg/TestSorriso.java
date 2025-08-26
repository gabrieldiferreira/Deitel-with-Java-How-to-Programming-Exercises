package SmilesProg;

import javax.swing.*;

public class TestSorriso {
    public static void main(String[] args){

        Sorriso desenho = new Sorriso();
        JFrame desenhando = new JFrame();

        desenhando.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        desenhando.add(desenho);
        desenhando.setSize(330, 550);
        desenhando.setVisible(true);



    }
}
