package core;

import io.Input;
import io.Output;

public class Game{
	private final Board board = new Board();
	private final Players players = new Players();
	
	public void start() {
		Symbol winner = null;
		
		while(winner == null && !board.isFull()){
			
			Output.writeNewLine();
			Output.write(board);
			winner = play(players.next());
		}
		
		Output.write(board);
		
		if(winner == null && board.isFull()){
			Output.write("It's a draw!");
			return;
		}
		
		Output.write(String.format("'%s' won!", winner));
	}
	
	private Symbol play(Symbol symbol){
		while(true){
			try{
				String play = Input.read(String.format("'%s' play ==> ", symbol));
				Coord coord = Coord.parse(play);
				return board.update(symbol, coord);
			}catch(RuntimeException re){
				Output.write("ERROR: " + re);
			}
		}
	}
}