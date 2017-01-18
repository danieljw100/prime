/*
 * Created on 10-Oct-2005
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */

/**
 * @author Dan
 *
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
public class Prime {

    public Prime(int primes){
        for(int i = 1; i <= primes; i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }

    public boolean isPrime(int i){
        boolean isPrime = true;
        for(int j = 2; j < i; j++){
            if(isDivisibleBy(i,j)){
                isPrime = false;
            }
        }
        return isPrime;
    }

    public boolean isDivisibleBy(int i, int j){
        boolean isDivisibleBy = false;
        double result = ((new Double(i)).doubleValue())/((new Double(j)).doubleValue());
        //System.out.println(i + " / " + j + " = " + result);
        double roundedResult = (new Double(Math.round(result))).doubleValue();
        //System.out.println(roundedResult + " = roundedResult");
        if(result == roundedResult){
            //System.out.println(i + " is divisible by " + j);
            isDivisibleBy = true;
        }
        return isDivisibleBy;
    }

    //The arguments are all integers
    public static void main(String[] args){
        Prime prime = new Prime(1000);
    }
}
