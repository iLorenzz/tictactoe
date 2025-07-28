package core;

import io.Input;
import io.Output;

public class Game{
	private final Board board = new Board();
	private final Players players = new Players();
	
	public void start() {
		while(true){
			Output.writeNewLine();
			Output.write(board);
			play(players.next());
		}
	}
	
	private void play(Symbol symbol){
		while(true){
			try{
				String play = Input.read(String.format("'%s' play ==> ", symbol));
				Coord coord = Coord.parse(play);
				board.update(symbol, coord);
				break;
			}catch(RuntimeException re){
				Output.write("ERROR: " + re);
			}
		}
	}
}