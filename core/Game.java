package core;

public class Game{
	private final Board board = new Board();
	private final Players players = new Players();
	
	public void start() {
		System.out.println("Game started!");
		
		System.out.println(players.next());
		System.out.println(players.next());
		System.out.println(players.next());
		System.out.println(players.next());
	}
}