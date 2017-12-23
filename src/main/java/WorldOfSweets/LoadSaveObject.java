package WorldOfSweets;

import GameObjects.*;
import java.io.Serializable;

public class LoadSaveObject implements Serializable {

    public CardPanel cardPanel;
    public DeckManager dm;
    public int numPlayers;
    public Token[] tokens;
    public Token currentToken;
    public GameManager gm;
    public GameState gs;
    public long timeElapsed;
    public long oldTimeElapsed;

    public LoadSaveObject() {

    }
}