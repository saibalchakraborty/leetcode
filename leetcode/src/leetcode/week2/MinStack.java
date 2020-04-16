package leetcode.week2;

import java.util.Stack;

public class MinStack {

	private Stack<Integer> s = new Stack<>();
	private static int min = 0;
	

	public void push(int x) {
		if(s.size()==0) {
			min = x;
			s.push(x);
		}
		else {
			if(x<min) {
				s.push(2*x - min);
				min = x;
			}
			else {
				s.push(x);
			}
		}
	}

	public void pop() {
		if(s.size()>0) {
			int t = s.pop();
			if(t<min)
				min = 2*min -t;
		}
	}

	public int top() {
		
		return s.peek();
	}

	public int getMin() {

		return min;
	}

	public static void main(String[] args) {
		MinStack obj = new MinStack();
		obj.push(-2);
		obj.push(0);
		obj.push(-3);
		obj.pop();
		System.out.println(obj.top());
		System.out.println(obj.getMin());
	}

}
