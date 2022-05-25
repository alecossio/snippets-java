import java.util.Arrays;

public class Scoreboard {
    /*
    * numEntries: occupied size of the array (because actual array is not resizable)
    */
    private int numEntries = 0;
    /*
    * actual array
    */
    GameEntry[] board;
    /*
    * Constructor: will call constructor of dependency
    * creates an array of GameEntry elements of size capacity
    */
    public Scoreboard(int capacity){
        board = new GameEntry[capacity];
    }

    /*
    * add new score to the board method
    */
    public void add(GameEntry e){
        /*
        * store the numerical int value of the new score to add in a variable
        */
        int newScore = e.getScore();

        /*
        * (alloted size of the array is one thing, and number of entries (occupied size of the array) is another, because the actual array is not resizable)
        * 1) check if array is NOT  full (alloted size == actual size)
        * 2) check if new Score value is larger the last saved score (smallest) (new score will "bump off" another already saved score)
        * if any of these conditions is false (array is full, or score is smaller than the smallest currently saved) 
        *       => do NOT save the score (there's no room or it's just too small)
        */
        if(numEntries < board.length || newScore > board[numEntries-1].getScore()){

            /*
            * if there's still room in actual array (no "bump off" situation)
            *       => increase occupied size of array, because we're storing the new score
            */ 
            if(numEntries < board.length)
                numEntries++;
            
            /*
            * j = current loop index, initially index of last "occupied" entry
            */
            int j = numEntries -1;

            /*
            *   1) check if j>0 => we're not done with the whole array, there are still elements
            *   2) check if score of the element to the left of j (" j -1 ") is smaller than the new score
            */
            while(j>0 && board[j-1].getScore() < newScore) {
                
                /*
                *   shift element " j - 1 " to the right 1 place (overwriting element in the right)
                */
                board[j] = board[j - 1];

                /*
                *   go to check next element
                */
                j--;
            }

            /*
            * we're done shifting => found place for new score
            */
            board[j] = e;
        }
    }

    @Override
    public String toString() {
        return "Scoreboard [board=" + Arrays.toString(board) + "]";
    }
}
