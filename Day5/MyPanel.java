import java.awt.Color;
import java.awt.Graphics;
import java.awt.Label;
import java.util.Date;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyPanel extends JPanel implements Runnable{
    int x= 0;
    public MyPanel(){
        this.setBackground(Color.CYAN);
        new Thread(this).start();
    }


    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawString(new Date().toLocaleString(), 100, 100);
        JLabel lab = new JLabel("text");
        g.drawString(lab.getText(),this.x ,150);
        this.x++;
        if(this.getWidth() == this.x){
            this.x =0;
        }
    }

    @Override
    public void run() {
        while (true) {
            try {
                this.repaint();
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
