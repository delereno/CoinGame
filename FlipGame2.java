
/**
 * Write a description of class FlipGame2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FlipGame2
{
    public static void main(String[] args){
    int c1 = 0, c2 = 0, p1=0, p2=0, f1=0, f2=0;
    
    Coin myCoin1 = new Coin();
    Coin myCoin2 = new Coin();
    while(c1 <= 3 && c2 <= 3){
    myCoin1.flip();
    myCoin2.flip();
    if(myCoin1.isHeads()){
    f1=0;
    }
    else{
    f2=1;
    }
    if(myCoin1.isHeads()){
    f2=0;
    }
    else{
    f2=1;
    }
    if(f1==p1){
    c1++;
    }
    if(f2==p2){
    c2++;
    }
    }
    if(c1==3){
    System.out.println("Coin 1 has won!");
    }
    if(c2==3){
    System.out.println("Coin 2 has won!");
    }
}
}
