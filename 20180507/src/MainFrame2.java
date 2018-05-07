import javax.swing.*;
import java.awt.event.ActionEvent;

public class MainFrame2 extends JFrame {
    private JButton jbut = new JButton("<--");
    private JButton jbut2 = new JButton("-->");
    private JButton jbut3 = new JButton("EXIT");
    private JLabel jlb = new JLabel(">o<");
    private JTextField jtf = new JTextField();
    private int x = 50;

    public MainFrame2 (){
        init();
    }
    private void init(){
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jbut.setBounds(100,100,100,100);
        jbut2.setBounds(300,100,100,100);
        jbut3.setBounds(600,100,100,100);
        jlb.setBounds(x,200,100,100);
        jtf.setBounds(250,400,100,100);

        this.add(jbut);
        this.add(jbut2);
        this.add(jbut3);
        this.add(jlb);
        this.add(jtf);
        this.setLayout(null);
        this.setLocation(300,300);
        this.setSize(1280,720);

        jbut2.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                x = x+(Integer.parseInt(jtf.getText()));
             jlb.setLocation(x,200);
            }
        });
        jbut.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                x = x-(Integer.parseInt(jtf.getText()));
                jlb.setLocation(x,200);
            }
        });
        jbut3.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                dispose();
            }
        });
    }
}
