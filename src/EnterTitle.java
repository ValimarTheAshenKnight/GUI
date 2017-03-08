/**
 * Created by d.buetikofer on 08.03.2017.
 */
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class EnterTitle extends Frame {

    Button ok = new Button("OK");
    TextField input = new TextField();

    public EnterTitle(){

        setTitle("Enter Title");
        setSize(400,200);

        ok.addActionListener(event-> setTitle(input.getText()));

        setLayout(new BorderLayout());
        add(ok, BorderLayout.SOUTH);
        add(input, BorderLayout.NORTH);

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
