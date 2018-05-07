import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class MainFrame extends JFrame {
    private JLabel jlb = new JLabel("華氏度:");
    private JLabel jlb1 = new JLabel("攝氏度:");
    private JLabel jlb2 = new JLabel();
    private JTextField jtf = new JTextField();
    private JButton jbut = new JButton("=");
    private JButton jbut1 = new JButton("EXIT");
    public MainFrame (){
        init();
    }
    private void init (){
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jlb.setBounds(100,100,100,50);
        jlb1.setBounds(800,100,100,50);
        jlb2.setBounds(900,100,100,50);
        jtf.setBounds(300,100,100,50);
        jbut.setBounds(500,100,100,50);
        jbut1.setBounds(450,300,100,50);

        this.add(jlb);
        this.add(jlb1);
        this.add(jlb2);
        this.add(jtf);
        this.add(jbut);
        this.add(jbut1);
        this.setLocation(300,300);
        this.setSize(1280,720);
        this.setLayout(null);

        jbut.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                jlb2.setText(Float.toString((Float.parseFloat(jtf.getText())*5/9f)+32));
            }
        });
                jbut1.addActionListener(new AbstractAction() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
                        dispose();
                    }
                });
    }
}
