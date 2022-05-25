import java.util.Arrays;

public class Scoreboard {
    @Override
    public String toString() {
        return "Scoreboard [board=" + Arrays.toString(board) + "]";
    }

    private int numEntries = 0;
    GameEntry[] board;

    public Scoreboard(int capacity){
        board = new GameEntry[capacity];
    }

    public void add(GameEntry e){
        int newScore = e.getScore();
        if(numEntries < board.length || newScore > board[numEntries-1].getScore()){
            if(numEntries < board.length)
                numEntries++;
            int j = numEntries -1;
            while(j>0 && board[j-1].getScore() < newScore) {
                board[j] = board[j - 1];
                j--;
            }
            board[j] = e;
        }
    }
}
