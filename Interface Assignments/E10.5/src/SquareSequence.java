public class SquareSequence implements Sequence {
    
    int n;
    public SquareSequence(){
        this.n = n;
    }
    public int next(){
        n++;
        return n*n;
    }
}
