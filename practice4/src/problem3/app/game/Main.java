package problem3.app.game;

import problem3.model.game.App;
import problem3.model.game.LogicGame;
import problem3.model.game.MemoryGame;

public class Main {

	public static void main(String[] args) {
		LogicGame logicalGame = new LogicGame();
		MemoryGame memorygGame = new MemoryGame();
		App app = new App();
		app.getStatistics(memorygGame);
		app.getStatistics(logicalGame);
	}

}
