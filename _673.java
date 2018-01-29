package me.mukla.acm;

import java.util.Arrays;
import java.util.Scanner;

public class _673 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		for (int k = 0; k < n; k++) {

			String input = sc.nextLine();
			char[] arr = input.toCharArray();
			MyStack stack = new MyStack(arr.length);
			boolean isBalanced = true;
			if (arr.length % 2 != 0) {
				System.out.println("No");
				continue;
			}
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] == '(' || arr[i] == '[') {
					stack.push(arr[i]);

				} else if (arr[i] == ')' || arr[i] == ']') {
					char c = stack.pop();

					if (arr[i] == ')') {
						if (c != '(') {
							isBalanced = false;
							break;
						}
					} else {

						if (c != '[') {
							isBalanced = false;
							break;
						}
					}
				}

			}

			if (stack.peek() != '*') {

				isBalanced = false;
			}
			if (isBalanced) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
		sc.close();

	}

	static class MyStack {
		private char[] stackArray;
		private int stackSize;
		private int topOfStack = -1;

		public MyStack(int size) {
			stackSize = size;
			stackArray = new char[size];
			Arrays.fill(stackArray, '*');
		}

		public void push(char input) {
			if (topOfStack + 1 < stackSize) {
				topOfStack++;
				stackArray[topOfStack] = input;

			} else {
			}
		}

		public char pop() {
			if (topOfStack >= 0) {
				char r = stackArray[topOfStack];
				stackArray[topOfStack--] = '*';

				return r;
			} else {
				return '*';
			}
		}

		public char peek() {
			if (topOfStack >= 0) {
				return stackArray[topOfStack];
			} else {
				return '*';
			}
		}
	}
}
