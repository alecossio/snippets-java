public class Main {
	public static void main(String[] args) {

		GameEntry[] gameEntries = new GameEntry[4];

		for(int i=0;i<gameEntries.length;i++){
			gameEntries[i] = new GameEntry();
			gameEntries[i].setScores(10);	
		}

		System.out.println("Printing gameEntries1");
		for(GameEntry i : gameEntries) {
			System.out.print(i.getScores() + "; ");
		}
		GameEntry[] gameEntries2 = gameEntries.clone();
		gameEntries2[1].setScores(500);
		System.out.println("Printing gameEntries1 element index 1 after modifying GameEntries2");
		System.out.println(gameEntries[1].getScores());
	
	}
}
