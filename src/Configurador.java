import javax.swing.*;
import java.awt.*;

public class Configurador extends JFrame {

    private JScrollBar scrollBarRed, scrollBarGreen, scrollBarBlue;
    private JPanel panelColor, panelScrollBars;

    public Configurador(){

        setTitle("Definir color con JScrollBar");
        pack();
        setSize(550, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        setLayout(new BoxLayout(getContentPane(), BoxLayout.X_AXIS));

        panelColor = new JPanel();
        panelColor.setBackground(new Color(0, 0, 0));

        panelScrollBars = new JPanel();
        panelScrollBars.setLayout(new BoxLayout(panelScrollBars, BoxLayout.X_AXIS));
        panelScrollBars.setBounds(0, 0, 200, 400);
        panelScrollBars.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        scrollBarRed = new JScrollBar(JScrollBar.VERTICAL, 0, 10, 0, 255);
        scrollBarGreen = new JScrollBar(JScrollBar.VERTICAL, 0, 10, 0, 255);
        scrollBarBlue = new JScrollBar(JScrollBar.VERTICAL, 0, 10, 0, 255);

        scrollBarRed.setBounds(10, 10, 20, 200);
        scrollBarGreen.setBounds(40, 10, 20, 200);
        scrollBarBlue.setBounds(60, 10, 20, 200);

        scrollBarRed.setBackground(Color.RED);
        scrollBarGreen.setBackground(Color.GREEN);
        scrollBarBlue.setBackground(Color.BLUE);

        panelScrollBars.add(scrollBarRed);
        panelScrollBars.add(Box.createHorizontalStrut(15));
        panelScrollBars.add(scrollBarGreen);
        panelScrollBars.add(Box.createHorizontalStrut(15));
        panelScrollBars.add(scrollBarBlue);

        add(panelScrollBars);
        add(panelColor);


        scrollBarRed.addAdjustmentListener(e -> {
            panelColor.setBackground(new Color(scrollBarRed.getValue(), scrollBarGreen.getValue(), scrollBarBlue.getValue()));
        });

        scrollBarGreen.addAdjustmentListener(e -> {
            panelColor.setBackground(new Color(scrollBarRed.getValue(), scrollBarGreen.getValue(), scrollBarBlue.getValue()));
        });

        scrollBarBlue.addAdjustmentListener(e -> {
            panelColor.setBackground(new Color(scrollBarRed.getValue(), scrollBarGreen.getValue(), scrollBarBlue.getValue()));
        });


    }
}
