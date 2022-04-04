import java.util.*;

public class Intro {
	
	public static Stack<Integer> reverse_stack(Stack<Integer> stack){
		Collections.reverse(stack);
		return stack;
	}
	
	public static void exp_collections() {
//		System.out.println("Welcome to Collections");
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.pop();
		stack.push(4);
		
		Iterator s_iter = stack.iterator();
		while(s_iter.hasNext()) {
			System.out.println(s_iter.next());
		}
		System.out.println("Reversed stack is :-");
		Stack<Integer> rev_stack = reverse_stack(stack);
		
		Iterator<Integer> itr_rev_stack = rev_stack.iterator();
		while(itr_rev_stack.hasNext()) {
			System.out.println(itr_rev_stack.next());
		}
	}
	
	public static String[] get_splitted_input(String s) {
		String[] splitted_str = s.split(" ");
		return splitted_str;
	}
	
	public static void main(String args[]) {
//		System.out.println("Hello Sri Kalahasthi!");
//		exp_collections();
		
		
		
//		String Split
		
//		String s = "55 2 35 11 4 -1";
//		String[] splitted = get_splitted_input(s);
//		
//		for(String split : splitted) {
//			System.out.println(split);
//		}
		
//		TreeSet
		
		TreeSet<Integer> int_set = new TreeSet<Integer>();
		
		int_set.add(5);
		int_set.add(-1);
		int_set.add(220);
		int_set.add(5);
		int_set.add(0);
		
		Iterator<Integer> int_set_iter = int_set.iterator();
		while(int_set_iter.hasNext()) {
			System.out.println(int_set_iter.next());
		}
		
//		arr.get(index);
//		arr.indexOf(3);
				
		
	}
}
