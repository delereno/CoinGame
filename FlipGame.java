
/**
 * Driver class that flips a coin multiple times 
 *andcounts the number of heads and tails that result.
 * 
 * @author Del Huang
 * @version 23/02/21
 */
public class FlipGame
{
    public static void main (String[] args){
        final int FLIPS = 1000000;
        int heads = 0, tails = 0;
        
        // Make a coin instance
        Coin myCoin = new Coin();
        
        // Flip the coin n times and tally the result
        for (int count = 1; count <= FLIPS; count++)
        {
            myCoin.flip();
            
            // Check face result
            if (myCoin.isHeads()) 
                heads++;
            else 
                tails++;
        }
        
        // Print Result
        System.out.println("Number of flips: " + FLIPS);
        System.out.println("Number of heads: " + heads);
        System.out.println("Number of tails: " + tails);
    }
}
