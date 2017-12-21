# World of Sweets 0.1

##### "Similar to, but legally distinct from Candyland -  10/10" - *New York Review of Games*
 
## How to play

Initiate the game through gradle with the run command:

```
gradle run
```

## Gameplay & Game Modes:

This game supports 2-4 players, all of which can be either human or AI.

Players take turns drawing cards from a deck and moving their token to the apporpriate space on the board. The majority of the spaces contain simple colors, but there are also a number of special spaces which can only be reached by drawing certain cards. The first player to reach the last square on the board wins the game.

### Classic mode:

In classic mode, gameplay is simple. There are two types of regular cards: singles and doubles:

1. Singles: The player moves their token to the next space with same color as the card.
2. Doubles: The player moves their token two spaces of that color forward.

There are also a number of special cards:

1. Skips: The player misses their turn.
2. Move to X: The player moves to the specified "special" space on the board.


### Strategic mode:

In strategic mode, boomerangs are introduced. On each turn, a player can choose to use a boomerang on another player which sends that player backwards in the same way that the player would usually move forwards. For example, if player 1 chooses to use a boomerang on player 3 and draws a double red card, player 3 will move backwards two red spaces instead of player 1 moving forwards two red spaces. If the boomeranged player cannot move back any further, they return to the start square.

Each player begins the game with three boomerangs.


## Extra features:

This game also includes a few extra features:

1. "Dad" cheat: If a player enters their name as "Dad", the game will automatically deliver the worst possible card in the deck during each of that player's turns.

2. AI mode: At the player selection stage, any player can be set to AI, meaning they will play every turn automatically.

3. Saving / Loading: You can save or load the game in an incorruptible file which remembers the current game state.

4. Play for me button: Even if a player is human rather than AI, they can choose the "play for me" button during each turn to avoid selecting whether to use a boomerang, drawing a card, and moving their token.