import javax.swing.*;
import java.awt.*;

public class TicTacToeGame {

    JFrame jFrame;
    JButton jButton, jButton1, jButton2,jButton3 ,jButton4, jButton5, jButton6, jButton7, jButton8;

    TicTacToeGame(){
        System.out.println("hii");
         jFrame = new JFrame();
        jFrame.setSize(500 ,500);
        //jFrame.setDefaultCloseOperation(jFrame.getDefaultCloseOperation());
        jFrame.setVisible(true);

        jFrame.setLayout(new GridLayout( 3 ,3));

        jButton = new JButton();
        jButton.add(jButton);

        jButton1 = new JButton();
        jButton1.add(jButton1);


        jButton2 = new JButton();
        jButton2.add(jButton2);


        jButton3 = new JButton();
        jButton3.add(jButton3);


        jButton4 = new JButton();
        jButton4.add(jButton4);


        jButton5 = new JButton();
        jButton5.add(jButton5);


        jButton6 = new JButton();
        jButton6.add(jButton6);


        jButton7 = new JButton();
        jButton7.add(jButton7);

        jButton8 = new JButton();
        jButton8.add(jButton8);





    }

    public static void main(String[] args) {


       new TicTacToeGame();


    }
}
