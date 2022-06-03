public class UnorderedScoreboard extends Scoreboard{
    public UnorderedScoreboard(int capacity){
        super(capacity);
    }
    
    public void add(GameEntry e){
        if(this.numEntries < board.length){
            board[numEntries] = e;
            numEntries++;
        }
    }
}
