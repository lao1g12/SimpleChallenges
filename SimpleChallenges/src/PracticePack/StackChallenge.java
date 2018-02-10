package PracticePack;

import java.util.ArrayList;

public class StackChallenge {
	
	/* This method takes an input of a String, the string is a list of numbers or commands.
	 * The possible "commands" are DUP which means duplicate the value at the top of the stack. POP which removes the top value of the stack. + adds the two top values of the stack.
	 * - removes the second from the top of the stack from the value at the top of the stack. If a number is present then it is placed on to the stack.
	 * The result is the final value at the top of the stack after all the commands are completed. The method fails if there are not enough values to complete an operation or the
	 * stack is empty.
	 */
	
    public static int solution(String S) {
	String[] split = S.split("\\s+");
	ArrayList<Integer> stack = new ArrayList<Integer>();
	for(String action : split) {
		if(action.equals("DUP")) {
			int size = stack.size();
			if(size < 1) {
				return -1;
			}else {
				int number = stack.get(size-1);
				stack.add(number);
				continue;
				
			}
		}
		if(action.equals("POP")) {
			int size = stack.size();
			if(size < 1) {
				return -1;
			}else {
				stack.remove(size-1);
				continue;
			}
		}
		if(action.equals("+")) {
			int size = stack.size();
			if(size < 2) {
					return -1;
				}else {	
					int number1 = stack.get(size-1);
					int number2 = stack.get(size-2);
					stack.remove(size-1);
					stack.remove(size-2);
					stack.add(number1+number2);
					continue;
				}
		}
		if(action.equals("-")) {
			int size = stack.size();
			if(size < 2) {
					return -1;
				}else {	
					int number1 = stack.get(size-1);
					int number2 = stack.get(size-2);
					stack.remove(size-1);
					stack.remove(size-2);
					int number3 = number1-number2;
					if(number3 > 0) {
						stack.add(number3);
						continue;
					}else {
						return -1;
					}
					
				}
		}
		
		stack.add(Integer.parseInt(action));	
	}
	int size = stack.size();
	return stack.get(size-1);
	
    }
    public static void main(String[] args) {
		
		System.out.println(solution("10 3 DUP 4 - + POP"));
	}
}

