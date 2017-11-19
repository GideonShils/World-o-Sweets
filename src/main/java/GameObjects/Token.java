package GameObjects;

import javax.swing.JLabel;
import java.io.Serializable;

public class Token implements Serializable {
    int current_position;
    JLabel label; 

    public Token(JLabel label) {
        current_position = 0;
        this.label = label; 
    }

    public int getPosition() {
	    return current_position;	
    }

    public void setPosition(int new_position) {
	    current_position = new_position; 
    }

    public JLabel getLabel() {
	    return label;
    }

    public void setLabel(JLabel label) {
	    this.label = label;
    }
}
