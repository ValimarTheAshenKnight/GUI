import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by d.buetikofer on 08.03.2017.
 */

public class SchalterGUI extends Frame {
    Button on = new Button("On");
    Button off = new Button("Off");
    Label message = new Label("Der Schalter ist aus.");

    public SchalterGUI(){
        setTitle("Schalter");
        setSize(150,150);
        setResizable(false);
        setLayout(new BorderLayout());

        add(on, BorderLayout.NORTH);
        add(message, BorderLayout.CENTER);
        add(off, BorderLayout.SOUTH);

        on.addActionListener(event -> message.setText("Der Schalter ist ein."));
        off.addActionListener(event -> message.setText("Der Schalter ist aus."));

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
