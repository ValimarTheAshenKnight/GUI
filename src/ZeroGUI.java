/**
 * Created by d.buetikofer on 07.03.2017.
 */
import java.awt.*;

public class ZeroGUI extends Frame {

    Button cancel = new Button("Abbruch");
    Button ok = new Button("OK");
    Button help = new Button("Hilfe");
    TextArea nothing = new TextArea("Dieses Programm macht nichts!\nCopyright (c) 2009\nZerosoft AG", 3,1, TextArea.SCROLLBARS_NONE);

    Panel buttonPanel = new Panel();

    public ZeroGUI(){

        setTitle("Zero");
        setSize(300, 100);
        setLayout(new BorderLayout());
        setResizable(false);

        nothing.setEditable(false);

        buttonPanel.setLayout(new GridLayout(1,2));
        buttonPanel.add(cancel);
        buttonPanel.add(ok);
        buttonPanel.add(help);

        add(nothing, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);

        setVisible(true);


    }
}
