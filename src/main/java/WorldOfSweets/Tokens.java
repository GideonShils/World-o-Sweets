package WorldOfSweets;

public class Tokens{
    Token[] tokens;
    int num_tokens;
    int cur_position;
    
    public Tokens(int num_tokens){
	this.num_tokens = num_tokens;
	tokens = new Token[num_tokens];
	cur_position = 0; 
    }

    public boolean addToken(Token token){
	if(!(cur_position < num_tokens)){
	    return false;
	}
	tokens[cur_position++] = token;
	return true; 
    }
}
