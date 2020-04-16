package leetcode.week2;

import java.util.Scanner;
import java.util.Stack;

public class BackSpaceStringCompare {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			String s1 = sc.next();
			String s2 = sc.next();
			String s = getString(s1);
			String t = getString(s2);
			if(s.equals(t))
				System.out.println("same");
			else
				System.out.println("not same");
		} catch (Exception e) {
			return;
		} finally {
			sc.close();
		}
	}

	private static String getString(String s1) {
		Stack<Character> s = new Stack<>();
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) == '#') {
				if (s.size() > 0)
					s.pop();
			} else
				s.push(s1.charAt(i));
		}
		StringBuilder sb = new StringBuilder();
		for (char c : s) {
			sb.append(c);
		}
		return sb.toString();
	}

}
