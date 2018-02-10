package PracticePack;

import java.util.ArrayList;
import java.util.Collections;

public class NumberChallenge {
	
	//This challenge is to write a simple solution to return the lowest value which is not mentioned in the list
	
	public static int solution(int[] A) {
	       int count = 1;
	        ArrayList<Integer> newList = new ArrayList<Integer>();
	        for(int value:A){
	            newList.add(value);
	        }
	        Collections.sort(newList);
	        for(int value:newList){
	         if(value > 0){
	            if (value == count){
	            count += 1;
	            }
	            }
	            }
	        
	        return count;
    }
	
public static void main(String[] args) {
	
	
	int[] numbers = {1, 3, 3};
	System.out.println(solution(numbers));
	
	
}
}
