/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uncheckedexception;
import java.util.Scanner;
import java.util.InputMismatchException;
/**
 *
 * @author Kareem_29
 */
public class UncheckedException {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, d, q;
        boolean cont=true;
        while(cont=true){
        try {
            System.out.print("Numerator: ");
            n = input.nextInt();
            System.out.print("Denominator: ");
            d = input.nextInt();
            q = n / d;
            System.out.println("Quotient: " + q);
            cont=false;
            break;
        } catch (ArithmeticException e) {
            System.out.println("Error: You cannot divide by zero.");
        } catch (InputMismatchException e) {
            System.out.println("Error: That is not numeric value.");
            input.next();
        } finally {
            System.out.println("This is always executed.");
        }
    }
    }  
   
        // TODO code application logic here
    }

