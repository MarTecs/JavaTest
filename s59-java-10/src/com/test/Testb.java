package com.test;

import java.util.Stack;

public class Testb {
	public static void main(String[] args) {

		String s = "()";
		Stack<String> stack = new Stack<String>();

		for (int i = 0; i < s.length(); i++) {
			if ((s.charAt(i) + "").equals("(")) {
				stack.push("(");
			}

			if ((s.charAt(i) + "").equals(")")) {
				if(stack.size()==0){
					System.out.println(false);
					return ;
				}
				stack.pop();
			}
		}
		

		if(stack.size()==0){
			System.out.println(true);
		}else{
			System.out.println(false);
		}
		
		

	}

}
