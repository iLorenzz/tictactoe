package core;

import java.util.ArrayList;

public class Players{
	private final ArrayList<Symbol> players = new ArrayList<>(2);
	private int currentPlayerIndex = -1;
	
	public Players(){
		players.add(Symbol.X);
		players.add(Symbol.O);
	}
	
	//uso de lista circular
	public Symbol next(){
		currentPlayerIndex = (currentPlayerIndex + 1) % players.size();
		return players.get(currentPlayerIndex);
	}
}