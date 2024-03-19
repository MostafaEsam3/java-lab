import javax.swing.JFrame;

public class index extends MyPanel{
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setTitle("lab5");
        MyPanel mypan = new MyPanel();

        jf.setContentPane(mypan);
        jf.setSize(500,300);
        jf.setVisible(true);


    }
}
