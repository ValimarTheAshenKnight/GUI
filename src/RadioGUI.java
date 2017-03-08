/**
 * Created by d.buetikofer on 08.03.2017.
 */
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class RadioGUI extends Frame{

    Button fm = new Button("FM");
    Button mw = new Button("MW");
    Button lw = new Button("LW");
    Button scan = new Button("Scan");
    Label band = new Label("Band:");

    Panel radioButtons = new Panel();

    public RadioGUI(){
        setTitle("Radio");
        setSize(300,120);
        setLayout(new BorderLayout(20,15));
        setResizable(false);
        radioButtons.setLayout(new GridLayout(1,2));

        radioButtons.add(fm);
        radioButtons.add(mw);
        radioButtons.add(lw);

        add(radioButtons, BorderLayout.CENTER);
        add(band, BorderLayout.NORTH);
        add(scan, BorderLayout.SOUTH);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent windowEvent) {
                dispose();
                System.exit(0);
            }
        });
        setVisible(true);
    }
}
