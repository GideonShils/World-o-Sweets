package WorldOfSweets;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color; 
public class Token{
    int current_position;
    JLabel label;
    ImageIcon icon;

    public Token(String file, JLabel label){
	current_position = 0;
	this.label = label;
	this.icon = new ImageIcon(getClass().getResource(file));
	label.setIcon(icon);
    }

    public JLabel getLabel(){
	return label;
    }
}
