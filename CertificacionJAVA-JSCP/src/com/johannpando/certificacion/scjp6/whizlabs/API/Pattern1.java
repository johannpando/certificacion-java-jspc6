package com.johannpando.certificacion.scjp6.whizlabs.API;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pattern1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Método compile: Compiles the given regular expression into a pattern
		Pattern p = Pattern.compile("My");
		// Método matcher: Creates a matcher that will match the given input
		// against this pattern.
		Matcher m = p.matcher("My dad And My mom");

		StringBuffer s = new StringBuffer();
		// Método find: Attempts to find the next subsequence of the input
		// sequence that matches the pattern.
		boolean found = m.find();

		while (found) {
			// Método appendReplacement: appends everything up to the next match
			// and the replacement for that match.
			m.appendReplacement(s, "Our");
			found = m.find();
		}
		// método appendTail: reads characters from the input sequence, starting
		// at the append position, and appends them to the given string buffer.
		// It is intented to be invoked after one or more invocations of the
		// appendReplacement() method in order to copy the remainder of the
		// input sequence.
		m.appendTail(s);
		System.out.println(s);
	}

}
