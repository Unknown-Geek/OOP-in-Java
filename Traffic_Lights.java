
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class  Traffic_Lights {
    public static void main(String[] args){
        new traffic();
    }
}
class light extends JPanel{
    private String sel = "";
    public void selectedlight(String light){
        sel =light;
        repaint();
    } 
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        setBackground(Color.BLACK);

        g.setColor(sel.equals("Red")?Color.RED:Color.GRAY);
        g.fillOval(100,30,140,140);

        g.setColor(sel.equals("Yellow")?Color.YELLOW:Color.GRAY);
        g.fillOval(100,200,140,140);

        g.setColor(sel.equals("Green")?Color.GREEN:Color.GRAY);
        g.fillOval(100,370,140,140);
    } 
}
class traffic extends JFrame implements ActionListener{
    private JButton[] radio = new JButton[3];
    private light lightpanel;
    public traffic(){
        setTitle("Traffic");
        setSize(400,550);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        lightpanel = new light();
        add(lightpanel,BorderLayout.CENTER);

        JPanel buttonpanle = new JPanel();
        buttonpanle.setLayout(new GridLayout(3,2));

        radio[0] = new JButton("Red");
        radio[1] = new JButton("Yellow");
        radio[2] = new JButton("Green");

        ButtonGroup group = new ButtonGroup();
        

        for(int i =0;i<3;i++){
            group.add(radio[i]);
            radio[i].addActionListener(this);
            buttonpanle.add(radio[i]);
        }
        add(buttonpanle,BorderLayout.EAST);

        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == radio[0]){
            lightpanel.selectedlight("Red");
        }
        else if(e.getSource() == radio[1]){
            lightpanel.selectedlight("Yellow");
        }
        else if(e.getSource() == radio[2]){
            lightpanel.selectedlight("Green");
        }
    }

}