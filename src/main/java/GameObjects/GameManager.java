package WorldOfSweets;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.BorderFactory;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.Container;

public class GameManager{
    private JPanel[] array;
    private CardPanel card_panel;
    private Token[] tokens;
    private int current_player;
    private JLabel end;
    private GameState gameState;

    public GameManager(JPanel[] array, CardPanel card_panel, Token[] tokens, JLabel end, GameState gs){
  gameState = gs;
	this.array = array;
	this.card_panel = card_panel;
	this.tokens = tokens;
	this.current_player = 0;
	this.end = end;
    }

    public void findNext(Color color, int current_pos, int times){

	if(times < 3){
	    int pos = -1;
	    int j = 0;
	    for(int i = 0; i < times; i++){
		for(j = current_pos+1; j < array.length; j++){
		    if(array[j].getBackground().equals(color)){
			pos = j;
			current_pos = j;
			break;
		    }
		}
		if(j == array.length){
		    tokens[current_player].setPosition(pos);
		    endGame();
		}
	    }
	    if(j != array.length){
		tokens[current_player].setPosition(pos);
		array[pos].setBorder(BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0,0,0)));
		array[pos].addMouseListener(new PositionListener(current_pos, pos));
	    }
	}
	else if(times == 4){
	    tokens[current_player].setPosition(18);
	    array[18].setBorder(BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0,0,0)));
	    array[18].addMouseListener(new PositionListener(current_pos, 18));
	}
	else{
	    JOptionPane.showMessageDialog(null, "Your turn was skipped!","", JOptionPane.WARNING_MESSAGE);
	}

    }

    public void turn(){
	current_player = gameState.returnCurrPlayer() - 1;
	findNext(card_panel.getCardColor(), tokens[current_player].getPosition(), card_panel.getType());
    }

    private class PositionListener implements MouseListener{
	private int previous, next;
	private PositionListener(int previous, int next){
	    this.previous = previous;
	    this.next = next;
	}
	public void mousePressed(MouseEvent e) {

	}

	public void mouseReleased(MouseEvent e) {

	}

	public void mouseEntered(MouseEvent e) {

	}

	public void mouseExited(MouseEvent e) {

	}

	public void mouseClicked(MouseEvent e) {
	    if(e.getSource().getClass().equals(array[0].getClass())){
		((JPanel) e.getSource()).setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
		Container parent = tokens[current_player].getLabel().getParent();
		parent.remove(tokens[current_player].getLabel());
		parent.validate();
		parent.repaint();
		array[next].add(tokens[current_player].getLabel());
	    }
	    if(e.getSource().getClass().equals(end.getClass())){
	       	JOptionPane.showMessageDialog(null, "Player " + (current_player+1) + " won the game!");
		System.exit(0);
	    }
	}
    }

    public void endGame(){
	end.setBorder(BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0,0,0)));
	end.addMouseListener(new PositionListener(0, 0));
    }
}
