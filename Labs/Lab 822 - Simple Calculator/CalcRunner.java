
/**
 * Write a description of class CalcRunner here.
 *
 * @author Dylan Pratt
 * @version 822 */
public class CalcRunner
{
    // instance variables - replace the example below with your own
    public static void main(){
    SimpleCalc output = new SimpleCalc(); //initializes the SimpleCalc class
    System.out.println(output.add(6,5)); //does the add method
    System.out.println(output.subtract(6,5)); //does the subtract method
    System.out.println(output.multiply(6,5)); //does the multiply method
    System.out.println(output.divide(6,5)); //does the divide method
    System.out.println(output.moduloDivide(6,5)); //does the mod method
    }
}
