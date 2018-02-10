package PracticePack;

public class FizzBuzz {
	/*This challenge is the well known FizzBuzz, where in this scenario all multiples of 3 are replaced with Fizz, 5 are replaced with Buzz, and 7 are replaced with Woof.
	 If it is a multiple of both, then it is a combination of the two/three. N is a value entered, the method then outputs all numbers up to N with the relevant FizzBuzz 
	 replacements
	 */
	
	   public static void solution(int N) {
		   
		   for(int i=1; i<N; i++) {
			   if( (i%3) == 0) {
				   if((i%5) == 0) {
					   if((i%7) ==0 ) {
						   System.out.println("FizzBuzzWoof");
					   }else {
						   System.out.println("FizzBuzz");
					   }
				   }else {
					   if((i%7) == 0) {
						   System.out.println("FizzWoof");
					   }else {
						   System.out.println("Woof");
					   }
				   }
			   }else {
				   if((i%5) == 0) {
					   if((i%7) == 0) {
						   System.out.println("BuzzWoof");
					   }else {
						   System.out.println("Buzz");
					   }
				   }else {
					   if((i%7) == 0) {
						   System.out.println("Woof");
					   }else {
						   System.out.println(i);
					   }
				   }
			   }
		   }
	    }
	   
	   

}
