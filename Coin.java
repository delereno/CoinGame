
/**
 * Creates a coin object
 *
 * @author Del Huang
 * @version 23/02/21
 */
public class Coin
{
    // fields
    private final int HEADS = 0; //tails = 1
    private int face; //Current side showing
    
    /*
     * Setup this coin by flipping it initially
     */
    public Coin()
    {
        
    }
    /*
     * Flip this coin by randomly choosing a face value
     */
    public void flip(){
    face = (int) (Math.random() * 2);
    }
    
    /**
     * @return boolean returns True if current face of the coin is heads
     */
    public boolean isHeads()
    {
        return (face == HEADS);
    }
    
    /**
     * @return String Returns the current face of this coin as a String
     */
    public String toString()
    {
        return(face == HEADS) ? "Heads":"Tails";
    }
}
