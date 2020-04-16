package leetcode.week3;

import java.util.Stack;

public class ValidParenthesisString {

	public static void main(String[] args) {
		String s = "(()(())()())*((()(())))*()(*)()()(*((()((*(*))))()*()(()((()(*((()))*(((())(())))*))(()*))(()*)";
		System.out.println(validParenthesisString(s));
	}

	private static boolean validParenthesisString(String s) {
		Stack<Integer> s1 = new Stack<>();
		Stack<Integer> s2 = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(') {
				s1.push(i);
			} else if (s.charAt(i) == '*') {
				s2.push(i);
			} else if (s.charAt(i) == ')') {
				if (!s1.isEmpty()) {
					s1.pop();
				} else if (!s2.isEmpty()) {
					s2.pop();
				} else
					return false;
			}
		}

		while(!s1.isEmpty() && !s2.isEmpty()) {
			int a = s2.pop();
			if(s1.peek()<a)
				s1.pop();
		}
		return s1.isEmpty();
	}

}
