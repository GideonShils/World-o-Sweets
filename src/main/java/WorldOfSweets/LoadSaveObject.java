package WorldOfSweets;

import GameObjects.*;
import java.io.Serializable;
import javax.swing.*;

public class LoadSaveObject implements Serializable{
	

    public CardPanel card_panel;
    public DeckManager dm;
    public int num_players;
    public Token[] tokens;
    public Token current_token;
    public GameManager gm;
    public GameState gs;
    public long tstart;

	public LoadSaveObject(){

	}
}