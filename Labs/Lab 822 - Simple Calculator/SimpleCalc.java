
/**
 * Write a description of class SimpleCalc here.
 *
 * @author Dylan C. Pratt
 * @version 822
 */
public class SimpleCalc
{
    // instance variables - replace the example below with your own
    private int divNumb; //creates a variable for use in the division method
    /**
     * Constructor for objects of class SimpleCalc
     */
    public SimpleCalc(){
    }
    //adds 2 ints
    public double add(int x, int y){
        return x+y;
    }
    //subtratcs 2 ints
    public double subtract(int x, int y){
        return x-y;
    }
    //multiplies 2 ints
    public double multiply(int x, int y){
        return x*/**this is to annoy Guy Daniel Wilks*/y;
    }
    //divides 2 ints
    public double divide(int x, int y){
        if (y!=0){
            divNumb = x/y;
        }
        return divNumb;
    }
    //mod divides 2 ints
    public int moduloDivide(int x, int y){
        return x%y;
    }
}
