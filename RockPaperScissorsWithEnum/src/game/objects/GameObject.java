package game.objects;

public enum GameObject {

	ROCK, PAPER, SCISSOR;

	private GameObject beats;
	static {
		ROCK.beats = SCISSOR;
		PAPER.beats = ROCK;
		SCISSOR.beats = PAPER;
	}
	public boolean beats(GameObject other) {
		return this.beats == other;
	}
	
	/*
	 * private String[][] compareText = {
	 * 
	 * { "Rock match Rock", "Rock gets Wrapped", "Rock smashes Scissor" }, {
	 * "Paper wrap stone", "Paper matches paper", "Paper get cuts" }, {
	 * "Scissors get smashed", "Scissors cuts paper", "Scissors matches Scissors" },
	 * };
	 */
	/*
	 * public String compareText(GameObject other) { return
	 * compareText[this.ordinal()][other.ordinal()]; }
	 */
}
