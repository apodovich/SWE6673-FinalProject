package com.cict6thedition.RecursionAndDynamicProgramming.Q811Coins;

public class Tester {

	public static void main(String[] args) {
		for (int i = 0; i < 200; i++) {
			int[] denoms = {25, 10, 5, 1};
			int waysA = Question.makeChange(i, denoms);
			int waysB = QuestionB.makeChange(i, denoms);
			if (waysA != waysB) {
				System.out.println("Error: " + i + " : " + waysA + ", " + waysB);
			}
		}

	}

}
