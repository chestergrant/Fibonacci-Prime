/**
 * @(#)PrimeFib.java
 *
 * PrimeFib application
 * Solution to problem 2
 *
 * @author Chester Grant 
 * @version 1.00 2010/10/9
 */
 
public class PrimeFib {
    //Function used to determine if a number is a prime number
    public static boolean isPrime(long num){
    	long end = num/2 + 1;
    	for(long i = 2; i< end; i++ ){
    		if(num %i == 0){
    			return false;
    		}
    	}
    	return true;
    }
    
    //Find the sum of the prime divisor of a number
    public static long findSumOfPrimeDivisors(long num){
    	long sum = 0; //Stores the sum
    		
        for(long i = 2; i<= num; i++){
        	//Only check for odd numbers
        	if(i % 2 != 0){
        		//Check if the number is a factor
        		if(num % i == 0){
        			//Check if the number is a prime
        			if(isPrime(i) ){
        				sum += i;
        			}
        		}
        	}
        }
        
        //Accounts for two being the only even prime
        if(num%2 ==0){
        	sum+=2;
        }
        return sum;
    }
    public static void main(String[] args) {
    	
    	//Variables used in Calculate Fibonacci
    	long first=1;
    	long second=1;
    	long third=0;
    	
    	//Determines if we found a fibonacci prime
    	boolean ans = false;
    	
    	while(!ans){
    		third = second + first;
    		first =second;
    		second = third;
    		
    		if(third > 227000){
    			
    			ans = isPrime(third);
    			    			
    		}
    	}
    	
    	//Find the sum of the prime divisors
    	third = findSumOfPrimeDivisors(third+1);
    	System.out.println("The answer to the second question is : "+third);
    }
}
