package WorldOfSweets;

import GameObjects.*;
import java.io.Serializable;
import javax.swing.*;

public class LoadSaveObject implements Serializable{
	
    public DeckManager dm;
    public GameState gameState;
    public int num_players;
    public Token[] tokens;
    public Token current_token;
    public JPanel[] positions;

	public LoadSaveObject(){

	}
}